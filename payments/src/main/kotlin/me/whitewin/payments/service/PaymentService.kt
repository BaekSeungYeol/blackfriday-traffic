package me.whitewin.payments.service

import me.whitewin.payments.entity.Payment
import me.whitewin.payments.entity.PaymentMethod
import me.whitewin.payments.enums.PaymentMethodType
import me.whitewin.payments.repository.PaymentMethodRepository
import me.whitewin.payments.repository.PaymentRepository
import org.springframework.stereotype.Service

@Service
class PaymentService(
    private val paymentMethodRepository: PaymentMethodRepository,
    private val paymentRepository: PaymentRepository,
) {

    fun registerPaymentMethod(
        userId: Long,
        paymentMethodType: PaymentMethodType,
        creditCardNumber: String
    ): PaymentMethod {
        val paymentMethod = PaymentMethod(userId = userId, paymentMethodType= paymentMethodType, creditCardNumber = creditCardNumber)
        return paymentMethodRepository.save(paymentMethod)
    }

    fun processPayment(
        userId:Long,
        orderId: Long,
        amountKRW: Long,
        paymentMethodId: Long
    ): Payment {
        val paymentMethod = paymentMethodRepository.findById(paymentMethodId).orElseThrow()

        if(paymentMethod.paymentMethodType != PaymentMethodType.CREDIT_CARD) {
            throw IllegalArgumentException("지원하지 않는 타입입니다.")
        }


    }

}