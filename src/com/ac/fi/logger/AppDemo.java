package com.ac.fi.logger;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;

public class AppDemo {
	static Logger log = Logger.getLogger(AppDemo.class.getName());
	
	public static void main(String[] args) throws IOException, SQLException {
		
		System.out.println(AppDemo.class.getName());
		log.debug("Hello from the Debug ");
		log.info("Hello from the Info ");
	}
	
}
