package com.exampleProfile.ProfileSet;

import com.exampleProfile.ProfileSet.Service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        return new DataSource("devUser","devPass");
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        return new DataSource("prodUser","prodPass");
    }

    @Bean
    public MyService myService(DataSource dataSource) {
        return new MyService(dataSource);
    }
}