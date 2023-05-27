package com.MotCap.system.service;

import java.util.List;
import com.MotCap.system.domain.UsrsData;

/**
 * 三维数据Service接口
 * 
 * @author MotCap
 * @date 2023-05-28
 */
public interface IUsrsDataService 
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
     * 批量删除三维数据
     * 
     * @param dataIds 需要删除的三维数据ID
     * @return 结果
     */
    public int deleteUsrsDataByIds(Long[] dataIds);

    /**
     * 删除三维数据信息
     * 
     * @param dataId 三维数据ID
     * @return 结果
     */
    public int deleteUsrsDataById(Long dataId);
}
