package com.example.userservice.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Data
@Component
public class Greeting {
    @Value("${greeting.message}")
    private String message;
}
