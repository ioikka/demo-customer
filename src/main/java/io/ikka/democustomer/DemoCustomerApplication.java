package io.ikka.democustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCustomerApplication.class, args);
    }

}
