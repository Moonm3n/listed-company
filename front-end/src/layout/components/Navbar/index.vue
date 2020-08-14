<template>
  <div>
    <el-menu class="el-menu-demo" 
    background-color=#5677fc 
    text-color=#f4f5f9 
    active-text-color=#FFFFF3
    mode="horizontal" 
    @select="handleSelect">
      <el-menu-item index="1" style="margin-left:25%" class="logo">
        <img style="width: auto; height: 60px" :src="logoUrl" />
      </el-menu-item>
      <el-menu-item index="2">公司对比</el-menu-item>
      <el-menu-item index="3">消息中心</el-menu-item>
      <el-menu-item index="3">个人主页</el-menu-item>
      <el-menu-item index="4" class="search-bar"><SearchBar></SearchBar></el-menu-item>
      <el-menu-item index="5" class="avatar"><el-avatar :size="45" :src="circleUrl"></el-avatar></el-menu-item>
    </el-menu>
  </div>
</template>

<script>
import SearchBar from './SearchBar'
//import SearchBar from './tempSearch'

export default {

  components: {
    SearchBar
  },
  methods: {
    handleSelect(){
      
    }
  },
  data(){
    return {
      logoUrl: require('@/assets/logo-list-company.png'),
      circleUrl:"https://s1.ax1x.com/2020/06/16/Nkx5zq.jpg"
    }
  }
}
</script>

<style scoped>
.el-menu{
  padding: 0px;
}

.search-bar{
  position: absolute;
  right: 29%;
}

.avatar{
  position: absolute;
  right: 25%;
}
</style>
