package com.cab.invoice.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cab.invoice.CabInvoiceGenerator;

public class CabInvoiceTest {

	@Test
	public void calculateFareTC1() {

		CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
		double totalFare = invoiceGenerator.calculateFare(5.0, 20.0);
		assertEquals(70, totalFare, 0.5);

	}

	@Test
	public void calculateFareTC2() {

		CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
		double totalFare = invoiceGenerator.calculateFare(2, 7.5);
		assertEquals(50, totalFare, 0.5);

	}

}