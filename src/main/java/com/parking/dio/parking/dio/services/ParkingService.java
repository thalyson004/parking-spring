package com.parking.dio.parking.dio.services;

import com.parking.dio.parking.dio.models.Parking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ParkingService {

    private static final Map<String, Parking> parkings;

    static {
        parkings = new HashMap<>();

        Parking cur1 = new Parking(
                "First",
                5,
                10
        );
        System.out.printf("ADD %d%n", cur1.getId());
        parkings.put(String.valueOf(cur1.getId()), cur1);

        Parking cur2 = new Parking(
                "Second",
                5,
                10
        );
        System.out.printf("ADD %d%n", cur2.getId());
        parkings.put(String.valueOf(cur2.getId()), cur2);

    }

    public static List<Parking> findAll(){
        return new ArrayList<>(parkings.values());
    }

}
