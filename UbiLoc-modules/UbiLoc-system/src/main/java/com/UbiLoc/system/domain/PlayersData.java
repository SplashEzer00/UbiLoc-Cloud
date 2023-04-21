package com.UbiLoc.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.UbiLoc.common.core.annotation.Excel;
import com.UbiLoc.common.core.web.domain.BaseEntity;

/**
 * 球星数据对象 players_data
 *
 * @author UbiLoc
 * @date 2023-04-21
 */
public class PlayersData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 球星ID */
    private Long playerId;

    /** 球星名 */
    @Excel(name = "球星名")
    private String playerName;

    /** 球星性别（0男 1女 2未知） */
    @Excel(name = "球星性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 头像地址 */
    @Excel(name = "头像地址")
    private String avatar;

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

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setPlayerId(Long playerId)
    {
        this.playerId = playerId;
    }

    public Long getPlayerId()
    {
        return playerId;
    }
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public String getPlayerName()
    {
        return playerName;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }

    public String getAvatar()
    {
        return avatar;
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
    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("playerId", getPlayerId())
            .append("playerName", getPlayerName())
            .append("sex", getSex())
            .append("avatar", getAvatar())
            .append("data1", getData1())
            .append("data2", getData2())
            .append("data3", getData3())
            .append("data4", getData4())
            .append("data5", getData5())
            .append("data6", getData6())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
