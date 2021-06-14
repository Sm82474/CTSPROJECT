package com.airlines.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airlines.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Admin findByAdminIdAndEmailIdAndPassword(int adminId,String emailId,String password);
	Admin findByAdminId(int adminId);
	
}
