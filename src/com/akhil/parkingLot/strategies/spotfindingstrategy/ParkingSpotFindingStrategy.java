package com.akhil.parkingLot.strategies.spotfindingstrategy;

import com.akhil.parkingLot.models.ParkingLot;
import com.akhil.parkingLot.models.ParkingSpot;
import com.akhil.parkingLot.models.Vehicle;
import com.akhil.parkingLot.models.VehicleType;

public interface ParkingSpotFindingStrategy {
    static ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot);

}
