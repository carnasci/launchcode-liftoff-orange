package com.nationalParkApp.demo.entity;

import com.nationalParkApp.demo.Model.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "favorites")
public class FavoritesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String parkCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}