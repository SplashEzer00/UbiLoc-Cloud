package com.MotCap.system.mapper;

import java.util.List;
import com.MotCap.system.domain.PlayersData;

/**
 * 球星信息Mapper接口
 * 
 * @author MotCap
 * @date 2023-05-28
 */
public interface PlayersDataMapper 
{
    /**
     * 查询球星信息
     * 
     * @param playerId 球星信息ID
     * @return 球星信息
     */
    public PlayersData selectPlayersDataById(Long playerId);

    /**
     * 查询球星信息列表
     * 
     * @param playersData 球星信息
     * @return 球星信息集合
     */
    public List<PlayersData> selectPlayersDataList(PlayersData playersData);

    /**
     * 新增球星信息
     * 
     * @param playersData 球星信息
     * @return 结果
     */
    public int insertPlayersData(PlayersData playersData);

    /**
     * 修改球星信息
     * 
     * @param playersData 球星信息
     * @return 结果
     */
    public int updatePlayersData(PlayersData playersData);

    /**
     * 删除球星信息
     * 
     * @param playerId 球星信息ID
     * @return 结果
     */
    public int deletePlayersDataById(Long playerId);

    /**
     * 批量删除球星信息
     * 
     * @param playerIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePlayersDataByIds(Long[] playerIds);
}
