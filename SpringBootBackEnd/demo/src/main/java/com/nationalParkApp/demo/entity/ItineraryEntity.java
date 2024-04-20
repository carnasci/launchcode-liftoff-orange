package com.nationalParkApp.demo.entity;

import com.nationalParkApp.demo.Model.User;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "itinerary")
public class ItineraryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date startDate;

    private Date endDate;

    private String parkCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
