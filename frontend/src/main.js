import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui'
import globalDataPlugin from './assets/globalDataPlugin';
import request from "@/utils/request";
import 'element-ui/lib/theme-chalk/index.css'
import './assets/global.css'


Vue.prototype.$http = request
Vue.config.productionTip = false


Vue.use(ElementUI, {size: "small"})
Vue.use(globalDataPlugin);

new Vue({
    router,
    render: h => h(App)
}).$mount('#app')
