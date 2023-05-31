package com.example.portocarrerosantillan.dtos;

import java.time.LocalDate;

public class VehicleDTO {
    private int psidVehicle;
    private String psLicensePlate;

    private String psType;

    private LocalDate psManufacturingDate;

    private LocalDate psPurchaseDate;

    private String psModel;

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
