package com.example.demo.notes;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
//该注释表示该类为容器类
public class BusConfig {
	
	@Bean("Bus")
	public Car getBus() {
		return new Bus();
	}
}
