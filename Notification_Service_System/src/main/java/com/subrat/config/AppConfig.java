package com.subrat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.subrat.sbeans","com.subrat.factory"})
public class AppConfig {

}
