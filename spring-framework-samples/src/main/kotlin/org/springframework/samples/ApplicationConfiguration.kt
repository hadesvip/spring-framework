package org.springframework.samples

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.samples.component.*
import java.util.*

@Configuration
@ComponentScan(basePackages = ["org.springframework.samples"])
open class ApplicationConfiguration {

	@Bean(
		initMethod = "initMethod",
		name = ["beanInitLifeCycle"]
	)
	open fun beanInitLifeCycle(): BeanInitLifeCycle? {
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
}