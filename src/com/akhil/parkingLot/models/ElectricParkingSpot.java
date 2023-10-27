package com.akhil.parkingLot.models;

public class ElectricParkingSpot extends ParkingSpot{
    private ElectricCharger electricCharger;

    public ElectricParkingSpot(ElectricCharger electricCharger){
        this.electricCharger=electricCharger;
    }
}
