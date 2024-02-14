package com.feign.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MoreApplication {

  public static void main(String[] args) {
    SpringApplication.run(MoreApplication.class, args);
  }
}
