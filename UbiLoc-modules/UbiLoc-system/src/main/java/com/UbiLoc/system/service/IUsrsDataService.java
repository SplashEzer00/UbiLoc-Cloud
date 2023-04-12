package com.UbiLoc.system.service;

import java.util.List;
import com.UbiLoc.system.domain.UsrsData;

/**
 * 客户数据Service接口
 * 
 * @author UbiLoc
 * @date 2023-04-12
 */
public interface IUsrsDataService 
{
    /**
     * 查询客户数据
     * 
     * @param dataId 客户数据ID
     * @return 客户数据
     */
    public UsrsData selectUsrsDataById(Long dataId);

    /**
     * 查询客户数据列表
     * 
     * @param usrsData 客户数据
     * @return 客户数据集合
     */
    public List<UsrsData> selectUsrsDataList(UsrsData usrsData);

    /**
     * 新增客户数据
     * 
     * @param usrsData 客户数据
     * @return 结果
     */
    public int insertUsrsData(UsrsData usrsData);

    /**
     * 修改客户数据
     * 
     * @param usrsData 客户数据
     * @return 结果
     */
    public int updateUsrsData(UsrsData usrsData);

    /**
     * 批量删除客户数据
     * 
     * @param dataIds 需要删除的客户数据ID
     * @return 结果
     */
    public int deleteUsrsDataByIds(Long[] dataIds);

    /**
     * 删除客户数据信息
     * 
     * @param dataId 客户数据ID
     * @return 结果
     */
    public int deleteUsrsDataById(Long dataId);
}
