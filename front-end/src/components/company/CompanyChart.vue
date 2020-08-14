<template>
  <el-card class="company-chart">
    <div slot="header" class="clearfix">
      <el-card>

        <el-row>
          <el-col :span="6">
            <div class="title">{{companyInfo.name}}</div>
          </el-col>
          <el-tag>地域:{{companyInfo.area}}</el-tag>
          <el-tag type="success">板块:{{companyInfo.market}}</el-tag>
          <el-tag type="warning">行业:{{companyInfo.industry}}</el-tag>
          <el-col :span="4" :offset="13">
            <el-button type="primary" size="medium" class="compare-button">与其他公司对比</el-button>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="6">
            <div class="code">{{companyCodeShow}}</div>
          </el-col>
          <el-col :span="4">
            <el-button type="primary" size="mini" class="table-button" @click="toTable('cashflow')">现金流量表</el-button>
          </el-col>
          <el-col :span="4">
            <el-button type="primary" size="mini" class="table-button" @click="toTable('balancesheet')">资产负债表</el-button>
          </el-col>
          <el-col :span="3">
            <el-button type="primary" size="mini" class="table-button" @click="toTable('income')">利润表</el-button>
          </el-col>
        </el-row>

      </el-card>
    </div>
    <KChart v-if="showChart"></KChart>
    <CommonTable v-if="showTable" :tableData="tableData"></CommonTable>
  </el-card>  
</template>

<script>
import KChart from "./KChart"
import CommonTable from "./CommonTable"

import {getCompanyBasic} from '@/api/tushare'
import {getTableInfo} from '@/api/company'

export default {
  components: {
    KChart, CommonTable
  },
  data(){
    return {
      companyCode: "",
      companyCodeShow: "",
      companyCodeQuery: "",
      showChart: true,
      showTable: true,
      tableData: [],
      allTableData: {},
      companyInfo: {
        name: "", 
        area: "",
        market: "",
        list_date: ""
      }
    }
  }, 
  methods: {
    toTable(type){
      switch (type) {
        case 'cashflow':
          this.tableData = this.allTableData.cashflow
          break;
        case 'balancesheet':
          this.tableData = this.allTableData.balancesheet
          break;
        case 'income':
          this.tableData = this.allTableData.income
          break;
        default:
          break;
      }
      this.showChart = false
      this.showTable = true
    },
    toChart(){
      this.showChart = false
      this.showTable = true
    }
  },
  mounted(){
    this.companyCode = this.$route.params.companyCode

    if(this.companyCode.slice(0, 1) === "0"){
      this.companyCodeQuery = this.companyCode + ".SZ"
      this.companyCodeShow = "SZ" + this.companyCode
    }else{
      this.companyCodeQuery = this.companyCode + ".SH"
      this.companyCodeShow = "SH" + this.companyCode
    }

    getCompanyBasic().then(response => {
      var data = response.data.items
      data.forEach(element => {
        if(element[0] === this.companyCodeQuery){
          this.companyInfo.name = element[2]
          this.companyInfo.area = element[3]
          this.companyInfo.market = element[5]
          this.companyInfo.industry = element[4]
        }
      })
    })

    getTableInfo(this.companyCode).then(response => {
      this.allTableData = response.data
    })

  },
}
</script>

<style scoped>

.company-chart{
  margin: 10px;
}

.title{
  font-size: 27px;
  font-weight: bolder;
  line-height: 2.4;
}

.code{
  margin-top: 5px;
}

.el-tag{
  margin: 5px;
}

</style>