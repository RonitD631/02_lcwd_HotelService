package com.hotel.service.hotelservice.repository;

import com.hotel.service.hotelservice.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String>
{

}
