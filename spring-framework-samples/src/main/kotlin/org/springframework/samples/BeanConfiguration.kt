package org.springframework.samples

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.samples.component.BeanInitLifeCycle
import java.util.*

@Configuration
open class BeanConfiguration {

	@Bean(initMethod = "initMethod",name = ["beanInitLifeCycle1", "beanInitLifeCycle2"])
	open fun beanInitLifeCycle(): BeanInitLifeCycle? {
		return BeanInitLifeCycle()
	}
}