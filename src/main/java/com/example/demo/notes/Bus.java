package com.example.demo.notes;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Car{
	@Override
	public void print() {
		System.out.println("我是一辆巴士");
	}
}
