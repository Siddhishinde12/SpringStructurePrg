package com.infosys.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.infosys.repository com.infosys.service"})
public class MyConfig {

}
