package com.fsc.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by I321169 on 5/18/18.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConfigTest {

  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  @Autowired
  private RedisTemplate<String,String> redisTemplate;

  @Test
  public void test() throws Exception {

    redisTemplate.opsForValue().set("testKey","Hello");
    Assert.assertEquals("Hello", redisTemplate.opsForValue().get("testKey"));

        stringRedisTemplate.opsForValue().set("testKey", "Hello");
        Assert.assertEquals("Hello", stringRedisTemplate.opsForValue().get("testKey"));

  }
}
