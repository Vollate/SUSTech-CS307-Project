import {createApp} from 'vue';
import Main from './Main.vue'
import './css/bootstrap.css';
import './css/custom.css'

const main = createApp(Main);
main.mount('#app');