<template>
    <div>
        <h2>{{ topic.index }}. {{ topic.detail }}</h2>
    </div>
</template>

<script>

export default {
    name: "Topics",
    props: {
        topic: {
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