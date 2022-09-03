package com.cab.invoice.model;

import com.cab.invoice.util.Util;

public class InvoiceModel {

	int totalRides;
	double totalInvoiceFare;
	double avgFare;

	public int getTotalRides() {
		return totalRides;
	}

	public void setTotalRides(int totalRides) {
		this.totalRides = totalRides;
	}

	public double getTotalInvoiceFare() {
		return totalInvoiceFare;
	}

	public void setTotalInvoiceFare(double totalInvoiceFare) {
		this.totalInvoiceFare = Util.parseDoubleVal(totalInvoiceFare);
	}

	public double getAvgFare() {
		return avgFare;
	}

	public void setAvgFare(double avgFare) {
		this.avgFare = Util.parseDoubleVal(avgFare);
	}

	@Override
	public String toString() {
		return "InvoiceModel [totalRides=" + totalRides + ", totalInvoiceFare="
				+ totalInvoiceFare + ", avgFare=" + avgFare + "]";
	}
}