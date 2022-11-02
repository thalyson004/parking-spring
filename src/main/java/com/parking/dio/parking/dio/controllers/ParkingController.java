package com.parking.dio.parking.dio.controllers;

import com.parking.dio.parking.dio.models.Parking;
import com.parking.dio.parking.dio.services.ParkingService;
import org.hibernate.mapping.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @GetMapping
    public List<Parking> getAll(){
        return ParkingService.findAll();
    }
}
