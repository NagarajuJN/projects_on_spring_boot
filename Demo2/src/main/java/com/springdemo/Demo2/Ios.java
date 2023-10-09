package com.springdemo.Demo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary


public class Ios implements MobileProcessor {
	public void process() {
		// TODO Auto-generated method stub

		System.out.println("World best Mobile Processor....");
	}

}
