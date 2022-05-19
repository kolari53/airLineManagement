package com.spring.airLineManagement.model;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "Passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "passengerid")
    private int passengerid;

    @Column(name = "passengername")
	private String passengername;
    
    public int getPassengerid() {
        return passengerid;
    }
    public void setPassengerid(int passengerid) {
        this.passengerid = passengerid;
    }
    public String getPassengername() {
        return passengername;
    }
    public void setPassengername(String passengername) {
        this.passengername = passengername;
    }
}
