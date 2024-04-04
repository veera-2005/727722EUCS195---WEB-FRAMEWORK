package com.project.project1.Mess;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {

        @GetMapping("/Welcome")
        public String message()
            {
                return "Hello good afternoon";
            }
    
}
