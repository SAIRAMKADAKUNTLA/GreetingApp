package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;
import com.bridgelabz.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {


    @Autowired
    private GreetingService greetingService;

    @GetMapping(value = {"","/"})
    public Greeting greeting(@RequestParam (value = "fname",defaultValue = "world") String fname,
                             @RequestParam(value = "lname",defaultValue = " " )String lname){
       // return new Greeting(counter.incrementAndGet(),String.format(template,fname,lname));
        User user=new User();
        user.setFirstName(fname);
        user.setLastName(lname);
        return  greetingService.addGreeting(user);
    }


}
