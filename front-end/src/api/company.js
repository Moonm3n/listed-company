import request from '@/utils/request'

const token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYWEiLCJjcmVhdGVkIjoxNTk3MjAzMzg2MDg1LCJleHAiOjE1OTc4MDgxODZ9.4pS_jv7MTXxA8ZJlZmvL9wCOIU63qLmsUV4j6f18cqgHdM70Cr3hkQihzOFeKYwSxfQgGNHi9V1AyIiwLxa3BA"

export function getCompany(c_id){
  return request({
    method: 'get',
    url: '/api/company/' + c_id,
    headers: {
        'Authorization': 'Bearer ' + token,
    },

  })
}

export function getCompanyList(){
  return request({
    method: 'get',
    url: '/api/company',
    headers: {
        'Authorization': 'Bearer ' + token,
    }
  })   
}

export function getTableInfo(c_id){
  return request({
    method: 'get',
    url: '/api/table/' + c_id,
    headers: {
        'Authorization': 'Bearer ' + token,
    }
  })   
}