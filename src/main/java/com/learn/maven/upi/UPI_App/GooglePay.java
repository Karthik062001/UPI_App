package com.learn.maven.upi.UPI_App;

public class GooglePay extends UPIabstract{

	@Override
	public void viewBalance() {
		viewBalance(balance);
		System.out.println("Showing balance in Googlepay "+balance);
	}
	public void ticketBooking()
    {
        System.out.println("GooglePay: Ticket booked successfully");
    }

}
