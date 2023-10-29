-Alt+Insert shortcut for getters and setters in IntelliJ <br>
-start by implementing the models<br>
-either take the values via a constructor or instantiate within the class<br>
-to make a feature completely working,we often need to build some helper classes(like Commands etc.).These classes are same for all the fetures so only need to be implemented once<br>

Client->Controller->Service->Repository<br>
Use Case:<br>
Ability to create a ticket<br>

Assignment <br>
1.)Make GenerateTicketRequestDto only take entry_gate_id and vehicle_type and vehicle_number <br>
-save the vehicle in the database(VehicleRepository) (Fine even if you don't implement this)<br>
-fetch the gate with that Id(EntryGateRepository) <br>

2.)Implement GenerateBill <br>
 -Implement FeesCalculatorStrategy <br>
 -Store the bill in the database(BillRepository) <br>
-BillController<br>
-BillService<br>
