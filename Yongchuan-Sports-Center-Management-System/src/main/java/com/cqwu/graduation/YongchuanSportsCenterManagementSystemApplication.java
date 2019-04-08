package com.cqwu.graduation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.cqwu.graduation.mapper")
@EnableCaching
public class YongchuanSportsCenterManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(YongchuanSportsCenterManagementSystemApplication.class, args);
	}

}

