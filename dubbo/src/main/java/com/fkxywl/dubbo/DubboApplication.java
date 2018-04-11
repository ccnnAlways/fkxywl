package com.fkxywl.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboApplication {

	private static Logger logger =LoggerFactory.getLogger(DubboApplication.class);

	public static void main(String[] args) {
		System.setProperty("dubbo.application.logger","slf4j");
		SpringApplication.run(DubboApplication.class, args);
		logger.info("dubbo服务启动成功");
		synchronized (DubboApplication.class) {
			while (true) {
				try {
					DubboApplication.class.wait();
				} catch (InterruptedException e) {
					logger.error("== synchronized error:", e);
				}
			}
		}
	}
}
