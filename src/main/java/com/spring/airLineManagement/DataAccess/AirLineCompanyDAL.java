package com.spring.airLineManagement.DataAccess;

import com.spring.airLineManagement.model.AirLineCompany;

import java.util.List;

public interface AirLineCompanyDAL {
    List<AirLineCompany> getAll();
    void add(AirLineCompany airLineCompany);
    void update(AirLineCompany airLineCompany);
    void delete(AirLineCompany airLineCompany);
    AirLineCompany getByID(int id);
}
