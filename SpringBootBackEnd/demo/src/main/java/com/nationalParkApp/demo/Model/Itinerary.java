package com.nationalParkApp.demo.Model;

import com.nationalParkApp.demo.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Itinerary {
    private long id;
    private Date startDate;
    private Date endDate;
    private String parkCode;
    private UserEntity user;
}
