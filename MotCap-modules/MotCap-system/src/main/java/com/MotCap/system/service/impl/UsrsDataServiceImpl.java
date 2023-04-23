package com.MotCap.system.service.impl;

import java.util.List;
import com.MotCap.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MotCap.system.mapper.UsrsDataMapper;
import com.MotCap.system.domain.UsrsData;
import com.MotCap.system.service.IUsrsDataService;

/**
 * 客户数据Service业务层处理
 *
 * @author MotCap
 * @date 2023-04-23
 */
@Service
public class UsrsDataServiceImpl implements IUsrsDataService
{
    @Autowired
    private UsrsDataMapper usrsDataMapper;

    /**
     * 查询客户数据
     *
     * @param dataId 客户数据ID
     * @return 客户数据
     */
    @Override
    public UsrsData selectUsrsDataById(Long dataId)
    {
        return usrsDataMapper.selectUsrsDataById(dataId);
    }

    /**
     * 查询客户数据列表
     *
     * @param usrsData 客户数据
     * @return 客户数据
     */
    @Override
    public List<UsrsData> selectUsrsDataList(UsrsData usrsData)
    {
        return usrsDataMapper.selectUsrsDataList(usrsData);
    }

    /**
     * 新增客户数据
     *
     * @param usrsData 客户数据
     * @return 结果
     */
    @Override
    public int insertUsrsData(UsrsData usrsData)
    {
        usrsData.setCreateTime(DateUtils.getNowDate());
        return usrsDataMapper.insertUsrsData(usrsData);
    }

    /**
     * 修改客户数据
     *
     * @param usrsData 客户数据
     * @return 结果
     */
    @Override
    public int updateUsrsData(UsrsData usrsData)
    {
        usrsData.setUpdateTime(DateUtils.getNowDate());
        return usrsDataMapper.updateUsrsData(usrsData);
    }

    /**
     * 批量删除客户数据
     *
     * @param dataIds 需要删除的客户数据ID
     * @return 结果
     */
    @Override
    public int deleteUsrsDataByIds(Long[] dataIds)
    {
        return usrsDataMapper.deleteUsrsDataByIds(dataIds);
    }

    /**
     * 删除客户数据信息
     *
     * @param dataId 客户数据ID
     * @return 结果
     */
    @Override
    public int deleteUsrsDataById(Long dataId)
    {
        return usrsDataMapper.deleteUsrsDataById(dataId);
    }
}
