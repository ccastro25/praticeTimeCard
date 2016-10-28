package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by castro on 10/27/16.
 */


@Entity
public class TimeCard {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;
    private double pricePerNight;
    private int nboKnights;


    public TimeCard(){}


    public TimeCard(String hotelName, double pricePerNight, int nboKnights) {
        this.name = hotelName;
        this.pricePerNight = pricePerNight;
        this.nboKnights = nboKnights;
    }

    public String getName() {
        return name;
    }



    public double getPricePerNight() {
        return pricePerNight;
    }



    public int getNboKnights() {
        return nboKnights;
    }

    public double getTotalPrice(){
        return pricePerNight * nboKnights;
    }

    public long getId() {
        return id;
    }
}
