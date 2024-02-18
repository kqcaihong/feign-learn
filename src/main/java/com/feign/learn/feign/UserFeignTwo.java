package com.feign.learn.feign;

import com.feign.learn.entiry.User;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "feign-learn", url = "http://localhost:8010", contextId = "feign-learn-two")
public interface UserFeignTwo {

  @GetMapping("/user/queryById")
  User queryById(@RequestParam Long id);

  @GetMapping("/queryAll")
  List<User> queryAll();
}
