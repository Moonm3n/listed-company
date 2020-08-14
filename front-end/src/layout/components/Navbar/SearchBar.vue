<template>
  <div class="sub-title">
    <el-autocomplete
      class="inline-input"
      v-model="state1"
      :fetch-suggestions="querySearch"
      placeholder="输入想要了解的公司"
      @select="handleSelect">
    </el-autocomplete>
  </div>
</template>

<script>
import {getCompanyName} from '@/api/tushare'

export default {

  data() {
    return {
      companys: [],
      state1: '',
      state2: ''
    };
  },
  methods: {
    querySearch(queryString, cb) {
      var companys = this.companys;
      var results = queryString ? companys.filter(this.createFilter(queryString)) : companys;
      // 调用 callback 返回建议列表的数据
      cb(results);
    },
    createFilter(queryString) {
      return (restaurant) => {
        return (restaurant.value.toLowerCase().indexOf(queryString.toLowerCase()) === 0);
      };
    },

    handleSelect(item) {
      console.log(this.$router)
      var is = true
      if(this.$route.params.companyCode == null){
        is = false
      }
      this.$router.push(item.code)
      if(is){
        this.$router.go(0)
      }
      console.log(item);
    }
  },
  mounted() {
    getCompanyName().then(response => {
      var data = []
      response.data.items.forEach(element => {
        data.push({
          value: element[2],
          code: element[1]
        })
      });
      this.companys = data

    })
  }
}
</script>

<style scoped>

</style>