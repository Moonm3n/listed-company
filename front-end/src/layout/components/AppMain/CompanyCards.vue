<template>
  <div class="cards">

    <el-card class="card" v-for="new_share in new_shares" :key="new_share[1]">
      <div slot="header" class="clearfix">
        <div class="title">{{new_shares[1][2]}}</div>
      </div>
      <div v-for="o in 4" :key="o" class="text item">
        {{'列表内容 ' + o }}
      </div>
    </el-card>
  
  </div>
</template>

<script>
import {getNewCompany} from '@/api/tushare'

export default {
  props:{
    basicInfo: {
      type: Object
    }
  },
  data(){
    return {
      new_shares: []
    }
  },
  mounted(){
    getNewCompany().then(response => {
      console.log(response)
      this.new_shares = response.data.items
    })
  },
  methods: {

  }
}
</script>

<style scoped>

.card{
  margin: 20px;
}
</style>