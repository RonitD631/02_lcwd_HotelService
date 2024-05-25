package com.hotel.service.hotelservice.serviceImpl;

import com.hotel.service.hotelservice.entity.Hotel;
import com.hotel.service.hotelservice.exception.ResourceNotFoundException;
import com.hotel.service.hotelservice.repository.HotelRepository;
import com.hotel.service.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
     private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
      String randomId=  UUID.randomUUID().toString();
      hotel.setId(randomId);
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel findHotelById(String id) {
        return hotelRepository.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("Hotel not found with id" +id));
    }

    @Override
    public List<Hotel> findAllHotels() {
        return hotelRepository.findAll();
    }
}
