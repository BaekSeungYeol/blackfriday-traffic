package me.whitewin.member.service

import me.whitewin.member.entity.UserEntity
import me.whitewin.member.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun registerUser(loginId: String, userName: String): UserEntity {
        val user = UserEntity(loginId = loginId, userName = userName)
        return userRepository.save(user)
    }

    fun modifyUser(userId: Long, userName: String): UserEntity {
        val user = userRepository.findById(userId).orElseThrow()
        user.userName = userName
        return userRepository.save(user)
    }

    fun getUser(loginId: String): UserEntity {
        return userRepository.findByLoginId(loginId)
    }
}
