package com.spring.airLineManagement.model;

import javax.persistence.*;

@Entity
@Table(name="AirLineCompany")
public class AirLineCompany {
    @Id
    @Column(name= "companyid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  companyid;

    @Column(name= "companyname")
    private String companyName;

    @OneToOne(mappedBy = "AirLineCompany")
    private Plane plane;

    @OneToOne(mappedBy = "airLineCompany")
    private Schedule schedule;

    public AirLineCompany() {
    }

    public AirLineCompany(int companyid, String companyName,Schedule schedule) {
        this.companyid = companyid;
        this.companyName = companyName;
        this.schedule =schedule;
    }

    public int getCompanyid() {
        return companyid;
    }
    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

}
