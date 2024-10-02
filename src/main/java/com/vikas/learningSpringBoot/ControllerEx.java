package com.vikas.learningSpringBoot;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEx {

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    public ResponseEntity<String> hello() {
        String hello = "Hello from hello method";
        return ResponseEntity.ok(hello);
    }
}
