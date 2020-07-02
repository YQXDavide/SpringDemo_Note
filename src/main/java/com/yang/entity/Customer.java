package com.yang.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 * 客户实体类
 * @author yang
 *
 */
public class Customer implements Serializable {
	private long custId;
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;
	private String custAddress;
	private String custPhone;
	//一对多关系映射一的一方，包含从表实体的集合引用
	private Set<LinkMan> links =new  HashSet<LinkMan>(0);
	public Customer() {
		
	}
	public Customer(Long custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
	public Set<LinkMan> getLinks() {
		return links;
	}
	public void setLinks(Set<LinkMan> links) {
		this.links = links;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custSource=" + custSource
				+ ", custIndustry=" + custIndustry + ", custLevel=" + custLevel + ", custAddress=" + custAddress
				+ ", custPhone=" + custPhone + "]";
	}
	   
}
