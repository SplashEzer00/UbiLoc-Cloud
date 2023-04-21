package com.UbiLoc.system.mapper;

import java.util.List;
import com.UbiLoc.system.domain.PlayersData;

/**
 * 球星数据Mapper接口
 * 
 * @author UbiLoc
 * @date 2023-04-21
 */
public interface PlayersDataMapper 
{
    /**
     * 查询球星数据
     * 
     * @param playerId 球星数据ID
     * @return 球星数据
     */
    public PlayersData selectPlayersDataById(Long playerId);

    /**
     * 查询球星数据列表
     * 
     * @param playersData 球星数据
     * @return 球星数据集合
     */
    public List<PlayersData> selectPlayersDataList(PlayersData playersData);

    /**
     * 新增球星数据
     * 
     * @param playersData 球星数据
     * @return 结果
     */
    public int insertPlayersData(PlayersData playersData);

    /**
     * 修改球星数据
     * 
     * @param playersData 球星数据
     * @return 结果
     */
    public int updatePlayersData(PlayersData playersData);

    /**
     * 删除球星数据
     * 
     * @param playerId 球星数据ID
     * @return 结果
     */
    public int deletePlayersDataById(Long playerId);

    /**
     * 批量删除球星数据
     * 
     * @param playerIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePlayersDataByIds(Long[] playerIds);
}
