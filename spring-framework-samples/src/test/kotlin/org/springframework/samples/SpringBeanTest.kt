package org.springframework.samples

import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.samples.component.BeanInitLifeCycle


class SpringBeanTest {

	@Test
	fun xmlApplicationContextTest() {
		val applicationContext = ClassPathXmlApplicationContext("spring-bean.xml")
//		println("获取applicationContext对象:$applicationContext")

//		val userService = applicationContext.getBean(UserService::class.java);
	}

	@Test
	fun applicationContextTest() {
		val applicationContext = AnnotationConfigApplicationContext("org.springframework.samples")
		val beanInitLifeCycle = applicationContext.getBean(BeanInitLifeCycle::class.java)
		println("beanInitLiftCycle值:$beanInitLifeCycle")

		//销毁上下文
		applicationContext.destroy();
	}


}