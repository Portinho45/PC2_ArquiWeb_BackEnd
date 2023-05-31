package com.example.portocarrerosantillan.repositories;

import com.example.portocarrerosantillan.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVehicleRepository  extends JpaRepository<Vehicle, Integer> {

    @Query("from Vehicle psv where psv.psModel=:psModel")
    List<Vehicle> SearchModel(@Param("psModel") String psModel);

    @Query("select count(psv) from Vehicle psv where psv.psType = 'deportivo'")
    int countDeportivoVehicles();
}
