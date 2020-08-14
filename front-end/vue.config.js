const path = require('path')
//const defaultSettings = require('./src/settings.js')

function resolve(dir){
  return path.join(__dirname, dir)
}

module.exports = {

  transpileDependencies: [
    'vue-echarts',
    'resize-detector'
  ],

  publicPath: '/',
  configureWebpack: {
    resolve: {
      alias: {
        '@': resolve('src')
      }
    }
  },

  devServer: {
    proxy: {
      // 前端 axios 发这样的请求：http://127.0.0.1:8081/api/ (8081是启动vue项目时的端口)，会被此处捕获，然后代为请求真正的服务器API地址 `http://127.0.0.1`
      '/tushare': {
        target: 'http://api.tushare.pro/', // 此处是服务端API接口，不写端口默认80
        changeOrigin: true,
        pathRewrite: {
          '^/tushare': ''
        }
      },

      '/api': {
        target: 'http://localhost:8080', // 此处是服务端API接口，不写端口默认80
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      },

    }
  }
  
}
