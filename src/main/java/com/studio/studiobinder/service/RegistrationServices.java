package com.studio.studiobinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studio.studiobinder.dao.RegistrationDao;
import com.studio.studiobinder.pojo.RegistrationPojo;

@Service
public class RegistrationServices implements RegistrationService  {
	
	@Autowired
	private RegistrationDao registrationDao;

	public void saveUser(RegistrationPojo registrationPojo) {
		registrationDao.save(registrationPojo);
		
	}

	

	public RegistrationPojo getUserById(Integer id) {
		RegistrationPojo rp=registrationDao.findOne(id);
		return rp;
	}

	public List<RegistrationPojo> getAllUsers() {
		
		List<RegistrationPojo> lrp=registrationDao.findAll();
		
		return lrp;
	}



	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		registrationDao.delete(id);
		
	}
	
	

}
