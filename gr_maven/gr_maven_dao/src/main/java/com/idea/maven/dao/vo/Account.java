package com.idea.maven.dao.vo;

import java.math.BigInteger;
import java.util.Date;

public class Account {
	
	private BigInteger id;
	private Short active;
	private Long version;
	private Date createTime;
	private BigInteger createUserId;
	private Date modifyTime;
	private BigInteger modifyUserId;
	private String originSystem;
	private BigInteger accountId;
	private String accountName;
	private Double amount;
	private Double frozen;
	private Double noWithdrawCashAmount;
	private Short status;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Short getActive() {
		return active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigInteger getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(BigInteger createUserId) {
		this.createUserId = createUserId;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public BigInteger getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(BigInteger modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getOriginSystem() {
		return originSystem;
	}

	public void setOriginSystem(String originSystem) {
		this.originSystem = originSystem;
	}

	public BigInteger getAccountId() {
		return accountId;
	}

	public void setAccountId(BigInteger accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getFrozen() {
		return frozen;
	}

	public void setFrozen(Double frozen) {
		this.frozen = frozen;
	}

	public Double getNoWithdrawCashAmount() {
		return noWithdrawCashAmount;
	}

	public void setNoWithdrawCashAmount(Double noWithdrawCashAmount) {
		this.noWithdrawCashAmount = noWithdrawCashAmount;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

}
