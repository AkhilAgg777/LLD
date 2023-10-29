package com.akhil.parkingLot.services;

import com.akhil.parkingLot.models.SpotType;
import com.akhil.parkingLot.models.VehicleType;
import com.akhil.parkingLot.strategies.spotfindingstrategy.ParkingSpotFindingStrategy;

public class ParkingSpotVehicleTypeMatchingService {
    public boolean matches(SpotType spotType, VehicleType vehicleType) {
        return switch (spotType) {
            case LARGE -> vehicleType.equals(vehicleType.LARGE);
            case SMALL -> vehicleType.equals(vehicleType.SMALL);
            case ELECTRIC -> vehicleType.equals(vehicleType.ELECTRIC);
            case MEDIUM -> vehicleType.equals(vehicleType.MEDIUM);

        };
    }
}
