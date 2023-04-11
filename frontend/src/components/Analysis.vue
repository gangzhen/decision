<template>
    <div class="submit_button">
        <el-button type="primary" @click="submitAnswers">提交</el-button>
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
            isFinished: true
        }
    },
    methods: {
        // 判断存在且合规数字
        isExistAndNumberLegal(number) {
            return number && typeof number === 'number';
        },
        // 判断再Code列表中
        isLegalCode(code) {
            return this.$codeArr.includes(code);
        },
        // 判断存在且合规字符串
        isExistAndStringLegal(code) {
            return code && code.trim() !== '' && typeof code === 'string' && this.isLegalCode(code);
        },
        // 判断所有题目已回答选择完毕
        isAllTopicsSelected() {
            for (let answer of this.answers) {
                let condition = true;
                // 判断 index 、 possibility 、 severity 和 controllability 是否都不为空且是数字
                condition = this.isExistAndStringLegal(answer.code) &&
                    this.isExistAndNumberLegal(answer.index) &&
                    this.isExistAndNumberLegal(answer.possibility) &&
                    this.isExistAndNumberLegal(answer.severity) &&
                    this.isExistAndNumberLegal(answer.controllability);
                if (!condition) {
                    this.isFinished = false;
                    break;
                }
            }
        },
        // 提交分析分数
        submitAnswers() {
            this.isAllTopicsSelected();
            if (this.isFinished) {
                // 调用后端接口查询
                this.$http.post("/analysis/decision", this.answers).then(res => {
                    console.log(res)
                    console.log('响应成功')
                    // this.resultData = res.records
                    //TODO 调用后端接口成功后弹窗提示成绩，并关闭窗口是清空选择项
                })
            } else {
                //TODO 弹窗提示未填写完毕
                console.log('没填完成')
            }
        }
    }
}
</script>

<style scoped>

</style>