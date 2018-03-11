package com.fsc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by I321169 on 2/26/18.
 */

@SpringBootApplication
@MapperScan("com.fsc.dao.mapper")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
