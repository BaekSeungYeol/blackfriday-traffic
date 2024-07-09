package me.whitewin.blackfridaytraffic

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KafkaTestController(
    private val kafkaService: KafkaService
) {

    @GetMapping("/kafka-test")
    fun kafkaTest() {
        kafkaService.publish()
    }

}