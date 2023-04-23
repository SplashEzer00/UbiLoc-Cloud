import request from '@/utils/request'

// 查询客户数据列表
export function listData(query) {
  return request({
    url: '/system/data/list',
    method: 'get',
    params: query
  })
}

// 查询客户数据详细
export function getData(dataId) {
  return request({
    url: '/system/data/' + dataId,
    method: 'get'
  })
}

// 新增客户数据
export function addData(data) {
  return request({
    url: '/system/data',
    method: 'post',
    data: data
  })
}

// 修改客户数据
export function updateData(data) {
  return request({
    url: '/system/data',
    method: 'put',
    data: data
  })
}

// 删除客户数据
export function delData(dataId) {
  return request({
    url: '/system/data/' + dataId,
    method: 'delete'
  })
}
