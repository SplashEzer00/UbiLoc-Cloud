package com.UbiLoc.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.UbiLoc.common.core.annotation.Excel;
import com.UbiLoc.common.core.web.domain.BaseEntity;

/**
 * 客户数据对象 usrs_data
 *
 * @author UbiLoc
 * @date 2023-04-12
 */
public class UsrsData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 数据ID */
    private Long dataId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 用户账号 */
    @Excel(name = "用户账号")
    private String userName;

    /** 用户昵称 */
    @Excel(name = "用户昵称")
    private String nickName;

    /** 数据1 */
    @Excel(name = "数据1")
    private String data1;

    /** 数据2 */
    @Excel(name = "数据2")
    private String data2;

    /** 数据3 */
    @Excel(name = "数据3")
    private String data3;

    /** 数据4 */
    @Excel(name = "数据4")
    private String data4;

    /** 数据5 */
    @Excel(name = "数据5")
    private String data5;

    /** 数据6 */
    @Excel(name = "数据6")
    private String data6;

    /** 数据状态（0正常 1停用） */
    @Excel(name = "数据状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setDataId(Long dataId)
    {
        this.dataId = dataId;
    }

    public Long getDataId()
    {
        return dataId;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }
    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public String getNickName()
    {
        return nickName;
    }
    public void setData1(String data1)
    {
        this.data1 = data1;
    }

    public String getData1()
    {
        return data1;
    }
    public void setData2(String data2)
    {
        this.data2 = data2;
    }

    public String getData2()
    {
        return data2;
    }
    public void setData3(String data3)
    {
        this.data3 = data3;
    }

    public String getData3()
    {
        return data3;
    }
    public void setData4(String data4)
    {
        this.data4 = data4;
    }

    public String getData4()
    {
        return data4;
    }
    public void setData5(String data5)
    {
        this.data5 = data5;
    }

    public String getData5()
    {
        return data5;
    }
    public void setData6(String data6)
    {
        this.data6 = data6;
    }

    public String getData6()
    {
        return data6;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dataId", getDataId())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("nickName", getNickName())
            .append("data1", getData1())
            .append("data2", getData2())
            .append("data3", getData3())
            .append("data4", getData4())
            .append("data5", getData5())
            .append("data6", getData6())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
