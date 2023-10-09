package com.springdemo.Demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Iphone { 
	
	@Autowired
	@Qualifier("ios")
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		
		// TODO Auto-generated method stub
		System.out.println("Ios , 6 gb , 130 mp");
		cpu.process();
	}
}

