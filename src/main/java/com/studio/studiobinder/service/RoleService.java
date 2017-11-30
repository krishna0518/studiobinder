package com.studio.studiobinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studio.studiobinder.dao.RoleDao;
import com.studio.studiobinder.pojo.Rolepojo;

@Service
public class RoleService implements Irole {
	
	@Autowired
	private RoleDao roleDao;

	public void saveRole(Rolepojo rolepojo) {
		// TODO Auto-generated method stub
		roleDao.save(rolepojo);
	}

	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		roleDao.delete(id);
		
	}

	public Rolepojo getRoleById(Integer id) {
		// TODO Auto-generated method stub
		Rolepojo role=roleDao.findOne(id);
		
		return role;
	}

	public List<Rolepojo> getAllRole() {
		// TODO Auto-generated method stub
		
		List<Rolepojo> list = roleDao.findAll();
				
		return list;
	}

}
