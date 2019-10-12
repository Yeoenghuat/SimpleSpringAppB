package com.example.ApplicationB.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppBDto implements Serializable {

    private String title;
    private String message;
}
