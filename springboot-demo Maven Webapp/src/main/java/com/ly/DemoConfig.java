package com.ly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@MapperScan("com.ly.mapper")
@SpringBootApplication
public class DemoConfig extends SpringBootServletInitializer{
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoConfig.class);
    }
      
    public static void main(String[] args){  
        SpringApplication.run(DemoConfig.class,  "--server.port=9999");  
          
    }  
}
