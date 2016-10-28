package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by castro on 10/27/16.
 */
public interface TimeCardRep extends JpaRepository<TimeCard,Long> {

    List<TimeCard> findByPricePerNightLessThan(double price);

}

