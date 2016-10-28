package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by castro on 10/27/16.
 */
@RestController(value = "/timeCard")
public class TimeCardController {

    private TimeCardRep timeCardRep;

    @Autowired
   public TimeCardController(TimeCardRep timeCardRep){
      this.timeCardRep = timeCardRep;


   }
@RequestMapping(value = "/all", method = RequestMethod.GET)
public List<TimeCard> getAll(){
    return timeCardRep.findAll();
}



@RequestMapping(value = "/create",method = RequestMethod.POST )
public List<TimeCard> create (@RequestBody TimeCard hotelBooking){
    timeCardRep.save(hotelBooking);

    return timeCardRep.findAll();
}

@RequestMapping(value = "/remove",method = RequestMethod.GET)
public List<TimeCard> remove(@PathVariable long id){
 timeCardRep.delete(id);
return timeCardRep.findAll();}



}
