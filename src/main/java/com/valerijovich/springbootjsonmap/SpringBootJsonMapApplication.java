package com.valerijovich.springbootjsonmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration
 * and @ComponentScan with their default attributes.
 * @Configuration: allow to register extra beans in the context or import additional configuration classes.
 * @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism.
 * @ComponentScan: enable @Component scan on the package where the application is located.
 */
@SpringBootApplication
public class SpringBootJsonMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJsonMapApplication.class, args);
    }

}
