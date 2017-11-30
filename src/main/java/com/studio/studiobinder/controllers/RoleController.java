package com.studio.studiobinder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studio.studiobinder.pojo.Rolepojo;
import com.studio.studiobinder.service.RoleService;

@RestController
@RequestMapping("role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public void savaRoleDetails(@RequestBody Rolepojo rolepojo)
	{
		
		roleService.saveRole(rolepojo);
	}
	
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	public List<Rolepojo> getAllRole()
	{
		
		List<Rolepojo> list=roleService.getAllRole();
		
		return list;
		
	}
	
	@RequestMapping(value="/getid/{id}",method=RequestMethod.GET)
	public Rolepojo getUserById(@PathVariable Integer id)
	{
		
		Rolepojo userdata=roleService.getRoleById(id);
		
		return userdata;
		
	}
	
	@RequestMapping(value="/deletebyid/{id}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable Integer id)
	{
		
		roleService.deleteRole(id);
		
		
		
	}

	

}
