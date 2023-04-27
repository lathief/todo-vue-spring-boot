<script>
import addItemForm from './components/addItemForm.vue';
import listView from './components/listView.vue';
export default {
  components: {
    addItemForm,
    listView,
  }
}
</script>

<template>
  <div class="container">
    <header
      class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
      <div class="col-md-3 mb-2 mb-md-0">
        <a href="/" class="d-inline-flex link-body-emphasis text-decoration-none">
          <svg class="bi" width="40" height="32" role="img" aria-label="Bootstrap">
            <use xlink:href="#bootstrap"></use>
          </svg>
        </a>
      </div>

      <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
        <h1 style="text-align: center; font-size: 32px;">Todo List</h1>
      </ul>

      <div class="col-md-3 text-end">
        <button type="button" class="btn btn-outline-primary me-2">Login</button>
        <button type="button" class="btn btn-primary">Sign-up</button>
      </div>
    </header> 
    <div class="todoListContainer">
      <addItemForm/>
      <listView/>
    </div>
  </div>
  <!-- <div class="container">
    <h1 style="text-align: center;">Todo List</h1>
    <div class="todoListContainer">
      <addItemForm/>
      <listView/>
    </div>
  </div> -->
</template>

<style scoped>
.todoListContainer {
  width: 400px;
  margin: auto;
  margin-top: 50px;
}
/*
.container {
  padding: 0 23rem;
} */
</style>
