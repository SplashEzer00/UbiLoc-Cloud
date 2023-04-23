package com.MotCap.system.mapper;

import java.util.List;
import com.MotCap.system.domain.UsrsPeoples;

/**
 * 客户信息Mapper接口
 * 
 * @author MotCap
 * @date 2023-04-23
 */
public interface UsrsPeoplesMapper 
{
    /**
     * 查询客户信息
     * 
     * @param userId 客户信息ID
     * @return 客户信息
     */
    public UsrsPeoples selectUsrsPeoplesById(Long userId);

    /**
     * 查询客户信息列表
     * 
     * @param usrsPeoples 客户信息
     * @return 客户信息集合
     */
    public List<UsrsPeoples> selectUsrsPeoplesList(UsrsPeoples usrsPeoples);

    /**
     * 新增客户信息
     * 
     * @param usrsPeoples 客户信息
     * @return 结果
     */
    public int insertUsrsPeoples(UsrsPeoples usrsPeoples);

    /**
     * 修改客户信息
     * 
     * @param usrsPeoples 客户信息
     * @return 结果
     */
    public int updateUsrsPeoples(UsrsPeoples usrsPeoples);

    /**
     * 删除客户信息
     * 
     * @param userId 客户信息ID
     * @return 结果
     */
    public int deleteUsrsPeoplesById(Long userId);

    /**
     * 批量删除客户信息
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUsrsPeoplesByIds(Long[] userIds);
}
