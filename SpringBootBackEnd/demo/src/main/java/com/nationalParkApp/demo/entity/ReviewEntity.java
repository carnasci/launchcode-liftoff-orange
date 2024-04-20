package com.nationalParkApp.demo.entity;

import com.nationalParkApp.demo.Model.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "review")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String parkCode;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
