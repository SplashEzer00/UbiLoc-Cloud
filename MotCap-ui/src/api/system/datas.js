import request from '@/utils/request'

// 查询球星数据列表
export function listDatas(query) {
  return request({
    url: '/system/datas/list',
    method: 'get',
    params: query
  })
}

// 查询球星数据详细
export function getDatas(playerId) {
  return request({
    url: '/system/datas/' + playerId,
    method: 'get'
  })
}

// 新增球星数据
export function addDatas(data) {
  return request({
    url: '/system/datas',
    method: 'post',
    data: data
  })
}

// 修改球星数据
export function updateDatas(data) {
  return request({
    url: '/system/datas',
    method: 'put',
    data: data
  })
}

// 删除球星数据
export function delDatas(playerId) {
  return request({
    url: '/system/datas/' + playerId,
    method: 'delete'
  })
}
