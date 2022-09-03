package com.cab.invoice.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cab.invoice.CabInvoiceGenerator;
import com.cab.invoice.model.InvoiceModel;

public class CabInvoiceTest {

	CabInvoiceGenerator invoiceGenerator;

	@Before
	public void initCabInvoiceGenerator() {
		invoiceGenerator = new CabInvoiceGenerator();
	}

	@Test
	public void calculateFareTC1() {

		double totalFare = invoiceGenerator.calculateFare(5.0, 20.0);
		assertEquals(70, totalFare, 0.5);

	}

	@Test
	public void calculateFareTC2() {

		double totalFare = invoiceGenerator.calculateFare(2, 7.5);
		assertEquals(50, totalFare, 0.5);

	}

	@Test
	public void multipleRidesTC1() {
		System.out.println("----------Book multiple rides----------------");
		double multipleRidesFare = invoiceGenerator.bookMultipleRides(4);
		System.out.println("Total fare amount : " + multipleRidesFare + " INR");
	}

	@Test
	public void enhancedInvoiceTC1() {
		System.out.println("------------Enhanced invoice--------------");
		invoiceGenerator.enhancedInvoice();
		InvoiceModel invoice = invoiceGenerator.getInvoice();
		System.out.println(invoice);
	}

}