package com.example.springktautowiringconstructor

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigurationTest {

    @Bean
    //@ConditionalOnProperty(name = ["bean-test.enable"], havingValue = "true")
    fun beanTest(): MyService {
       return MyServiceImpl("hello")
    }
}