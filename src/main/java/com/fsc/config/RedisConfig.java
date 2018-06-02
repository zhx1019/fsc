package com.fsc.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by I321169 on 5/17/18.
 */

@Configuration
@EnableCaching
@ConditionalOnClass(RedisOperations.class)
@EnableConfigurationProperties(RedisProperties.class)
public class RedisConfig {

  @Bean
  public JedisConnectionFactory redisConnectionFactory() {
    JedisPoolConfig poolConfig = new JedisPoolConfig();
    poolConfig.setMaxTotal(5);
    poolConfig.setTestOnBorrow(true);
    poolConfig.setTestOnReturn(true);
    JedisConnectionFactory ob = new JedisConnectionFactory(poolConfig);
    ob.setUsePool(true);
    ob.setHostName("localhost");
    ob.setPort(6379);
    return ob;
  }

  @Bean
  @ConditionalOnMissingBean(name = "redisTemplate")
  public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory rcf) {

    RedisTemplate<String, String> template = new RedisTemplate<>();
    template.setConnectionFactory(redisConnectionFactory());
    return template;
  }

  @Bean
  public CacheManager cacheManager(RedisTemplate redisTemplate) {
    RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
    return rcm;
  }

}
