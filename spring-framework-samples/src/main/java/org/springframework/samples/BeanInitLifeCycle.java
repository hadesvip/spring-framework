package org.springframework.samples;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanInitLifeCycle implements InitializingBean {


	public BeanInitLifeCycle() {
		System.out.println("构造函数");
	}

	@PostConstruct
	public void postConstruct(){
		System.out.println("postConstruct");
	}


	public void initMethod(){
		System.out.println("init-method");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
