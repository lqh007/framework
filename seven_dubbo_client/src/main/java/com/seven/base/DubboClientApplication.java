package com.seven.base;

import com.seven.base.service.CityDubboConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@ServletComponentScan
@SpringBootApplication
@EnableScheduling
public class DubboClientApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DubboClientApplication.class, args);
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(DubboClientApplication.class, args);
        CityDubboConsumerService cityService = run.getBean(CityDubboConsumerService.class);
        cityService.printCity();
    }
}
