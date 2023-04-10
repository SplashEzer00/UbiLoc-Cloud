package com.UbiLoc.system.service.impl;

import java.util.List;
import com.UbiLoc.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.UbiLoc.system.mapper.UsrsPeoplesMapper;
import com.UbiLoc.system.domain.UsrsPeoples;
import com.UbiLoc.system.service.IUsrsPeoplesService;

/**
 * 客户信息Service业务层处理
 *
 * @author UbiLoc
 * @date 2023-04-10
 */
@Service
public class UsrsPeoplesServiceImpl implements IUsrsPeoplesService
{
    @Autowired
    private UsrsPeoplesMapper usrsPeoplesMapper;

    /**
     * 查询客户信息
     *
     * @param userId 客户信息ID
     * @return 客户信息
     */
    @Override
    public UsrsPeoples selectUsrsPeoplesById(Long userId)
    {
        return usrsPeoplesMapper.selectUsrsPeoplesById(userId);
    }

    /**
     * 查询客户信息列表
     *
     * @param usrsPeoples 客户信息
     * @return 客户信息
     */
    @Override
    public List<UsrsPeoples> selectUsrsPeoplesList(UsrsPeoples usrsPeoples)
    {
        return usrsPeoplesMapper.selectUsrsPeoplesList(usrsPeoples);
    }

    /**
     * 新增客户信息
     *
     * @param usrsPeoples 客户信息
     * @return 结果
     */
    @Override
    public int insertUsrsPeoples(UsrsPeoples usrsPeoples)
    {
        usrsPeoples.setCreateTime(DateUtils.getNowDate());
        return usrsPeoplesMapper.insertUsrsPeoples(usrsPeoples);
    }

    /**
     * 修改客户信息
     *
     * @param usrsPeoples 客户信息
     * @return 结果
     */
    @Override
    public int updateUsrsPeoples(UsrsPeoples usrsPeoples)
    {
        usrsPeoples.setUpdateTime(DateUtils.getNowDate());
        return usrsPeoplesMapper.updateUsrsPeoples(usrsPeoples);
    }

    /**
     * 批量删除客户信息
     *
     * @param userIds 需要删除的客户信息ID
     * @return 结果
     */
    @Override
    public int deleteUsrsPeoplesByIds(Long[] userIds)
    {
        return usrsPeoplesMapper.deleteUsrsPeoplesByIds(userIds);
    }

    /**
     * 删除客户信息信息
     *
     * @param userId 客户信息ID
     * @return 结果
     */
    @Override
    public int deleteUsrsPeoplesById(Long userId)
    {
        return usrsPeoplesMapper.deleteUsrsPeoplesById(userId);
    }
}
