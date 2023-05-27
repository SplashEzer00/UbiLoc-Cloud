package com.MotCap.system.service.impl;

import java.util.List;
import com.MotCap.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MotCap.system.mapper.PlayersDataMapper;
import com.MotCap.system.domain.PlayersData;
import com.MotCap.system.service.IPlayersDataService;

/**
 * 球星信息Service业务层处理
 *
 * @author MotCap
 * @date 2023-05-28
 */
@Service
public class PlayersDataServiceImpl implements IPlayersDataService
{
    @Autowired
    private PlayersDataMapper playersDataMapper;

    /**
     * 查询球星信息
     *
     * @param playerId 球星信息ID
     * @return 球星信息
     */
    @Override
    public PlayersData selectPlayersDataById(Long playerId)
    {
        return playersDataMapper.selectPlayersDataById(playerId);
    }

    /**
     * 查询球星信息列表
     *
     * @param playersData 球星信息
     * @return 球星信息
     */
    @Override
    public List<PlayersData> selectPlayersDataList(PlayersData playersData)
    {
        return playersDataMapper.selectPlayersDataList(playersData);
    }

    /**
     * 新增球星信息
     *
     * @param playersData 球星信息
     * @return 结果
     */
    @Override
    public int insertPlayersData(PlayersData playersData)
    {
        playersData.setCreateTime(DateUtils.getNowDate());
        return playersDataMapper.insertPlayersData(playersData);
    }

    /**
     * 修改球星信息
     *
     * @param playersData 球星信息
     * @return 结果
     */
    @Override
    public int updatePlayersData(PlayersData playersData)
    {
        playersData.setUpdateTime(DateUtils.getNowDate());
        return playersDataMapper.updatePlayersData(playersData);
    }

    /**
     * 批量删除球星信息
     *
     * @param playerIds 需要删除的球星信息ID
     * @return 结果
     */
    @Override
    public int deletePlayersDataByIds(Long[] playerIds)
    {
        return playersDataMapper.deletePlayersDataByIds(playerIds);
    }

    /**
     * 删除球星信息信息
     *
     * @param playerId 球星信息ID
     * @return 结果
     */
    @Override
    public int deletePlayersDataById(Long playerId)
    {
        return playersDataMapper.deletePlayersDataById(playerId);
    }
}
