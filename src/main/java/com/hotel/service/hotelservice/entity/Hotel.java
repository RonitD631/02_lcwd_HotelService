package com.hotel.service.hotelservice.entity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "hotels")
public class Hotel {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "ABOUT")
    private String about;


}
