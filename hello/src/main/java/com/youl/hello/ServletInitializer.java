package com.youl.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/*
SprringBootservletInitializer 클래스
Boot Project 에서 root-context.xml, servlet-context.xml 을 대신하는 클래스로서
여기에서 HelloApplication.class.main() 메서드를 내부에서 호출한다.
*
*/
@EnableAutoConfiguration
@ComponentScan("com.youl.hello")
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloApplication.class);
	}

}
