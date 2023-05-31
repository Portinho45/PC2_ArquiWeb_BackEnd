package com.example.portocarrerosantillan.servicesimplement;

import com.example.portocarrerosantillan.entities.Vehicle;
import com.example.portocarrerosantillan.repositories.IVehicleRepository;
import com.example.portocarrerosantillan.services.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImplement implements IVehicleService {

    @Autowired
    private IVehicleRepository psvR;


    @Override
    public void insert(Vehicle psVehicle) {
        psvR.save(psVehicle);
    }

    @Override
    public List<Vehicle> list() {
        return psvR.findAll();
    }

    @Override
    public List<Vehicle> find(String psModel) {
        return psvR.SearchModel(psModel);
    }

    @Override
    public int countDeportivoVehicles() {
        return psvR.countDeportivoVehicles();
    }
}
