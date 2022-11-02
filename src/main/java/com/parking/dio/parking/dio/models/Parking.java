package com.parking.dio.parking.dio.models;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

public class Parking {
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SequenceParkingId")
    @SequenceGenerator(name = "SequenceParkingId", sequenceName = "PARKING_ID")
     */
    private static int countParking;
    private int id;
    private String name;
    private int remain;
    private int total;

    static {
        countParking=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Parking(String name, int remain, int total) {
        this.id = Parking.countParking++;
        this.name = name;
        this.remain = remain;
        this.total = total;
    }


}
