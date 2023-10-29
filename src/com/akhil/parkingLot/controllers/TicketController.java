package com.akhil.parkingLot.controllers;

import com.akhil.parkingLot.services.TicketService;
import dto.GenerateTicketRequestDto;
import dto.GenerateTicketResponseDto;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) {
        Ticket ticket = ticketService.generateTicket(requestDto.getVehicle(), requestDto.getEntryGate());
        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);
        return responseDto;
    }
}
