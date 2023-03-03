
import ListItem from './listItem.vue';

<template>
    <div>
        <div v-for="(item, index) in items" :key="index">
            <listItem
            :item="item"
            v-on:reloadTodos="getTodos()"
            class="item"
            />
        </div>
    </div>
</template>
<script>
import listItem from './listItem.vue';
export default {
    components: {
        listItem
    },
    data: function() {
        return {
            items :[]
        }
    },
    methods:{
        getTodos(){
            this.axios.get('http://localhost:8080/api/index').then(response => {
                if(response.status === 200) {
                    this.items = response.data
                    console.log(response.data)
                }
            })
            
        }
    },
    created(){
        this.getTodos()
    }
}
</script>
<style>
    .item{
        padding: 12px;
        margin-top: 5px;
        border-style: solid;
        border-color: blue;
        border-radius: 7px;
        border-width: 1px;
    }
</style>
  