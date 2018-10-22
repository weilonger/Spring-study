package com.example.demo.notes;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BusConfig.class,BicycleConfig.class})
public class AllConfig {

}
