package com.example.finalexam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class finalexamController {
Integer output;

    @RequestMapping("/api/digitsum")
    public Integer digitsum(@RequestParam Integer number) {
        output = (number / 1000) + ((number/100) % 10) + ((number/10) % 10) + (number%10);
        return output;
    }
}
