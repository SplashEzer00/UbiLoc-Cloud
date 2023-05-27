package com.MotCap.system.service.impl;

import java.util.List;
import com.MotCap.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MotCap.system.mapper.UsrsDataMapper;
import com.MotCap.system.domain.UsrsData;
import com.MotCap.system.service.IUsrsDataService;

/**
 * 三维数据Service业务层处理
 *
 * @author MotCap
 * @date 2023-05-28
 */
@Service
public class UsrsDataServiceImpl implements IUsrsDataService
{
    @Autowired
    private UsrsDataMapper usrsDataMapper;

    /**
     * 查询三维数据
     *
     * @param dataId 三维数据ID
     * @return 三维数据
     */
    @Override
    public UsrsData selectUsrsDataById(Long dataId)
    {
        return usrsDataMapper.selectUsrsDataById(dataId);
    }

    /**
     * 查询三维数据列表
     *
     * @param usrsData 三维数据
     * @return 三维数据
     */
    @Override
    public List<UsrsData> selectUsrsDataList(UsrsData usrsData)
    {
        return usrsDataMapper.selectUsrsDataList(usrsData);
    }

    /**
     * 新增三维数据
     *
     * @param usrsData 三维数据
     * @return 结果
     */
    @Override
    public int insertUsrsData(UsrsData usrsData)
    {
        usrsData.setCreateTime(DateUtils.getNowDate());
        return usrsDataMapper.insertUsrsData(usrsData);
    }

    /**
     * 修改三维数据
     *
     * @param usrsData 三维数据
     * @return 结果
     */
    @Override
    public int updateUsrsData(UsrsData usrsData)
    {
        usrsData.setUpdateTime(DateUtils.getNowDate());
        return usrsDataMapper.updateUsrsData(usrsData);
    }

    /**
     * 批量删除三维数据
     *
     * @param dataIds 需要删除的三维数据ID
     * @return 结果
     */
    @Override
    public int deleteUsrsDataByIds(Long[] dataIds)
    {
        return usrsDataMapper.deleteUsrsDataByIds(dataIds);
    }

    /**
     * 删除三维数据信息
     *
     * @param dataId 三维数据ID
     * @return 结果
     */
    @Override
    public int deleteUsrsDataById(Long dataId)
    {
        return usrsDataMapper.deleteUsrsDataById(dataId);
    }
}
