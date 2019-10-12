package com.example.ApplicationB.service;

import com.example.ApplicationB.model.AppBDto;
import org.springframework.stereotype.Service;

@Service
public class AppBService {

    public AppBDto retrieveAppBDto(){

        AppBDto appBDto = AppBDto.builder()
                .title("Title")
                .message("Message 123")
                .build();

        return appBDto;
    }
}
