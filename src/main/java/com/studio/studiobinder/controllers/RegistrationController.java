package com.studio.studiobinder.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studio.studiobinder.pojo.RegistrationPojo;
import com.studio.studiobinder.pojo.Rolepojo;
import com.studio.studiobinder.service.RegistrationService;

@RestController
@RequestMapping("registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void savauserdetails(@RequestBody RegistrationPojo registrationPojo )
	{
		/*List<Rolepojo> list = new ArrayList<Rolepojo>();
		int i=0;
		for(Integer rs : id)
		{
			Rolepojo r = new Rolepojo();
			r.setId(id[i]);
			list.add(r);
			i++;
		}		
		registrationPojo.setRoleId(list);*/
		
		registrationService.saveUser(registrationPojo);
	}
	
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	public List<RegistrationPojo> getallusers()
	{
		
		List<RegistrationPojo> list=registrationService.getAllUsers();
		
		return list;
		
	}
	
	@RequestMapping(value="/getid/{id}",method=RequestMethod.GET)
	public RegistrationPojo getuserbyid(@PathVariable Integer id)
	{
		
		RegistrationPojo userdata=registrationService.getUserById(id);
		
		return userdata;
		
	}
	
	@RequestMapping(value="/deletebyid/{id}",method=RequestMethod.DELETE)
	public void deletebyid(@PathVariable Integer id)
	{
		
		registrationService.deleteUser(id);
		
		
		
	}

}
