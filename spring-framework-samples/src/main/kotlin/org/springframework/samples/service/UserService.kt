package org.springframework.samples.service

import org.springframework.samples.domain.dto.UserDTO

interface UserService {

	fun getUser(userId: Int): UserDTO


}