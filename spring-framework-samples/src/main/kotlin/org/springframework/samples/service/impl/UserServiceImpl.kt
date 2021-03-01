package org.springframework.samples.service.impl

import org.springframework.samples.domain.dto.UserDTO
import org.springframework.samples.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl :UserService {

	override fun getUser(userId: Int): UserDTO {
		return UserDTO(userId, "张三")
	}



}