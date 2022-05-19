package com.spring.airLineManagement.Service;


import com.spring.airLineManagement.DataAccess.AirLineCompanyDAL;
import com.spring.airLineManagement.model.AirLineCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AirLineCompanyManager implements AirLineCompanyService {

    private AirLineCompanyDAL airLineCompanyDAL;

    @Autowired
    public AirLineCompanyManager(AirLineCompanyDAL airLineCompanyDAL) {
        this.airLineCompanyDAL = airLineCompanyDAL;
    }

    @Override
    @Transactional
    public List<AirLineCompany> getAll() {
        return this.airLineCompanyDAL.getAll();
    }

    @Override
    @Transactional
    public void add(AirLineCompany airLineCompany) {
        this.airLineCompanyDAL.add(airLineCompany);
    }

    @Override
    @Transactional
    public void update(AirLineCompany airLineCompany) {
        this.airLineCompanyDAL.update(airLineCompany);
    }

    @Override
    @Transactional
    public void delete(AirLineCompany airLineCompany) {
        this.airLineCompanyDAL.delete(airLineCompany);
    }

    @Override
    @Transactional
    public AirLineCompany getByID(int id) {
        return this.airLineCompanyDAL.getByID(id);
    }
}
