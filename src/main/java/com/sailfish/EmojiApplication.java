package com.sailfish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sailfish.mapper")//扫描dao包on
public class EmojiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmojiApplication.class, args);
	}
}
