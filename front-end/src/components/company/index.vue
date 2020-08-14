<template>
  <div class="company">
    <el-row>
      <el-col :span="16">
        <CompanyChart></CompanyChart>
      </el-col>
      <el-col :span="8">
        <CompanyInfo :companyInfo="companyInfo"></CompanyInfo>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import CompanyInfo from "./CompanyInfo"
import CompanyChart from "./CompanyChart"
import {getCompany} from "@/api/company"

export default {
  data(){
    return{
      companyInfo: {
        name: "",
        timeToMarket: "",
        phone: "",
        location: "",
        info: "",
      },
      companyCode: ""


    }
  },
  components: {
    CompanyInfo, CompanyChart
  },
  mounted(){
    this.companyCode = this.$route.params.companyCode
    getCompany(this.companyCode).then(response => {
      var data = response.data
      this.companyInfo.name = data.cname
      this.companyInfo.timeToMarket = data.timeToMarket
      this.companyInfo.location = data.clocation
      this.companyInfo.phone = data.ctel
      this.companyInfo.info = data.cindustry
    })
  }
}
</script>

<style scoped>
.company{
  height: 100%;
}
</style>