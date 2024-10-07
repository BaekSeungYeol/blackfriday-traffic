package me.whitewin.member.repository

import me.whitewin.member.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, Long> {
    fun findByLoginId(loginId: String): UserEntity
}