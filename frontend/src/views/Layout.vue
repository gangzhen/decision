<template>
    <div>
        <el-container class="questionnaire">
            <el-header>
                <Header></Header>
            </el-header>
            <el-main>
                <Main></Main>
            </el-main>
        </el-container>
    </div>
</template>

<script>
// @ is an alias to /src
import Header from '@/components/Header.vue'
import Main from '@/components/Main.vue'

export default {
    name: 'Layout',
    components: {
        Header, Main
    }
}
</script>
