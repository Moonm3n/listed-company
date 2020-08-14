<template>
  <el-table
    :data="detailTableData"
    style="width: 100%">
    <el-table-column
      prop="type"
      label="数据类型">
    </el-table-column>
    <el-table-column
      prop="data_2019"
      label="2019">
    </el-table-column>
    <el-table-column
      prop="data_2018"
      label="2018">
    </el-table-column>
    <el-table-column
      prop="data_2017"
      label="2017">
    </el-table-column>
    <el-table-column
      prop="data_2016"
      label="2016">
    </el-table-column>
    <el-table-column
      prop="data_2015"
      label="2015">
    </el-table-column>
  </el-table>
</template>

<script>
export default {
  props: {
    tableData: {
      type:Array
    }
  },
  watch: {
    tableData: {
      immediate: true, 
      handler(val) {
        this.detailTableData = val;
      },
      deep: true
　  }
  },
  data() {
    return {
      detailTableData: this.tableData
    }
  },
  mounted(){
    this.detailTableData = this.tableData
  }
}
</script>