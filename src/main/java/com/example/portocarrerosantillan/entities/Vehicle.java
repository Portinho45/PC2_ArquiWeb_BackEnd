package com.example.portocarrerosantillan.entities;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int psidVehicle;
    @Column(name = "psLicensePlate", length = 60, nullable = false)
    private String psLicensePlate;
    @Column(name = "psType", length = 60, nullable = false)
    private String psType;
    @Column(name = "psManufacturingDate", nullable = false)
    private LocalDate psManufacturingDate;
    @Column(name = "psPurchaseDate", nullable = false)
    private LocalDate psPurchaseDate;
    @Column(name = "psModel", length = 60, nullable = false)
    private String psModel;

    public Vehicle(){

    }

    public Vehicle(int psidVehicle, String psLicensePlate, String psType, LocalDate psManufacturingDate, LocalDate psPurchaseDate, String psModel) {
        this.psidVehicle = psidVehicle;
        this.psLicensePlate = psLicensePlate;
        this.psType = psType;
        this.psManufacturingDate = psManufacturingDate;
        this.psPurchaseDate = psPurchaseDate;
        this.psModel = psModel;
    }

    public int getPsidVehicle() {
        return psidVehicle;
    }

    public void setPsidVehicle(int psidVehicle) {
        this.psidVehicle = psidVehicle;
    }

    public String getPsLicensePlate() {
        return psLicensePlate;
    }

    public void setPsLicensePlate(String psLicensePlate) {
        this.psLicensePlate = psLicensePlate;
    }

    public String getPsType() {
        return psType;
    }

    public void setPsType(String psType) {
        this.psType = psType;
    }

    public LocalDate getPsManufacturingDate() {
        return psManufacturingDate;
    }

    public void setPsManufacturingDate(LocalDate psManufacturingDate) {
        this.psManufacturingDate = psManufacturingDate;
    }

    public LocalDate getPsPurchaseDate() {
        return psPurchaseDate;
    }

    public void setPsPurchaseDate(LocalDate psPurchaseDate) {
        this.psPurchaseDate = psPurchaseDate;
    }

    public String getPsModel() {
        return psModel;
    }

    public void setPsModel(String psModel) {
        this.psModel = psModel;
    }
}

