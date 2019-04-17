package com.taihei.spring.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class SampleController(){

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
}