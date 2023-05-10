# Bharat-Gas-Agency
This is a gas booking system that manages the booking, delivery, and invoice generation of gas cylinders for a gas agency.

## Getting Started
To use this system, you should have Java JDK 8 or later installed on your machine.<br>

To compile the code, navigate to the directory where the Main.java file is located, and type the following command:<br>
`javac Main.java`<br>
To run the code, type the following command:<br>
`java Main`

## System Overview
This system has the following classes:<br>

* Customers: This class represents the customers of the gas agency and contains their name, address, phone number, and gas connection number.
* gasBooking: This class represents the booking information of the customers, such as the booking date, number of cylinders, and the amount paid for the booking.
* gasSupplier: This class represents the gas suppliers of the gas agency and contains their name, phone number, and the gas agency code.
* Delivery: This class represents the delivery information of the gas cylinders, such as the delivery date, status, refund amount, and the name of the delivery person.<br>

The Main class is the entry point to the system and contains the main method. It provides the following functionalities:

* cylinderCount: This method calculates the number of cylinders delivered to each area for each month.
* checkLateDel: This method calculates the number of late deliveries in each month.
* numberOfSingleCylinders: This method prints the details of the customers who have booked only one cylinder.
* DeliveryDetails: This method prints the details of the customers who have received the delivery from a specific delivery person.
* printReport: This method prints the delivery report, which includes the number of cylinders booked, delivered, cancelled, and pending.
* printInvoice: This method prints the invoice for a delivered gas cylinder.
