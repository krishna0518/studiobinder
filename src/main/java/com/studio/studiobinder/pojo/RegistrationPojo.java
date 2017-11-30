package com.studio.studiobinder.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="registration")
public class RegistrationPojo {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String fulName;
	private String companyName;
	private String emailId;
	private String password;
	private String createdBy;
	private String createdOn;
	private String modifiedBy;
	 
	private String modifiedOn;
	
	@ManyToMany
	@JoinTable(name="rolemapping",joinColumns={@JoinColumn(name="registrationid")},inverseJoinColumns={@JoinColumn(name="roleid")})
	private List<Rolepojo> roleId;
	
	//private int[] value;
	
	public List<Rolepojo> getRoleId() {
		return roleId;
	}
	public void setRoleId(List<Rolepojo> roleId) {
		this.roleId = roleId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFulName() {
		return fulName;
	}
	public void setFulName(String fulName) {
		this.fulName = fulName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

}
