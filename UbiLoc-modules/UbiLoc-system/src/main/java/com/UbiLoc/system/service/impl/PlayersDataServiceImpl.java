package com.UbiLoc.system.service.impl;

import java.util.List;
import com.UbiLoc.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.UbiLoc.system.mapper.PlayersDataMapper;
import com.UbiLoc.system.domain.PlayersData;
import com.UbiLoc.system.service.IPlayersDataService;

/**
 * 球星数据Service业务层处理
 *
 * @author UbiLoc
 * @date 2023-04-21
 */
@Service
public class PlayersDataServiceImpl implements IPlayersDataService
{
    @Autowired
    private PlayersDataMapper playersDataMapper;

    /**
     * 查询球星数据
     *
     * @param playerId 球星数据ID
     * @return 球星数据
     */
    @Override
    public PlayersData selectPlayersDataById(Long playerId)
    {
        return playersDataMapper.selectPlayersDataById(playerId);
    }

    /**
     * 查询球星数据列表
     *
     * @param playersData 球星数据
     * @return 球星数据
     */
    @Override
    public List<PlayersData> selectPlayersDataList(PlayersData playersData)
    {
        return playersDataMapper.selectPlayersDataList(playersData);
    }

    /**
     * 新增球星数据
     *
     * @param playersData 球星数据
     * @return 结果
     */
    @Override
    public int insertPlayersData(PlayersData playersData)
    {
        playersData.setCreateTime(DateUtils.getNowDate());
        return playersDataMapper.insertPlayersData(playersData);
    }

    /**
     * 修改球星数据
     *
     * @param playersData 球星数据
     * @return 结果
     */
    @Override
    public int updatePlayersData(PlayersData playersData)
    {
        playersData.setUpdateTime(DateUtils.getNowDate());
        return playersDataMapper.updatePlayersData(playersData);
    }

    /**
     * 批量删除球星数据
     *
     * @param playerIds 需要删除的球星数据ID
     * @return 结果
     */
    @Override
    public int deletePlayersDataByIds(Long[] playerIds)
    {
        return playersDataMapper.deletePlayersDataByIds(playerIds);
    }

    /**
     * 删除球星数据信息
     *
     * @param playerId 球星数据ID
     * @return 结果
     */
    @Override
    public int deletePlayersDataById(Long playerId)
    {
        return playersDataMapper.deletePlayersDataById(playerId);
    }
}
