<script>
import addItemForm from './components/addItemForm.vue';
import listView from './components/listView.vue';
export default {
  components:{
    addItemForm,
    listView,
}
}
</script>

<template>
  <div class="container">
    <h1 style="text-align: center;">Todo List</h1>
    <div class="todoListContainer">
      <addItemForm/>
      <listView/>
    </div>
  </div>
</template>

<style scoped>
  .todoListContainer{
    width: 400px;
    margin: auto;
    margin-top: 50px;
  }
  .container{
    padding: 0 23rem;
  }
</style>
