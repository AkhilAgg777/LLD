package com.akhil.parkingLot.repositories;

import com.akhil.parkingLot.models.Gate;
import com.akhil.parkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap = new HashMap<Long, ParkingLot>();
    private Map<Gate, ParkingLot> gateParkingLotMap = new HashMap<Gate, ParkingLot>();

    public ParkingLot save(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        for(Gate gate:parkingLot.getGates()){
            gateParkingLotMap.put(gate,parkingLot);
        }
        return parkingLot;
    }

    public ParkingLot getParkingLotWhereGatesContain(Gate gate) {
//        for (ParkingLot parkingLot : parkingLotMap.values()) {
//            if (parkingLot.getGates().contains(gate)) {
//                return parkingLot;
//            }
//        }
//        return null;
        if (gateParkingLotMap.containsKey(gate)) {
            return gateParkingLotMap.get(gate);
        }
        return null;
    }
}
