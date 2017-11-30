package com.studio.studiobinder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studio.studiobinder.pojo.RegistrationPojo;

@Repository
public interface RegistrationDao extends JpaRepository<RegistrationPojo,Integer > {

}
