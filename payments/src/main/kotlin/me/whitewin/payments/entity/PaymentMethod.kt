package me.whitewin.payments.entity

import jakarta.persistence.*
import me.whitewin.payments.enums.PaymentMethodType

@Entity
@Table(indexes = [Index(name = "idx_userId", columnList = "userId")])
class PaymentMethod(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long = 0,
    val userId: Long,
    val paymentMethodType: PaymentMethodType,
    val creditCardNumber: String,

) {

}