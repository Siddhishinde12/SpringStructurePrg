package com.infosys.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.infosys.dto.LoginDTO;

// @component @repository @ service 
// this repo is nothing but your dao class

@Repository
public class LoginRepository {
		
	public LoginDTO   loginAuthentication(String uname) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("Thakur", "Nashik");
		hm.put("Chaintanya", "Jalgaon");
		hm.put("Pratiksha", "Dhule");
		
		String pwd = hm.get(uname);
		LoginDTO dto = new LoginDTO(uname,pwd);
		
		return dto;
		
	}


}
