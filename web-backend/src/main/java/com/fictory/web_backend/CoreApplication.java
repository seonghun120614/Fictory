package com.fictory.web_backend;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(CoreApplication.class, args);
    }
}
