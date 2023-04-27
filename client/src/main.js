import { createApp } from 'vue'
import App from './App.vue'
import axios from 'axios'
import VueAxios from 'vue-axios'
import "bootstrap/dist/css/bootstrap.min.css"
import './assets/main.css'
/* import the fontawesome core */
import { library } from '@fortawesome/fontawesome-svg-core'

/* import font awesome icon component */
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

/* import specific icons */
import { faPlus, faEdit, faTrash } from '@fortawesome/free-solid-svg-icons'

// /* add icons to the library */
library.add(faPlus, faEdit, faTrash)

// /* add font awesome icon component */    
createApp(App).use(VueAxios, axios).component('font-awesome-icon', FontAwesomeIcon).mount('#app')