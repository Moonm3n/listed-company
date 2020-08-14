import request from '@/utils/request'

export function login(username, password){
  return request({
    method: 'post',
    url: '/api/login',
    data: {
      username: username,
      password: password
    }
  })
}

export function register(user){
  return request({
    method: 'post',
    url: '/api/register',
    data: {
      usrId: user.usrId,
      usrName: user.usrName,
      password: user.password,
      gender: user.gender,
      age: user.age,
      mailbox: user.mailbox,
      qq: user.qq,
      tel: user.tel,
      location: user.location,
      work_unit: user.work_unit,
      introducion: user.introducion
    }
  })
}