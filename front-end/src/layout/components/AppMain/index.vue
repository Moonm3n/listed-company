<template>
  <div>
    <el-row>
      <el-col :span="16"> 
        <CompanyCards></CompanyCards>
      </el-col>
      <el-col :span="8">
        <InfoCards></InfoCards>
      </el-col>
    </el-row>

  </div>

</template>

<script>
import CompanyCards from './CompanyCards'
import InfoCards from './InfoCards'

export default {
  components: {
    CompanyCards, InfoCards
  }
}
</script>