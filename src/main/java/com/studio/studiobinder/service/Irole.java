package com.studio.studiobinder.service;

import java.util.List;

import com.studio.studiobinder.pojo.Rolepojo;

public interface Irole {
	public void saveRole(Rolepojo rolepojo);
	public void deleteRole(Integer id);
	public Rolepojo getRoleById(Integer id);
	public List<Rolepojo> getAllRole();

}
