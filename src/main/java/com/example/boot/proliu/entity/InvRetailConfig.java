package com.example.boot.proliu.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * é¨åºæç»æ ¡éªéç½®è¡¨
 * </p>
 *
 * @author zhaokun
 * @since 2019-01-15
 */
public class InvRetailConfig  {

    private static final long serialVersionUID = 1L;

	private Long id;
    /**
     * 启用状态
     */
	private String status;
    /**
     * 配置类型
     */
	private String configType;
    /**
     * 区域编码
     */
	private String areaCode;
    /**
     * 区域名称
     */
	private String areaName;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 创建人ID
     */
	private Integer createUserId;
    /**
     * 创建人名称
     */
	private String createUserName;
    /**
     * 更新时间
     */
	private Date updateTime;
    /**
     * 更新人ID
     */
	private Integer updateUserId;
    /**
     * 更新人名称
     */
	private String updateUserName;
	private Integer version;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConfigType() {
		return configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}



	@Override
	public String toString() {
		return "InvRetailConfig{" +
			"id=" + id +
			", status=" + status +
			", configType=" + configType +
			", areaCode=" + areaCode +
			", areaName=" + areaName +
			", createTime=" + createTime +
			", createUserId=" + createUserId +
			", createUserName=" + createUserName +
			", updateTime=" + updateTime +
			", updateUserId=" + updateUserId +
			", updateUserName=" + updateUserName +
			", version=" + version +
			"}";
	}
}
