<template>
    <div>
        <h2>{{ risk.index }}. {{ risk.detail }}</h2>
    </div>
</template>

<script>

export default {
    name: "Risks",
    props: {
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