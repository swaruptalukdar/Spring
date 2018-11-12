package com.capg.trg.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestingBean implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("Clean Up after bean destruction");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization before bean creation");

	}

}
