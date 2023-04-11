import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/global.css'
import globalDataPlugin from './assets/globalDataPlugin';
import request from "@/utils/request";

Vue.config.productionTip = false

Vue.use(ElementUI, {size: "small"})
Vue.use(globalDataPlugin);

Vue.prototype.$http = request

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
