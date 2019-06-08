package com.uem.alugai;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import com.uem.views.Logon;

@SpringBootApplication
public class AlugaiApplication{

	public static void main(String[] args) {		
		Logon logon  = new Logon();
		logon.frmAluga.setVisible(true);
	    
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlugaiApplication.class).headless(false).run(args);
	 
	}
}
	


