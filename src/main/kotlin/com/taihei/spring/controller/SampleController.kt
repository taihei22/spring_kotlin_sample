package com.taihei.spring.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SampleController(){

    @GetMapping("/sample")
    fun sample(): String{
        return "sample"
    }
}