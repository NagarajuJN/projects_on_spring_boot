package com.springdemo.Demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */

    public class App 
    	{
        public static void main( String[] args )
        {
        	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class); // we are using the annotation based config not xml based
        	Iphone i13 = factory.getBean(Iphone.class);
        	i13.config();
        }
    

    	
    	}
  