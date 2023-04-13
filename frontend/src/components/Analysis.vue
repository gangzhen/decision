<template>
    <div class="submit_button">
        <el-button type="primary" @click="submitAnswers">提交</el-button>

        <el-dialog title="结果展示" :visible.sync="dialogVisible" width="30%" :before-close="closeDialog" :center="true">

            <table>
                <thead>
                <tr>
                    <th>序号</th>
                    <th>风险规则</th>
                    <th>得分</th>
                    <th>详情</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="item in resultTable">
                    <td>{{ item.index }}</td>
                    <td>{{ item.name }}</td>
                    <td>{{ item.score }}</td>
                    <td>{{ item.detail }}</td>
                </tr>
                </tbody>
            </table>

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
            dialogVisible: false,
            resultTable: []
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
                    if (res.status === 200) {
                        //调用后端接口成功后弹窗提示成绩，并关闭窗口是清空选择项
                        this.resultTable = res.resultList;
                        this.dialogVisible = true;
                    }
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
table {
    width: 95%; /* 宽度100% */
    table-layout: auto; /* 固定列宽 */
    border-collapse: collapse; /* 合并边框 */
    margin: auto; /* 居中 */
}

th, td {
    border: 1px solid black; /* 添加边框 */
    text-align: center; /* 文本居中 */
}

</style>