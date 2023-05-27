import request from '@/utils/request'

// 查询球星信息列表
export function listPlayer(query) {
  return request({
    url: '/system/player/list',
    method: 'get',
    params: query
  })
}

// 查询球星信息详细
export function getPlayer(playerId) {
  return request({
    url: '/system/player/' + playerId,
    method: 'get'
  })
}

// 新增球星信息
export function addPlayer(data) {
  return request({
    url: '/system/player',
    method: 'post',
    data: data
  })
}

// 修改球星信息
export function updatePlayer(data) {
  return request({
    url: '/system/player',
    method: 'put',
    data: data
  })
}

// 删除球星信息
export function delPlayer(playerId) {
  return request({
    url: '/system/player/' + playerId,
    method: 'delete'
  })
}
