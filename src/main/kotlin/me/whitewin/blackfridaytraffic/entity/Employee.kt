package me.whitewin.blackfridaytraffic.entity

import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table
data class Employee(
    @PrimaryKey val key: EmployeePrimaryKey,
    @Column val phoneNumber: String = "",
)