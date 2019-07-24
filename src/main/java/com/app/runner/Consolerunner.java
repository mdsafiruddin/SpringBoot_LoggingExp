package com.app.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consolerunner implements CommandLineRunner {
	private static Logger log=LogManager.getLogger(Consolerunner.class);

	@Override
	public void run(String... args) throws Exception {
		try {
			log.info("Console Runner Start");
			int a=10,b=20,c=-1;
			log.info("data insertion done ");
			if(a>0&&b>0) {
				c=a+b;
				log.info("if block is excecuted");
			}
			log.debug("final result is::"+c);
			if(c>0) throw new RuntimeException("Hello programmer");
		}catch (Exception e) {
			log.error("exception is found::"+e);
			//e.printStackTrace();
		}
		// server stop
			System.exit(0);
	}

}
