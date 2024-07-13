package me.whitewin.blackfridaytraffic.service

import me.whitewin.blackfridaytraffic.entity.Employee
import me.whitewin.blackfridaytraffic.entity.EmployeePrimaryKey
import me.whitewin.blackfridaytraffic.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class CassandraService(
    private val employeeRepository: EmployeeRepository
) {

    fun casTest() {
        val employee1 = Employee(
         EmployeePrimaryKey("seoul", "business", "key"),
            "010-1111-2222"
        )

        employeeRepository.save(employee1)

        val employee2 = Employee(
            EmployeePrimaryKey("seoul", "business", "key"),
            "010-1111-2222"
        )

        employeeRepository.save(employee2)

        val result = employeeRepository.findByKeyLocationAndKeyDepartment(
            "seoul", "business"
        )

        result.forEach {
            println("location: ${it.key.location} department: ${it.key.department} phoneNumber: ${it.phoneNumber}")
        }
    }
}