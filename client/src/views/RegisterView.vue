<template>
    <div class="container d-flex flex-column min-vh-100">
      <header class="d-flex justify-content-center py-3 border-bottom">
        <ul class="nav nav-pills">
          <li class="nav-item"><a href="#" class="nav-link">
              <h1 style="text-align: center; font-size: 32px">Todo List</h1>
          </a></li>
        </ul>
        
      </header>
      <div class="form-signin m-auto mt-5">
        <form>
          <h1 class="h3 mb-3 fw-normal">Please sign up</h1>
          <div class="form-floating">
            <input
              type="text"
              class="form-control"
              id="floatingInput"
              placeholder="Username"
            />
            <label for="floatingInput">Username</label>
          </div>
          <div class="form-floating">
            <input
              type="email"
              class="form-control"
              id="floatingInput"
              placeholder="name@example.com"
            />
            <label for="floatingInput">Email address</label>
          </div>
          <div class="form-floating">
            <input
              type="password"
              class="form-control"
              id="floatingPassword"
              placeholder="Password"
            />
            <label for="floatingPassword">Password</label>
          </div>
  
          <button class="w-100 btn btn-lg btn-primary" type="submit">
            Sign up
          </button>
        </form>
      </div>
    </div>
  </template>
  <script>
  export default {
    name: "LoginView",
  };
  </script>
  <style scoped>
  .container {
    display: flex;
    align-items: center;
    padding: 70px;
    padding-bottom: 40px;
  }
  .form-signin {
    max-width: 330px;
    padding: 15px;
  }
  
  .form-signin .form-floating:focus-within {
    z-index: 2;
  }
  
  .form-signin input[type="email"] {
    margin-bottom: -1px;
    border-bottom-right-radius: 0;
    border-bottom-left-radius: 0;
  }
  
  .form-signin input[type="password"] {
    margin-bottom: 10px;
    border-top-left-radius: 0;
    border-top-right-radius: 0;
  }
  </style>
  