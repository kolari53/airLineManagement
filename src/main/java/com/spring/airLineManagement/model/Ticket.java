package com.spring.airLineManagement.model;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    
    @Id
    @Column(name = "ticket_id")
    private String ticketID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passengerid", referencedColumnName = "passengerid")
    private Passenger passengerid;

    @Column(name = "ticket_class")
    private String ticketClass;

    @Column(name = "seat_number")
    private String seatNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scheduleid", referencedColumnName = "scheduleid")
    private Schedule schedule;

    public Ticket(String ticketID, Schedule schedule) {
        this.ticketID = ticketID;
        this.schedule = schedule;
    }
    public Ticket(){}
    public String getTicketID() {
        return ticketID;
    }
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    public Schedule getSchedule() {
        return schedule;
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    
}
