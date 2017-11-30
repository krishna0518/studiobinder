package com.studio.studiobinder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studio.studiobinder.pojo.Rolepojo;

@Repository
public interface RoleDao extends JpaRepository<Rolepojo,Integer >{

}
