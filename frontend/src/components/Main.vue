<template>
    <div>
        <div v-for="(risk, num) in $risks">
            <Risks v-bind:num="num" v-bind:risk="risk"></Risks>
            <Selections v-bind:index="risk.index" v-bind:code="risk.code"
                        v-on:send-selection="receiveSelection"></Selections>
        </div>
        <Analysis v-bind:answers="answers" v-on:clear-selection="clearSelection"></Analysis>
    </div>

</template>

<script>
// @ is an alias to /src
import Risks from '@/components/Risks.vue'
import Selections from '@/components/Selections.vue'
import Analysis from '@/components/Analysis.vue'

export default {
    name: "Main",
    components: {
        Risks, Selections, Analysis
    },
    data() {
        return {
            answers: [],
        }
    },
    created() {
        this.initArray();
    },
    methods: {
        // 初始化回答的答案数组
        initArray() {
            this.answers = [];
            this.$risks.forEach(risk => {
                let item = {
                    index: risk.index,
                    code: risk.code,
                    possibility: 0,
                    severity: 0,
                    controllability: 0
                };
                this.answers.push(item);
            })
        },
        // 父子组件回调函数，接收子组件选择的选项值及题目信息
        receiveSelection(answer) {
            let number = this.answers.findIndex(item => item.code === answer.code);

            switch (answer.type) {
                case 'possibility':
                    this.answers[number].possibility = answer.score;
                    break;
                case 'severity':
                    this.answers[number].severity = answer.score;
                    break;
                case 'controllability':
                    this.answers[number].controllability = answer.score;
                    break;
                default:
                    break;
            }
        },
        // 清空选择项
        clearSelection(flag) {
            if (flag) {
                this.answers = [];
                //重新加载页面
                location.reload();
            }
        }
    }
}
</script>

<style scoped>

</style>