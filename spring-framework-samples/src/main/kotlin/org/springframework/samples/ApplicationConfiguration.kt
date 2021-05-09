package org.springframework.samples

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.samples.component.*
import org.springframework.context.annotation.Scope
import org.springframework.samples.component.BeanDestroyLifeCycle
import org.springframework.samples.component.BeanInitLifeCycle
import org.springframework.samples.component.CustomBeanFactoryPostProcessor
import org.springframework.samples.component.UserServiceFactory
import java.util.*

/**
 * @Configuration注解修饰的类,类会被spring作为一个FactoryBean,类中的方法会作为factoryMethod
 *
 */
@Configuration
@ComponentScan(basePackages = ["org.springframework.samples"])
open class ApplicationConfiguration {

	@Bean(
		initMethod = "initMethod",
		name = ["beanInitLifeCycle"]
	)
	open fun beanInitLifeCycle(): BeanInitLifeCycle? {
		println("初始化BeanInitLifeCycle...")
		return BeanInitLifeCycle()
	}

	@Bean(destroyMethod = "destroyMethod")
	open fun beanDestroyLiftCycle(): BeanDestroyLiftCycle? {
		return BeanDestroyLiftCycle()
	}

//	@Bean(name = ["lifecycleProcessor"])
//	open fun customLifecycleProcessor(): CustomLifecycleProcessor? {
//		return CustomLifecycleProcessor()
//	}

	@Bean(name = ["customLifeCycle"])
	open fun customLifeCycle(): CustomLifeCycle? {
		return CustomLifeCycle()
	}


	@Bean
	open fun customBeanFactoryPostProcessor(): CustomBeanFactoryPostProcessor? {
		return CustomBeanFactoryPostProcessor()

	}


	open fun userServiceFactory(): UserServiceFactory? {
		return null
	}

	@Bean(destroyMethod = "destroyMethod")
	open fun beanDestroyLifeCycle(): BeanDestroyLifeCycle? {
		return BeanDestroyLifeCycle()
	}

}