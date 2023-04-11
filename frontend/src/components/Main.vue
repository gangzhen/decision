<template>
    <div>
        <div v-for="topic in $topics">
            <Topics v-bind:topic="topic"></Topics>
            <Selections v-bind:index="topic.index" v-bind:code="topic.code" v-bind:selections="$selections"
                     v-on:send-selection="receiveSelection"></Selections>
        </div>
        <Analysis v-bind:answers="answers"></Analysis>
    </div>

</template>

<script>
// @ is an alias to /src
import Topics from '@/components/Topics.vue'
import Selections from '@/components/Selections.vue'
import Analysis from '@/components/Analysis.vue'

export default {
    name: "Main",
    components: {
        Topics, Selections, Analysis
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
            let length = this.$topics.length;
            this.answers = Array.from({length: length}, () => ({
                index: 0,
                code: '',
                possibility: 0,
                severity: 0,
                controllability: 0
            }));
        },
        // 父子组件回调函数，接收子组件选择的选项值及题目信息
        receiveSelection(answer) {
            let number = answer.index - 1;

            this.answers[number].index = answer.index;
            this.answers[number].code = answer.code;

            switch (answer.type) {
                case 'possibility':
                    this.answers[number].possibility = answer.label;
                    break;
                case 'severity':
                    this.answers[number].severity = answer.label;
                    break;
                case 'controllability':
                    this.answers[number].controllability = answer.label;
                    break;
                default:
                    break;
            }
        }
    }
}
</script>

<style scoped>

</style>