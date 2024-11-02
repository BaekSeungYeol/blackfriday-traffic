package me.whitewin.payments.repository

import me.whitewin.payments.entity.PaymentMethod
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentMethodRepository: JpaRepository<PaymentMethod, Long> {

    fun findByUserId(userId: Long): List<PaymentMethod>
}