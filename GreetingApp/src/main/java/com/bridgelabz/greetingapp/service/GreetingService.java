package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;

import java.util.concurrent.atomic.AtomicLong;

public interface GreetingService {
    Greeting addGreeting(User user);

}
