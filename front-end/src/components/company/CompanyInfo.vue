<template>
  <el-card class="company-info">
    <el-card>
      <div slot="header">
        <span span class="title"><i class="el-icon-s-cooperation"></i>公司信息</span>
      </div>
      <div><b>公司名称:</b> {{companyInfo.name}}</div>
      <div><b>上市时间:</b> {{companyInfo.timeToMarket}}</div>
      <div><b>联系电话:</b> {{companyInfo.phone}}</div>
      <div><b>办公地址:</b> {{companyInfo.location}}</div>
    </el-card>

    <el-card>
      <div slot="header">
        <span span class="title"><i class="el-icon-s-unfold"></i>公司简介</span>
      </div>
      <div>
        {{companyInfo.info}}
      </div>

    </el-card>
    

  </el-card>
</template>

<script>
export default {
  props: {
    companyInfo: {
      name: "", 
      timeToMarket: "",
      phone: "",
      location: "",
      info: "",
      equipment_note: ""
    }
  },
}
</script>

<style scoped>
.company-info{
  margin: 10px;
}

.title{
  font-size: 20px;
  font-weight: bolder;
  line-height: 1.7;
}

.el-card{
  margin-top: 10px;
}

</style>