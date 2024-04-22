package com.nationalParkApp.demo.Model;

import com.nationalParkApp.demo.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private long id;
    private String parkCode;
    private String content;
    private UserEntity user;
}
