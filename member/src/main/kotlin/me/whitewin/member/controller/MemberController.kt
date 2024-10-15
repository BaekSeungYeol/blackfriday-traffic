package me.whitewin.member.controller

import me.whitewin.member.dto.UserRequest
import me.whitewin.member.dto.UserUpdateRequest
import me.whitewin.member.entity.UserEntity
import me.whitewin.member.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
class MemberController(
    private val userService: UserService
) {

    @PostMapping("/member/users/registration")
    fun registerUser(@RequestBody userRequest: UserRequest): UserEntity {
        return userService.registerUser(userRequest.loginId, userRequest.name)
    }

    @PutMapping("/member/users/{userId}/modify")
    fun modifyUser(@PathVariable userId: Long, @RequestBody userUpdateRequest: UserUpdateRequest): UserEntity {
        return userService.modifyUser(userId, userUpdateRequest.name)
    }

    @PostMapping("/member/users/{loginId}/login")
    fun modifyUser(@PathVariable loginId: String): UserEntity {
        return userService.getUser(loginId)
    }


}