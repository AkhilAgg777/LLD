package com.akhil.parkingLot.models;

public class Bill extends BaseModel{
    private Ticket ticket;
    private int amount;
    private String exitTime;
    private String invoiceNumber;
    private Payment payment;

    private BillStatus billStatus;

//    @Override
//    BillDto toDTO() {
//        BillDto billDto=new BillDto();
//        billDto.setAmount(this.amount);
//        billDto.setInvoiceNumber(this.invoiceNumber);
//        return  billDto;
//    }
}
