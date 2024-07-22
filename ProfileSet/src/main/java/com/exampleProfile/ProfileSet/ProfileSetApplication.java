package com.exampleProfile.ProfileSet;

import com.exampleProfile.ProfileSet.Service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfileSetApplication {

	public static void main(String[] args) {


		ApplicationContext context=  SpringApplication.run(ProfileSetApplication.class, args);
		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.getDataSourceInfo());
	}

}
