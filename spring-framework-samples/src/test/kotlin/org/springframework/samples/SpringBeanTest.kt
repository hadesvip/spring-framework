package org.springframework.samples

import org.junit.jupiter.api.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

class SpringBeanTest {

	@Test
	fun beanTest(){
		val applicationContext = ClassPathXmlApplicationContext("spring-bean.xml")
		println("获取applicationContext对象")
		print(applicationContext)

	}


}