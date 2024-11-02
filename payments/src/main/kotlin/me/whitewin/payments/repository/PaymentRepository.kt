package me.whitewin.payments.repository

import me.whitewin.payments.entity.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository: JpaRepository<Payment, Long> {
}