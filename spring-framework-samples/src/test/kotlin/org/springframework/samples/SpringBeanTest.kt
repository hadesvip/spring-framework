package org.springframework.samples

import org.junit.jupiter.api.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class SpringBeanTest {

	@Test
	fun xmlApplicationContextTest(){
		val applicationContext = ClassPathXmlApplicationContext("spring-bean.xml")
		println("获取applicationContext对象")
		print(applicationContext)

	}

	@Test
	fun applicationContextTest(){
		val applicationContext = AnnotationConfigApplicationContext();
	}


}