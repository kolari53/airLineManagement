package com.spring.airLineManagement.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Airport")
public class AirPort{
    
    @Id
    @Column(name= "airportid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int airportid;

    @Column(name= "airportlocation")
	private String airportLocation;

    @Column(name= "airportname")
	private String airportName;


//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "srcairport",referencedColumnName ="srcairport")
//    private Set<Schedule> srcAirportIdList;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "destinairport",referencedColumnName ="destinairport")
//    private Set<Schedule> destAirportIdList;
//
//    public Set<Schedule> getSrcAirportIdList() {
//        return srcAirportIdList;
//    }
//
//    public void setSrcAirportIdList(Set<Schedule> srcAirportIdList) {
//        this.srcAirportIdList = srcAirportIdList;
//    }
//
//    public Set<Schedule> getDestAirportIdList() {
//        return destAirportIdList;
//    }
//
//    public void setDestAirportIdList(Set<Schedule> destAirportIdList) {
//        this.destAirportIdList = destAirportIdList;
//    }

    public AirPort(int airportid, String airportLocation, String airportName) {
        this.airportid = airportid;
        this.airportLocation = airportLocation;
        this.airportName = airportName;
    }
    public AirPort(){

    }
    public int getAirportID() {
        return airportid;
    }
    public void setAirportID(int airportid) {
        this.airportid = airportid;
    }
    public String getAirportLocation() {
        return airportLocation;
    }
    public void setAirportLocation(String airportLocation) {
        this.airportLocation = airportLocation;
    }
    public String getAirportName() {
        return airportName;
    }
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
	public String toString() {
		return "Airport{" + "airportName='" + airportName + '\'' + ", airportLocation='" + airportLocation + '\''
				+ ", airportID='" + airportid+ '\'' + '}';
	}

}