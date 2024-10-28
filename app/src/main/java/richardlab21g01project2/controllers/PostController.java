package richardlab21g01project2.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpEntity;


@Controller
public class PostController {
    @PostMapping("/signup")
    public String signup(@RequestBody HttpEntity<String> httpEntity) {
        Integer user_id = 0;
        return httpEntity.getBody();
        
        // user_id INTEGER PRIMARY KEY,
        // first_name VARCHAR(50) NOT NULL,
        // last_name VARCHAR(50) NOT NULL,
        // address VARCHAR(100),
        // phone_number VARCHAR(12),
        // username VARCHAR(12) NOT NULL,
        // passwrd VARCHAR(12) NOT NULL,
        // is_admin boolean NOT NULL,
    }

    
    @PostMapping("/login")
    public String login(@RequestBody HttpEntity<String> httpEntity) {
        return httpEntity.getBody();
    }
}
