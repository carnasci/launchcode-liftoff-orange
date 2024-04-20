package com.nationalParkApp.demo.entity;

import com.nationalParkApp.demo.Model.Itinerary;
import com.nationalParkApp.demo.Model.Review;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    private String password;

    private List<Itinerary> itineraries;

    private List<Review> reviews;

}
