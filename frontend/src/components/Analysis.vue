<template>
    <div class="submit_button">
        <el-button type="primary" @click="submitAnswers">提交</el-button>

        <el-dialog title="提示" :visible.sync="dialogVisible" width="30%" :before-close="handleClose">
            <span>恭喜你，合格了！</span>
            <span slot="footer" class="dialog-footer">
                <el-button type="primary" @click="closeDialog">关 闭</el-button>
            </span>
        </el-dialog>
    </div>
</template>

<script>
export default {
    name: "Analysis",
    props: {
        answers: {
            type: Array,
            default: () => []
        }
    },
    data() {
        return {
            isFinished: true,
            dialogVisible: false
        }
    },
    methods: {
        // 判断存在且合规数字
        isExistAndNumberLegal(number) {
            return number && typeof number === 'number';
        },
        // 判断再Code列表中
        isLegalCode(code) {
            return this.$riskCodes.includes(code);
        },
        // 判断存在且合规字符串
        isExistAndStringLegal(code) {
            return code && code.trim() !== '' && typeof code === 'string' && this.isLegalCode(code);
        },
        // 判断所有题目已回答选择完毕
        isAllRisksSelected() {
            this.isFinished = true;
            for (let answer of this.answers) {
                // 判断 index 、 possibility 、 severity 和 controllability 是否都不为空且是数字
                this.isFinished = this.isExistAndStringLegal(answer.code) &&
                    this.isExistAndNumberLegal(answer.index) &&
                    this.isExistAndNumberLegal(answer.possibility) &&
                    this.isExistAndNumberLegal(answer.severity) &&
                    this.isExistAndNumberLegal(answer.controllability);
                if (!this.isFinished) {
                    break;
                }
            }
        },
        // 提交分析分数
        submitAnswers() {
            this.isAllRisksSelected();
            if (this.isFinished) {
                // 调用后端接口查询
                this.$http.post("/analysis/decision", this.answers).then(res => {
                    console.log(res)
                    console.log('响应成功')
                    // this.resultData = res.records
                    this.dialogVisible = true;
                    //TODO 调用后端接口成功后弹窗提示成绩，并关闭窗口是清空选择项
                })
            } else {
                // 弹窗提示未填写完毕
                this.$message({
                    message: '警告，题目未全部选择，请确认',
                    type: 'warning'
                });
            }
        },
        // 关闭弹窗
        closeDialog() {
            this.dialogVisible = false;
            this.$emit('clear-selection', true);
        }
    }
}
</script>

<style scoped>

</style>