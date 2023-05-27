package com.MotCap.system.mapper;

import java.util.List;
import com.MotCap.system.domain.UsrsData;

/**
 * 三维数据Mapper接口
 * 
 * @author MotCap
 * @date 2023-05-28
 */
public interface UsrsDataMapper 
{
    /**
     * 查询三维数据
     * 
     * @param dataId 三维数据ID
     * @return 三维数据
     */
    public UsrsData selectUsrsDataById(Long dataId);

    /**
     * 查询三维数据列表
     * 
     * @param usrsData 三维数据
     * @return 三维数据集合
     */
    public List<UsrsData> selectUsrsDataList(UsrsData usrsData);

    /**
     * 新增三维数据
     * 
     * @param usrsData 三维数据
     * @return 结果
     */
    public int insertUsrsData(UsrsData usrsData);

    /**
     * 修改三维数据
     * 
     * @param usrsData 三维数据
     * @return 结果
     */
    public int updateUsrsData(UsrsData usrsData);

    /**
     * 删除三维数据
     * 
     * @param dataId 三维数据ID
     * @return 结果
     */
    public int deleteUsrsDataById(Long dataId);

    /**
     * 批量删除三维数据
     * 
     * @param dataIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUsrsDataByIds(Long[] dataIds);
}
