import request from '@/utils/request'

// 查询客户信息列表
export function listPeoples(query) {
  return request({
    url: '/system/peoples/list',
    method: 'get',
    params: query
  })
}

// 查询客户信息详细
export function getPeoples(userId) {
  return request({
    url: '/system/peoples/' + userId,
    method: 'get'
  })
}

// 新增客户信息
export function addPeoples(data) {
  return request({
    url: '/system/peoples',
    method: 'post',
    data: data
  })
}

// 修改客户信息
export function updatePeoples(data) {
  return request({
    url: '/system/peoples',
    method: 'put',
    data: data
  })
}

// 删除客户信息
export function delPeoples(userId) {
  return request({
    url: '/system/peoples/' + userId,
    method: 'delete'
  })
}
