package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) //排除DataSourceConfiguratrion
//@EnableJms    //启动消息队列
@MapperScan("com.*.dao")
@EnableTransactionManagement
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("es.set.netty.runtime.available.processors", "false");
		SpringApplication.run(DemoApplication.class, args);
	}

}
