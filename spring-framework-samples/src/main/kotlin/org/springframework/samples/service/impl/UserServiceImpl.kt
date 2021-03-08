package org.springframework.samples.service.impl

import org.springframework.beans.factory.InitializingBean
import org.springframework.samples.domain.dto.UserDTO
import org.springframework.samples.service.UserService
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class UserServiceImpl :UserService, InitializingBean {

	override fun getUser(userId: Int): UserDTO {
		return UserDTO(userId, "张三")
	}


	@PostConstruct
	fun postConstruct() {
		println("PostConstruct")
	}


	override fun afterPropertiesSet() {
		println("afterPropertiesSet")
	}

	fun initMethod() {
		println("init-method")
	}








}