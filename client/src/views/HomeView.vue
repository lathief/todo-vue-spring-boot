<template>
  <div class="container d-flex flex-column min-vh-100">
    <header
      class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
      <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
        <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap">
          <use xlink:href="#bootstrap"></use>
        </svg>
      </a>

      <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
        <li><a href="/" class="nav-link px-2 link-active" style="font-size: 32px;">Todo List</a></li>
      </ul>

      <div class="col-md-3 text-end">
        <RouterLink to="/login" class="btn btn-outline-primary me-2">Sign in</RouterLink>
        <RouterLink to="/register" class="btn btn-primary">Sign up</RouterLink>
      </div>
    </header>
    <div class="todoListContainer">
      <addItemForm />
      <listView />
    </div>
    <Footer></Footer>
  </div>
</template>

<script>
import addItemForm from "../components/addItemForm.vue";
import listView from "../components/listView.vue";
import Footer from "../components/footer.vue";
export default {
  name: 'HomeView',
  components: {
    addItemForm,
    listView,
    Footer,
  },
};
</script>

<style scoped>
.todoListContainer {
  margin: auto;
  margin-top: 25px;
}</style>
