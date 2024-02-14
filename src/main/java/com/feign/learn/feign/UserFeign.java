package com.feign.learn.feign;

import com.feign.learn.entiry.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "feign-learn", url = "127.0.0.1:8010")
public interface UserFeign {

  @GetMapping("/user/queryById")
  User queryById(@RequestParam Long id);
}
