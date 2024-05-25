package com.hotel.service.hotelservice.controller;

import com.hotel.service.hotelservice.entity.Hotel;
import com.hotel.service.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return new ResponseEntity<>(hotelService.createHotel(hotel), HttpStatus.CREATED);
    }

   @GetMapping("/{id}")
    public ResponseEntity<Hotel> findHotelById(@PathVariable String id){
        return new ResponseEntity<>(hotelService.findHotelById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> findAllHotels(){
        return new ResponseEntity<>(hotelService.findAllHotels(), HttpStatus.OK);
    }
}
