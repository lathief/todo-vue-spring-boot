<template>
    <div class="item">
        <input type="checkbox" @change="updateMarkTodo()" v-model="item.completed">
        <span :class="['itemText', item.completed? 'completed' : '']">
            <div v-show="show_data">{{ item.value }}</div>
            <input type="text" :placeholder="item.value" class="input-value" v-model="item.name" v-show="show_input">
        </span>
        <button class="edit" @click="updateValueTodo()" v-show="show_data">
            <font-awesome-icon
            icon="edit"
            />
        </button>
        <button class="delete">
            <font-awesome-icon v-show="show_data" @click="removeTodo()"
            icon="trash"
            />
            <font-awesome-icon v-show="show_input" @click="updateValueTodo()"
            icon="edit"
            />
        </button>
    </div>
</template>

<script>
import axios from 'axios';
export default {
    props: ['item'],
    data() {
        return {
            show_data: true,
            show_input: false
        }
    },
    methods:{
        updateValueTodo(){
            if(this.show_data == true){
                this.show_data = false
                this.show_input = true
            } else {
                this.show_data = true
                this.show_input = false
                
                if(this.item.name !== undefined) {
                    axios.put('http://localhost:8080/api/updatevalue/'+this.item.id, {
                        value: this.item.name
                    }).then(response => {
                        if(response.status >= 200 && response.status < 300){
                            this.$emit('reloadTodos')
                        }
                    })
                }
            }

        },
        updateMarkTodo(){
            axios.put('http://localhost:8080/api/updatemark/'+this.item.id, {
                completed: this.item.completed
            }).then(response => {
                if(response.status >= 200 && response.status < 300){
                    this.$emit('reloadTodos')
                }
            })
        },
        removeTodo(){
            axios.delete('http://localhost:8080/api/delete/'+this.item.id).then(response => {
                if(response.status >= 200 && response.status < 300){
                    this.$emit('reloadTodos')
                }
            })
        }
    }
}
</script>

<style scoped>
    .item{
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .input-value{
        border-style: solid;
        border-color: blue;
        border-width: 1px;
        outline: none;
        padding: 5px;
        height: 100%;
        width: 90%;
    }
    .completed{
        text-decoration: line-through;
        color:#999;
    }
    .itemText{
        width: 100%;
        margin-left: 20px;
    }
    .edit{
        color: blue;
        border-radius: 5px;
        border: none;
        outline: none;
        margin-right: 5px;
        background-color: white;
        font-size: 17px;
    }
    .delete{
        color: red;
        border-radius: 5px;
        border: none;
        outline: none;
        background-color: white;
        font-size: 17px;
    }
</style>
  