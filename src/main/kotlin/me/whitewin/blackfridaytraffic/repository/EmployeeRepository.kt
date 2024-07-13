package me.whitewin.blackfridaytraffic.repository

import me.whitewin.blackfridaytraffic.entity.Employee
import me.whitewin.blackfridaytraffic.entity.EmployeePrimaryKey
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository: CassandraRepository<Employee, EmployeePrimaryKey> {

    fun findByKeyLocationAndKeyDepartment(location: String, department: String): List<Employee>

}