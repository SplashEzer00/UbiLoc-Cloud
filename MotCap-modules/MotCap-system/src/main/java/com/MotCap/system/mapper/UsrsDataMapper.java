package com.MotCap.system.mapper;

import java.util.List;
import com.MotCap.system.domain.UsrsData;

/**
 * 客户数据Mapper接口
 * 
 * @author MotCap
 * @date 2023-04-23
 */
public interface UsrsDataMapper 
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
     * 删除客户数据
     * 
     * @param dataId 客户数据ID
     * @return 结果
     */
    public int deleteUsrsDataById(Long dataId);

    /**
     * 批量删除客户数据
     * 
     * @param dataIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUsrsDataByIds(Long[] dataIds);
}
