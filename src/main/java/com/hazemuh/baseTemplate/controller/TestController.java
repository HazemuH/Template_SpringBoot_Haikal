package com.hazemuh.baseTemplate.controller;

import com.hazemuh.baseTemplate.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/browse")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public ResponseEntity getDataTesting() {
        ResponseEntity responseEntity = testService.getDataTesting();
        return responseEntity;
    }


}

