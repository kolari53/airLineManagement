package com.spring.airLineManagement.Service;

import com.spring.airLineManagement.DataAccess.AirPortDAL;
import com.spring.airLineManagement.model.AirPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AirPortManager implements AirPortService{

    private AirPortDAL airPortDAL;

    @Autowired
    public AirPortManager(AirPortDAL airPortDAL) {
        this.airPortDAL = airPortDAL;
    }

    @Override
    @Transactional
    public List<AirPort> getAll() {
        return this.airPortDAL.getAll();
    }

    @Override
    @Transactional
    public void add(AirPort airPort) {
        this.airPortDAL.add(airPort);
    }

    @Override
    @Transactional
    public void update(AirPort airPort) {
        this.airPortDAL.update(airPort);
    }

    @Override
    @Transactional
    public void delete(AirPort airPort) {
        this.airPortDAL.delete(airPort);
    }

    @Override
    @Transactional
    public AirPort getByID(int id) {
        return this.airPortDAL.getByID(id);
    }
}
