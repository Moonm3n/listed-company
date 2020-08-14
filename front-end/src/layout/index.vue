<template>
  <div class="app-wrapper">
    <Navbar></Navbar>
    <div class="main">
      <router-view />
    </div>
  </div>
</template>

<script>
import {Navbar, AppMain} from './components'

export default {
  name: 'Layout',
  components: {
    Navbar, AppMain
  }
}
</script>

<style scoped>
.app-wrapper{
  margin: 0;
  padding: 0;

  background-color:#99CCFF;
}

.main{
  
  width: 70%;
  margin-left: 15%;
}
</style>