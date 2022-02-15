package com.example.firstspringproject.controllers;

import com.example.firstspringproject.services.DayOfWeekCalc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {

    @GetMapping("/endpoint")
    public String endPoint(){
        return "Hello User";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String input){
        return input;
    }

    @GetMapping("/friday")
    public String showFridayStatus(){
        DayOfWeekCalc dwc = new DayOfWeekCalc();
        int day = dwc.whatDayIsIt();
        if(day == 5){
            return "yeaaa";
        } else {
            return "naaah";
        }
    }

}
