package com.taihei.spring.repository

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class SampleRepository(val jdbcTemplate: JdbcTemplate){

    fun findOne(id: Int): MutableMap<String, Any> {
        val query = """SELECT employee_id, employee_name, age FROM employee WHERE employee_id=?"""
        val employee = jdbcTemplate.queryForMap(query, id)
        return employee
    }
}