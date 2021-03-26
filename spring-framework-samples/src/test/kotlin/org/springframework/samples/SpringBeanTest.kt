package org.springframework.samples

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.support.RootBeanDefinition
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.samples.component.BeanInitLifeCycle
import org.springframework.samples.component.service.impl.OrderServiceImpl
import org.springframework.samples.service.UserService
import org.springframework.samples.service.impl.UserServiceImpl


class SpringBeanTest {

	@Test
	fun xmlApplicationContextTest() {
		val applicationContext = ClassPathXmlApplicationContext("spring-bean.xml")
//		println("获取applicationContext对象:$applicationContext")

//		val userService = applicationContext.getBean(UserService::class.java);
	}

	@Test
	fun applicationContextTest() {
		val ac =
			AnnotationConfigApplicationContext(ApplicationConfiguration::class.java)
//		val beanInitLifeCycle1 = applicationContext.getBean("beanInitLifeCycle1")
//		val beanInitLifeCycle2 = applicationContext.getBean("beanInitLifeCycle2")
//		println(beanInitLifeCycle1)
//		println(beanInitLifeCycle2)
		ac.beanFactory.registerSingleton("userService",UserServiceImpl())
		ac.registerBeanDefinition("userService", RootBeanDefinition(OrderServiceImpl::class.java));
//		ac.refresh();
//		val beanInitLifeCycle = applicationContext.getBean(BeanInitLifeCycle::class.java)
//		println("beanInitLiftCycle值:$beanInitLifeCycle")

		//销毁上下文
//		applicationContext.destroy();
	}


}