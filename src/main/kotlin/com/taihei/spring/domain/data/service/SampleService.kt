package com.taihei.spring.domain.data.service

import com.taihei.spring.domain.data.Employee
import com.taihei.spring.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleService (
    val sampleRepository: SampleRepository
){
    fun findOne(id: Int): Employee {
        val map = sampleRepository.findOne(id)
        return Employee(
            employeeId = map.get("employee_id") as Int,
            employeeName = map.get("employee_name") as String,
            age = map.get("age") as Int
        )
    }
}