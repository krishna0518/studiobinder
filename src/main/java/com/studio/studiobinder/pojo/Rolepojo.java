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
@Table(name="role")
public class Rolepojo {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String code;
	
	//@ManyToMany(mappedBy="roleId",cascade=CascadeType.ALL)
	//@JoinTable(name="rolemapping",joinColumns={@JoinColumn(name="registrationid")},inverseJoinColumns={@JoinColumn(name="roleid")})
	//private List<RegistrationPojo> registrationId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
