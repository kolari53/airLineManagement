package com.spring.airLineManagement.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "Schedule")
public class Schedule {
    @Id
	@Column(name = "scheduleid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scheduleid;

    @OneToOne(fetch = FetchType.EAGER)
	private AirPort srcairport;

    @OneToOne(fetch = FetchType.EAGER)
	private AirPort destinairport;

	@Column(name = "departure_date")
	private String deptDateTime;

	@Column(name = "arrival_date")
	private String arrDateTime;

    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "companyid", referencedColumnName = "companyid")
    private AirLineCompany airLineCompany;

    @OneToOne(mappedBy = "schedule")
    private Ticket ticket;


    public Schedule(int scheduleid, AirPort srcairport, AirPort destinairport, String deptDateTime,
                    String arrDateTime,Ticket ticket) {
        super();
        this.scheduleid = scheduleid;
        this.srcairport = srcairport;
        this.destinairport = destinairport;
        this.deptDateTime = deptDateTime;
        this.arrDateTime = arrDateTime;
        this.ticket = ticket;
    }

    public Schedule(){}

    public int getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(int scheduleid) {
        this.scheduleid = scheduleid;
    }

    public AirPort getSrcairport() {
        return srcairport;
    }

    public void setSrcarport(AirPort srcairport) {
        this.srcairport = srcairport;
    }

    public AirPort getDestinairport() {
        return destinairport;
    }

    public void setDestinairport(AirPort destinairport) {
        this.destinairport = destinairport;
    }

    public String getDeptDateTime() {
        return deptDateTime;
    }

    public void setDeptDateTime(String deptDateTime) {
        this.deptDateTime = deptDateTime;
    }

    public String getArrDateTime() {
        return arrDateTime;
    }

    public void setArrDateTime(String arrDateTime) {
        this.arrDateTime = arrDateTime;
    }

    public AirLineCompany getAirLineCompany() {
        return airLineCompany;
    }

    public void setAirLineCompany(AirLineCompany airLineCompany) {
        this.airLineCompany = airLineCompany;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleid + ", sourceAirport=" + srcairport + ", destinationAirport="
				+ destinairport + ", departureDateTime=" + deptDateTime + ", arrivalDateTime="
				+ arrDateTime + "]";
	}
}
