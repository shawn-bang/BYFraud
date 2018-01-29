package com.byit.fraud.utils;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by shawn on 2018/01/29.
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class HttpClentHelperTest  extends AbstractJUnit4SpringContextTests {

	@Autowired
	private HttpClientHelper httpClientHelper;

	@Test
	public void testHttpClient() {
		CookieStoreRestTemplate restTemplate = httpClientHelper.getRestTemplate(3, false, 1000, 5000, null);
		String response = restTemplate.getForObject("http://www.baidu.com", String.class);
		System.out.println(response);
	}

}
