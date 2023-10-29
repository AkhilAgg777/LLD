-Alt+Insert shortcut for getters and setters in IntelliJ
-start by implementing the models
-either take the values via a constructor or instantiate within the class
-to make a feature completely working,we often need to build some helper classes(like Commands etc.).These classes are same for all the fetures so only need to be implemented once

Client->Controller->Service->Repository
Use Case:
Ability to create a ticket

Assignment
1.)Make GenerateTicketRequestDto only take entry_gate_id and vehicle_type and vehicle_number
 -save the vehicle in the database(VehicleRepository)
-fetch the gate with that Id(EntryGateRepository)

2.)Implement GenerateBill
 -Implement FeesCalculatorStrategy
 -Store the bill in the database(BillRepository)
-BillController
-BillService