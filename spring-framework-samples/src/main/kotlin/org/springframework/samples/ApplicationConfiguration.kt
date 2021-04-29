package org.springframework.samples

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.samples.component.BeanInitLifeCycle
import org.springframework.samples.component.CustomBeanFactoryPostProcessor
import org.springframework.samples.component.UserServiceFactory
import java.util.*

@Configuration
@ComponentScan(basePackages = ["org.springframework.samples"])
open class ApplicationConfiguration {

	@Bean(initMethod = "initMethod",name = ["beanInitLifeCycle1", "beanInitLifeCycle2"],destroyMethod = "destroyMethod")
	open fun beanInitLifeCycle(): BeanInitLifeCycle? {
		return BeanInitLifeCycle()
	}


	@Bean
	open fun customBeanFactoryPostProcessor(): CustomBeanFactoryPostProcessor?{
		return CustomBeanFactoryPostProcessor()

	}



	open fun userServiceFactory(): UserServiceFactory?{
		return null
	}
}