<template>
    <div>
        <div v-for="item in $selectItems">
            <!-- 可能性 -->
            <div v-if="item.type === 'possibility'">
                <h3>- 可能性</h3>
                <el-radio-group v-model="possibility">
                    <table>
                        <tr v-for="selection in item.selections">
                            <td>
                                <el-radio :label="selection.score"
                                          @click.native="handlePossibilityClick(selection, $event)">
                                    {{ selection.detail }}
                                </el-radio>
                            </td>
                        </tr>
                    </table>
                </el-radio-group>
            </div>

            <!-- 严重性 -->
            <div v-if="item.type === 'severity'">
                <h3>- 严重性</h3>
                <el-radio-group v-model="severity">
                    <table>
                        <tr v-for="selection in item.selections">
                            <td>
                                <el-radio :label="selection.score"
                                          @click.native="handleSeverityClick(selection, $event)">
                                    {{ selection.detail }}
                                </el-radio>
                            </td>
                        </tr>
                    </table>
                </el-radio-group>
            </div>

            <!-- 可控性 -->
            <div v-if="item.type === 'controllability'">
                <h3>- 可控性</h3>
                <el-radio-group v-model="controllability">
                    <table>
                        <tr v-for="selection in item.selections">
                            <td>
                                <el-radio :label="selection.score"
                                          @click.native="handleControllabilityClick(selection, $event)">
                                    {{ selection.detail }}
                                </el-radio>
                            </td>
                        </tr>
                    </table>
                </el-radio-group>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "Selections",
    props: {
        index: {
            type: Number,
            default: 0
        },
        code: {
            type: String,
            default: ''
        }
    },
    data() {
        return {
            possibility: 0,
            severity: 0,
            controllability: 0
        }
    },
    methods: {
        // 点击事件，绑定题目的可能性结果
        handlePossibilityClick(option, e) {
            // 因为原生click事件会执行两次，第一次在label标签上，第二次在input标签上，故此处理
            if (e.target.tagName === 'INPUT') return;

            let answer = {
                index: this.index,
                code: this.code,
                type: 'possibility',
                score: option.score
            };
            this.sendSelection(answer);
        },
        // 点击事件，绑定题目的严重性结果
        handleSeverityClick(option, e) {
            // 因为原生click事件会执行两次，第一次在label标签上，第二次在input标签上，故此处理
            if (e.target.tagName === 'INPUT') return;

            let answer = {
                index: this.index,
                code: this.code,
                type: 'severity',
                score: option.score
            };
            this.sendSelection(answer);
        },
        // 点击事件，绑定题目的可控性结果
        handleControllabilityClick(option, e) {
            // 因为原生click事件会执行两次，第一次在label标签上，第二次在input标签上，故此处理
            if (e.target.tagName === 'INPUT') return;

            let answer = {
                index: this.index,
                code: this.code,
                type: 'controllability',
                score: option.score
            };
            this.sendSelection(answer);
        },
        // 父子组件回调父组件方法
        sendSelection(answer) {
            this.$emit('send-selection', answer);
        }
    }
}
</script>

<style scoped>

</style>