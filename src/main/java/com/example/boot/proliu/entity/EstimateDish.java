package com.example.boot.proliu.entity;



import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author liujunhan
 * @since 2019-04-10
 */
public class EstimateDish implements Serializable {

    private static final long serialVersionUID = 1L;

	private Integer id;
    /**
     * 菜品名称
     */
	private String dishName;
    /**
     * 菜品code
     */
	private String dishCode;

	/**
	 * 预估日期
	 */
	private Date estimateTime;
    /**
     * 门店编码
     */
	private String retailCode;
    /**
     * 门店名称
     */
	private String retailName;
    /**
     * 档口编码
     */
	private String deptCode;
    /**
     * 档口名称
     */
	private String deptName;
    /**
     * 午餐外卖预估数量
     */
	private BigDecimal lunchTakeawayQty;
    /**
     * 堂食数量
     */
	private BigDecimal lunchHereQty;
    /**
     * 晚餐外卖数量
     */
	private BigDecimal dinnerTakeawayQty;
    /**
     * 晚餐堂食数量
     */
	private BigDecimal dinnerHereQty;
    /**
     * 午餐数量
     */
	private BigDecimal lunchTotalQty;
    /**
     * 晚餐数量
     */
	private BigDecimal dinnerTotalQty;
    /**
     * 0未推送    1 已推送
     */
	private Integer pushStatus;
    /**
     * 说明
     */
	private String remak;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 创建人编码
     */
	private String createBy;
    /**
     * 修改时间
     */
	private Date updataTime;
    /**
     * 修改人编码
     */
	private String updataBy;
    /**
     * 是否已拆分
     */
	private Integer splitStatus;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishCode() {
		return dishCode;
	}

	public void setDishCode(String dishCode) {
		this.dishCode = dishCode;
	}

	public Date getEstimateTime() {
		return estimateTime;
	}

	public void setEstimateTime(Date estimateTime) {
		this.estimateTime = estimateTime;
	}

	public String getRetailCode() {
		return retailCode;
	}

	public void setRetailCode(String retailCode) {
		this.retailCode = retailCode;
	}

	public String getRetailName() {
		return retailName;
	}

	public void setRetailName(String retailName) {
		this.retailName = retailName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public BigDecimal getLunchTakeawayQty() {
		return lunchTakeawayQty;
	}

	public void setLunchTakeawayQty(BigDecimal lunchTakeawayQty) {
		this.lunchTakeawayQty = lunchTakeawayQty;
	}

	public BigDecimal getLunchHereQty() {
		return lunchHereQty;
	}

	public void setLunchHereQty(BigDecimal lunchHereQty) {
		this.lunchHereQty = lunchHereQty;
	}

	public BigDecimal getDinnerTakeawayQty() {
		return dinnerTakeawayQty;
	}

	public void setDinnerTakeawayQty(BigDecimal dinnerTakeawayQty) {
		this.dinnerTakeawayQty = dinnerTakeawayQty;
	}

	public BigDecimal getDinnerHereQty() {
		return dinnerHereQty;
	}

	public void setDinnerHereQty(BigDecimal dinnerHereQty) {
		this.dinnerHereQty = dinnerHereQty;
	}

	public BigDecimal getLunchTotalQty() {
		return lunchTotalQty;
	}

	public void setLunchTotalQty(BigDecimal lunchTotalQty) {
		this.lunchTotalQty = lunchTotalQty;
	}

	public BigDecimal getDinnerTotalQty() {
		return dinnerTotalQty;
	}

	public void setDinnerTotalQty(BigDecimal dinnerTotalQty) {
		this.dinnerTotalQty = dinnerTotalQty;
	}

	public Integer getPushStatus() {
		return pushStatus;
	}

	public void setPushStatus(Integer pushStatus) {
		this.pushStatus = pushStatus;
	}

	public String getRemak() {
		return remak;
	}

	public void setRemak(String remak) {
		this.remak = remak;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdataTime() {
		return updataTime;
	}

	public void setUpdataTime(Date updataTime) {
		this.updataTime = updataTime;
	}

	public String getUpdataBy() {
		return updataBy;
	}

	public void setUpdataBy(String updataBy) {
		this.updataBy = updataBy;
	}

	public Integer getSplitStatus() {
		return splitStatus;
	}

	public void setSplitStatus(Integer splitStatus) {
		this.splitStatus = splitStatus;
	}


	public EstimateDish() {
	}






	@Override
	public String toString() {
		return "EstimateDish{" +
			"id=" + id +
			", dishName=" + dishName +
			", dishCode=" + dishCode +
			", estimateTime=" + estimateTime +
			", retailCode=" + retailCode +
			", retailName=" + retailName +
			", deptCode=" + deptCode +
			", deptName=" + deptName +
			", lunchTakeawayQty=" + lunchTakeawayQty +
			", lunchHereQty=" + lunchHereQty +
			", dinnerTakeawayQty=" + dinnerTakeawayQty +
			", dinnerHereQty=" + dinnerHereQty +
			", lunchTotalQty=" + lunchTotalQty +
			", dinnerTotalQty=" + dinnerTotalQty +
			", pushStatus=" + pushStatus +
			", remak=" + remak +
			", createTime=" + createTime +
			", createBy=" + createBy +
			", updataTime=" + updataTime +
			", updataBy=" + updataBy +
			", splitStatus=" + splitStatus +
			"}";
	}
}
