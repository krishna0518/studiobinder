package com.studio.studiobinder.service;

import java.util.List;

import com.studio.studiobinder.pojo.RegistrationPojo;

public interface RegistrationService {
	public void saveUser(RegistrationPojo registrationPojo);
	public void deleteUser(Integer id);
	public RegistrationPojo getUserById(Integer id);
	public List<RegistrationPojo> getAllUsers();

}
