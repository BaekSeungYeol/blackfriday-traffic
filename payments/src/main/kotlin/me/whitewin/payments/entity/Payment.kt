package me.whitewin.payments.entity

import jakarta.persistence.*
import me.whitewin.payments.enums.PaymentMethodType
import me.whitewin.payments.enums.PaymentStatus

@Entity
@Table(indexes = [Index(name = "idx_userId", columnList = "userId")])
class Payment(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val userId: Long,

    @Column(unique = true)
    val orderId: Long,

    val amountKRW: Long,

    val paymentMethodType: PaymentMethodType,

    val paymentData: String,

    val paymentStatus: PaymentStatus,

    @Column(unique = true)
    val referenceCode: Long,

)