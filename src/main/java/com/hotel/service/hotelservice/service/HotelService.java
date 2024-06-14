package com.hotel.service.hotelservice.service;

import com.hotel.service.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelService {
   Hotel createHotel(Hotel hotel) ;

   Hotel findHotelById(String id);

   List<Hotel> findAllHotels();

   String deleteHotels(String id);
}
