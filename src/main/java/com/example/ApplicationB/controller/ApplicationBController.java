package com.example.ApplicationB.controller;

import com.example.ApplicationB.model.AppBDto;
import com.example.ApplicationB.service.AppBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationBController {
    @Autowired
    AppBService appBService;

    @GetMapping("/CallAppB")
    public ResponseEntity callAppA(){
        System.out.println("Called CallAppB()");

        AppBDto appBDto = appBService.retrieveAppBDto();

        return new ResponseEntity(appBDto, HttpStatus.OK);
    }
}
