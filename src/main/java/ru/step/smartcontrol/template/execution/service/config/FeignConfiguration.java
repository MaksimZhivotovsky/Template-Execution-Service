package ru.step.smartcontrol.template.execution.service.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "ru.step.smartcontrol.template.execution.service")
public class FeignConfiguration {

//    @Bean
//    public AppFeignErrorDecoder myAppFeignErrorDecoder() {
//        return new AppFeignErrorDecoder();
//    }
}
