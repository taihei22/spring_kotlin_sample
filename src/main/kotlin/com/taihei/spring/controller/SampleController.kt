package com.taihei.spring.controller

import com.taihei.spring.domain.data.service.SampleService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class SampleController(val sampleService: SampleService){

    @GetMapping("/sample")
    fun getSample(): String{
        return "sample"
    }

    @PostMapping("/sample")
    fun postSample(
            @RequestParam("sampleText") string: String, model: Model
    ): String{
        model.addAttribute("sampleValue", string)
        return "sampleResponse"
    }

    @PostMapping("/sample/db")
    fun postDBRequest(
            @RequestParam("sampleText2") string: String, model: Model
    ): String{
        val id = string.toInt()
        val employee = sampleService.findOne(id)
        model.addAttribute("id", employee.employeeId)
        model.addAttribute("name", employee.employeeName)
        model.addAttribute("age", employee.age)
        return "sampleDBResponse"
    }
}