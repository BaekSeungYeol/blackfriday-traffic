package me.whitewin.blackfridaytraffic

import me.whitewin.blackfridaytraffic.service.CassandraService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CassandraTestController (
    private val cassandraService: CassandraService
) {

    @GetMapping("/cassandra-test")
    fun cassandraTest() {
        cassandraService.casTest()
    }

}