package com.springdemo.SpringAnnoatation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // ('iphone') // by default id given which is non  Qualified and  De-capitalized   if we didn't mention   

public class Iphone {
	
	
	@Autowired

	MobileProcessor cpu;
	
	
        public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


public void config() {
	
	System.out.println("IOS , 5 gb ram , 20Mp Camera");
		
	cpu.process();
}

}

