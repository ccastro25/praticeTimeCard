package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by castro on 10/27/16.
 */

@Component
public class DateBaseSeeder implements CommandLineRunner {

private TimeCardRep bookingRep;

    @Autowired
    public DateBaseSeeder(TimeCardRep bookingRep){
        this.bookingRep = bookingRep;
    }


    @Override
    public void run(String... strings) throws Exception {

        List<TimeCard> bookings= new ArrayList<>();

        bookings.add(new TimeCard("Marriots",200.50,3));
        bookings.add(new TimeCard("Trump",120.90,5));
        bookings.add(new TimeCard("phil",10.90,7));

        bookingRep.save(bookings);
    }
}
