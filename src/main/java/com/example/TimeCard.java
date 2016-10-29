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
    private String password;
    private String stratTime;
    private String endTime;


    public TimeCard(){}

    public TimeCard(String name, String pasword,String stratTime, String endTime) {
        this.name = name;
        this.password = pasword;
        this.stratTime = stratTime;
        this.endTime = endTime;
    }

    public long getId() {
        return id;
    }
    public String getName() {return name;}



    public String getPasword() {return password;}

    public String getStratTime() {
        return stratTime;
    }

    public String getEndTime() {
        return endTime;
    }


}
