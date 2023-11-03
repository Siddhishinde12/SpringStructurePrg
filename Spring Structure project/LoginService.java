package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.dto.LoginDTO;
import com.infosys.exception.LoginException;
import com.infosys.repository.LoginRepository;

@Service
public class LoginService {
     @Autowired
	LoginRepository repo;
	
	public String loginServiceAuthentication(LoginDTO dto) throws LoginException {
		
		  LoginDTO mydto= repo.loginAuthentication(dto.getUsername());
		  
		  String pwd= mydto.getPwd();// this is the actal passwod
		  String status="Unsuccess";
		  if(pwd.equals(dto.getPwd())) {
			  status="Success";
		  }
		  else
			   throw new LoginException("Sorry Invalid Password");
		    
		  return status;
		
	}
	
}
