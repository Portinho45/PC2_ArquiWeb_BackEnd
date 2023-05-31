package com.example.portocarrerosantillan.services;

import com.example.portocarrerosantillan.entities.Vehicle;

import java.util.List;
public interface IVehicleService {

    public void insert(Vehicle psVehicle);

    List<Vehicle> list();

    List<Vehicle> find(String psModel);

    int countDeportivoVehicles();
}
