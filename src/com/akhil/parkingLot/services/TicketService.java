package com.akhil.parkingLot.services;

import com.akhil.parkingLot.models.*;
import com.akhil.parkingLot.repositories.ParkingLotRepository;
import com.akhil.parkingLot.strategies.spotfindingstrategy.ParkingSpotFindingStrategy;

public class TicketService {

    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;
    private ParkingLotRepository parkingLotRepository;

    TicketService(ParkingSpotFindingStrategy parkingSpotFindingStrategy, ParkingLotRepository parkingLotRepository) {
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, EntryGate entryGate) {
        ParkingSpot availableSpot = ParkingSpotFindingStrategy.getAvailableSpot(vehicle.getVehicleType(),
                parkingLotRepository.getParkingLotWhereGatesContain(entryGate));
        Ticket ticket = new Ticket();
        ticket.setGeneratedBy(entryGate.getOperator());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(availableSpot);
        ticket.setGate(entryGate);
        ticket.setEntryTime(new Date().toString());
        return ticket;
    }
}


//Algo to generate ticket
//1.Need to find a spot for the vehicle
//2.Create a ticket object
//3.Put all the details inside the ticket object
//4.Return ticket
