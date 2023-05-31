package com.example.portocarrerosantillan.controllers;

import com.example.portocarrerosantillan.dtos.VehicleDTO;
import com.example.portocarrerosantillan.entities.Vehicle;
import com.example.portocarrerosantillan.services.IVehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("portocarrero")
public class VehicleController {

    @Autowired
    private IVehicleService psvS;
    @PostMapping
    public void insert(@RequestBody VehicleDTO psdto){
        ModelMapper psm = new ModelMapper();
        Vehicle psv = psm.map(psdto,Vehicle.class);
        psvS.insert(psv);
    }

    @GetMapping
    public List<VehicleDTO> list(){
        return psvS.list().stream().map(psx->{
            ModelMapper psm = new ModelMapper();
            return psm.map(psx,VehicleDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/search")
    public List<VehicleDTO> search(@RequestBody String psModel){
        return psvS.find(psModel).stream().map(psx->{
            ModelMapper psm = new ModelMapper();
            return psm.map(psx,VehicleDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/count")
    public ResponseEntity<Integer> countDeportivoVehicles() {
        int pscount = psvS.countDeportivoVehicles();
        return ResponseEntity.ok(pscount);
    }
}
