import axios from 'axios'

axios.defaults.baseURL = '/api'
axios.defaults.headers['Content-Type'] = 'application/jason;charset=utf-8'

//创建axios实例
const service = axios.create({
  baseURL: '/',
  timeout: 5000
})

// request intercepter
service.interceptors.request.use(
  config => {
      return config
  },
  error => {
      console.error()
      return Promise.reject(error)
  }
)

// response intercepter
service.interceptors.response.use(
  response => {
      return response.data
  },
  error => {
      console.log('err' + error)
  }
)

export default service