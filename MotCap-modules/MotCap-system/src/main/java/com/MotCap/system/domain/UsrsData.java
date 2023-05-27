package com.MotCap.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.MotCap.common.core.annotation.Excel;
import com.MotCap.common.core.web.domain.BaseEntity;

/**
 * 三维数据对象 usrs_data
 *
 * @author MotCap
 * @date 2023-05-28
 */
public class UsrsData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 数据ID */
    private Long dataId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** A_Xmean */
    @Excel(name = "A_Xmean")
    private String aXmean;

    /** A_Ymean */
    @Excel(name = "A_Ymean")
    private String aYmean;

    /** A_Zmean */
    @Excel(name = "A_Zmean")
    private String aZmean;

    /** A_Xstd */
    @Excel(name = "A_Xstd")
    private String aXstd;

    /** A_Ystd */
    @Excel(name = "A_Ystd")
    private String aYstd;

    /** A_Zstd */
    @Excel(name = "A_Zstd")
    private String aZstd;

    /** G_Xmean */
    @Excel(name = "G_Xmean")
    private String gXmean;

    /** G_Ymean */
    @Excel(name = "G_Ymean")
    private String gYmean;

    /** G_Zmean */
    @Excel(name = "G_Zmean")
    private String gZmean;

    /** G_Xstd */
    @Excel(name = "G_Xstd")
    private String gXstd;

    /** G_Ystd */
    @Excel(name = "G_Ystd")
    private String gYstd;

    /** G_Zstd */
    @Excel(name = "G_Zstd")
    private String gZstd;

    /** 部位 */
    @Excel(name = "部位")
    private String part;

    /** 模式 */
    @Excel(name = "模式")
    private String state;

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
    public void setaXmean(String aXmean)
    {
        this.aXmean = aXmean;
    }

    public String getaXmean()
    {
        return aXmean;
    }
    public void setaYmean(String aYmean)
    {
        this.aYmean = aYmean;
    }

    public String getaYmean()
    {
        return aYmean;
    }
    public void setaZmean(String aZmean)
    {
        this.aZmean = aZmean;
    }

    public String getaZmean()
    {
        return aZmean;
    }
    public void setaXstd(String aXstd)
    {
        this.aXstd = aXstd;
    }

    public String getaXstd()
    {
        return aXstd;
    }
    public void setaYstd(String aYstd)
    {
        this.aYstd = aYstd;
    }

    public String getaYstd()
    {
        return aYstd;
    }
    public void setaZstd(String aZstd)
    {
        this.aZstd = aZstd;
    }

    public String getaZstd()
    {
        return aZstd;
    }
    public void setgXmean(String gXmean)
    {
        this.gXmean = gXmean;
    }

    public String getgXmean()
    {
        return gXmean;
    }
    public void setgYmean(String gYmean)
    {
        this.gYmean = gYmean;
    }

    public String getgYmean()
    {
        return gYmean;
    }
    public void setgZmean(String gZmean)
    {
        this.gZmean = gZmean;
    }

    public String getgZmean()
    {
        return gZmean;
    }
    public void setgXstd(String gXstd)
    {
        this.gXstd = gXstd;
    }

    public String getgXstd()
    {
        return gXstd;
    }
    public void setgYstd(String gYstd)
    {
        this.gYstd = gYstd;
    }

    public String getgYstd()
    {
        return gYstd;
    }
    public void setgZstd(String gZstd)
    {
        this.gZstd = gZstd;
    }

    public String getgZstd()
    {
        return gZstd;
    }
    public void setPart(String part)
    {
        this.part = part;
    }

    public String getPart()
    {
        return part;
    }
    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
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
            .append("aXmean", getaXmean())
            .append("aYmean", getaYmean())
            .append("aZmean", getaZmean())
            .append("aXstd", getaXstd())
            .append("aYstd", getaYstd())
            .append("aZstd", getaZstd())
            .append("gXmean", getgXmean())
            .append("gYmean", getgYmean())
            .append("gZmean", getgZmean())
            .append("gXstd", getgXstd())
            .append("gYstd", getgYstd())
            .append("gZstd", getgZstd())
            .append("part", getPart())
            .append("state", getState())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
