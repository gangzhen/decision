<template>
    <div>
        <h2>{{ num + 1 }}. {{ risk.detail }}</h2>
    </div>
</template>

<script>

export default {
    name: "Risks",
    props: {
        num: {
            type: Number,
            default: 0
        },
        risk: {
            type: Object,
            default: () => ({})
        }
    },
    data() {
        return {}
    }
}
</script>

<style scoped>
</style>