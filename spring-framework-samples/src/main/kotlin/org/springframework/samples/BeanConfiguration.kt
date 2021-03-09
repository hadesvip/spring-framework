package org.springframework.samples

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.samples.component.BeanInitLifeCycle

@Configuration
open class BeanConfiguration {

	@Bean(initMethod = "initMethod")
	open fun beanInitLifeCycle(): BeanInitLifeCycle? {
		return BeanInitLifeCycle()
	}
}