import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import VueAxios from 'vue-axios'
import { library } from '@fortawesome/fontawesome-svg-core'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import { faPlus, faEdit, faTrash } from '@fortawesome/free-solid-svg-icons'

import "bootstrap/dist/css/bootstrap.min.css"

library.add(faPlus, faEdit, faTrash)

const app = createApp(App)

app.config.productionTip = false
app.use(router)

app.component('font-awesome-icon', FontAwesomeIcon)

app.mount('#app')