package org.springframework.samples.component

import org.springframework.beans.factory.FactoryBean
import org.springframework.samples.service.UserService

class UserServiceFactory :FactoryBean<UserService> {



	override fun getObject(): UserService? {
		TODO("Not yet implemented")



	}

	override fun getObjectType(): Class<*>? {
		TODO("Not yet implemented")
	}


}