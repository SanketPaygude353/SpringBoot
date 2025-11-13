package com.phoenix.component.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.phoenix.component.annotations")
public class AppConfig {
}
