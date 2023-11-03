package com.infosys.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.config.MyConfig;
import com.infosys.dto.LoginDTO;
import com.infosys.exception.LoginException;
import com.infosys.service.LoginService;

public class LoginMain {
	
	
	public static void main(String[] args) {
	
		
		AnnotationConfigApplicationContext cnt = new AnnotationConfigApplicationContext(MyConfig.class);
		LoginService service= cnt.getBean(LoginService.class);
		
		LoginDTO dto= new LoginDTO("Thakur","Pune");
		try {
		String status= service.loginServiceAuthentication(dto);
		System.out.println(status);
		
		}
		catch(LoginException e) {
			System.out.println(e);
		}
		
		
	}

}
