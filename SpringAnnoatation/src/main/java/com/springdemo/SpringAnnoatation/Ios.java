package com.springdemo.SpringAnnoatation;

import org.springframework.stereotype.Component;

@Component
public class Ios implements MobileProcessor {
	public void  process()
	{
		System.out.println("World best Mobile Processor....!!");
	}

}
