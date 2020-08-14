import request from '@/utils/request'

import {getCurrentWeek, getCurrentDay} from '@/utils/format'

const token = "7ae6b8e94d28f8ef2db36d74b00e9e72854c0e16dbb835bb5aba03c6"
const url = '/tushare'

export function getCompanyName(){
  return request({
    method: 'post',
    url: url,
    data: {
      api_name: "stock_basic",
      token: token
    }
  })
}

export function getNewCompany(){
  return request({
    method: 'post',
    url: url,
    data: {
      api_name: "new_share",
      token: token,
      params: {
        start_date: getCurrentDay().start
      }
    }
  })
}

export function getDaily(company_code){
  return request({
    method: 'post',
    url: url,
    data: {
      api_name: "daily",
      token: token,
      params: {
        ts_code: company_code,
        // start_date: getCurrentDay().start,
        // end_date: getCurrentDay().end
      }
    }
  })
}

export function getCompanyBasic(){
  return request({
    method: 'post',
    url: url,
    data: {
      api_name: "stock_basic",
      token: token,
    }
  })
}