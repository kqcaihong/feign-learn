package com.feign.learn;

import com.feign.learn.feign.UserFeign;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MoreApplication.class)
public class FeignClientTest {

  @Autowired
  private UserFeign userFeign;

  @Test
  public void get() {
    for (int i = 1; i < 6; i++) {
      userFeign.queryById((long) i);
    }
  }

  @Test
  public void postByBody() {
  }
}
