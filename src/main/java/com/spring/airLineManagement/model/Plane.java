package com.spring.airLineManagement.model;

import javax.persistence.*;


@Entity
@Table(name = "Plane")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "planeid")
    private int planeid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "planecompanyID", referencedColumnName = "companyID")
    private AirLineCompany AirLineCompany;

    public int getPlaneid() {
        return planeid;
    }

    public void setPlaneid(int planeid) {
        this.planeid = planeid;
    }

    public AirLineCompany getAirLineCompany() {
        return AirLineCompany;
    }

    public void setAirLineCompany(AirLineCompany airLineCompany) {
        AirLineCompany = airLineCompany;
    }
}
