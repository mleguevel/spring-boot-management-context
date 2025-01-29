package fr.mael.test;

import org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration;
import org.springframework.context.annotation.Bean;

@ManagementContextConfiguration
public class MyManagementConfiguration {

    @Bean
    public String myBean() {
        return "Hello";
    }
}
