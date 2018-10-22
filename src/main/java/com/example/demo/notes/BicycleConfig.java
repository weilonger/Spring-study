package com.example.demo.notes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//该注释表示该类为容器类
public class BicycleConfig {
	@Bean("Bicycle")
	public Car getBicycle() {
		return new Bicycle();
	}
}
