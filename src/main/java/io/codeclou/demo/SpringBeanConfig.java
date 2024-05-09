package io.codeclou.demo;

import io.codeclou.demo.services.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

    @Bean
    public OrderService initOrderService() {
        return new OrderService();
    }
}
