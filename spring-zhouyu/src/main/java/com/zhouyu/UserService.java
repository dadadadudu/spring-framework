package com.zhouyu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 大都督周瑜（我的私人微信: dadudu6789）
 */
@Component
public class UserService {

	@Value("#{version}")
	private User version;

	public void test() {
		System.out.println(version);
	}
}
