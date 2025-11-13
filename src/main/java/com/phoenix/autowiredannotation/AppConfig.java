package com.phoenix.autowiredannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.phoenix.autowiredannotation")
public class AppConfig {
}
