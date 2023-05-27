package com.MotCap.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.MotCap.common.core.annotation.Excel;
import com.MotCap.common.core.web.domain.BaseEntity;

/**
 * 球星信息对象 players_data
 *
 * @author MotCap
 * @date 2023-05-28
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

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 介绍 */
    @Excel(name = "介绍")
    private String intro;

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
    public void setIntro(String intro)
    {
        this.intro = intro;
    }

    public String getIntro()
    {
        return intro;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("playerId", getPlayerId())
            .append("playerName", getPlayerName())
            .append("sex", getSex())
            .append("avatar", getAvatar())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("intro", getIntro())
            .append("remark", getRemark())
            .toString();
    }
}
