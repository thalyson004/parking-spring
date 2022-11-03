package com.parking.dio.parking.dio.controllers;

import com.parking.dio.parking.dio.models.Parking;
import com.parking.dio.parking.dio.services.ParkingService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {
    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }
    @GetMapping
    @ApiOperation("Find all parkings")
    public ResponseEntity<List<Parking>> findAll() {
        return ResponseEntity.ok(parkingService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Parking> findById(@PathVariable String id) {

        return ResponseEntity.ok(parkingService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        parkingService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Parking> create(@RequestBody Parking p) {
        var parking = parkingService.create(p);
        return ResponseEntity.status(HttpStatus.CREATED).body(parking);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Parking> update(@PathVariable String id, @RequestBody Parking parking) {
        parking = parkingService.update(id, parking);
        return ResponseEntity.ok(parking);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Parking> checkOut(@PathVariable String id) {
        return ResponseEntity.ok(parkingService.checkOut(id));
    }
}
