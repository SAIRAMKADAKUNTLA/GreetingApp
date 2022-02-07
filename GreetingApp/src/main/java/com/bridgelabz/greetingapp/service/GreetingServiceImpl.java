package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService {

    private static final  String template="hello";
    private final AtomicLong counter=new AtomicLong();

    @Autowired
    private GreetingRepo repo;
    @Override
    public Greeting addGreeting(User user) {
        String message=String.format(template,(user.toString()).isEmpty() ? "hello world" : "");
        return  repo.save(new Greeting(counter.incrementAndGet(), message));
    }
}
