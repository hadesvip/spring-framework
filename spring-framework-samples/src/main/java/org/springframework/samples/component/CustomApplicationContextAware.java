package org.springframework.samples.component;

import javax.annotation.Resource;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author wangyong
 */
@Component
public class CustomApplicationContextAware implements ApplicationContextAware {

	@Resource
	private ApplicationContext applicationContext;



	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}
}