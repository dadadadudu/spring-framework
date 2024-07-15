package com.zhouyu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.beans.BeanProperty;

/**
 * 大都督周瑜（我的私人微信: dadudu6789）
 */
@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class MyConfig {

	@Bean
	public User version() {
		return new User();
	}
}
