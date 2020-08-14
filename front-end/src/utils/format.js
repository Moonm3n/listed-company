Date.prototype.format = function(fmt) { 
  var o = { 
     "M+" : this.getMonth()+1,                 //月份 
     "d+" : this.getDate(),                    //日 
     "h+" : this.getHours(),                   //小时 
     "m+" : this.getMinutes(),                 //分 
     "s+" : this.getSeconds(),                 //秒 
     "q+" : Math.floor((this.getMonth()+3)/3), //季度 
     "S"  : this.getMilliseconds()             //毫秒 
 }; 
 if(/(y+)/.test(fmt)) {
         fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
 }
  for(var k in o) {
     if(new RegExp("("+ k +")").test(fmt)){
          fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
      }
  }
 return fmt; 
} 

export function getCurrentWeek(){
  //起止日期数组  
  var startStop = new Array();
  //获取当前时间  
  var currentDate = this.getCurrentDate();
  //返回date是一周中的某一天  
  var week = currentDate.getDay();

  //一天的毫秒数  
  var millisecond = 1000 * 60 * 60 * 24;
  //减去的天数  
  var minusDay = week != 0 ? week - 1 : 6;
  //alert(minusDay);  
  //本周 周一  
  var monday = new Date(currentDate.getTime() - (minusDay * millisecond));
  //本周 周日  
  var sunday = new Date(monday.getTime() + (6 * millisecond));
  //添加本周时间  
  startStop.push(monday); //本周起始时间  
  //添加本周最后一天时间  
  startStop.push(sunday); //本周终止时间  
  //返回  
  return startStop;

}

export function getCurrentDay(){
  var end = new Date().format("yyyyMMdd")
  var timestamp = new Date().getTime()
  var start = new Date(timestamp - 7 * 24 * 3600 * 1000).format("yyyyMMdd")

  return {
    start: start,
    end: end
  }
}