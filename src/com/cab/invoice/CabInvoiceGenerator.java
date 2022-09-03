package com.cab.invoice;

import com.cab.invoice.util.Constant;
import com.cab.invoice.util.Util;

public class CabInvoiceGenerator {

	public double calculateFare(double distance, double timeInMin) {

		double fare = distance * Constant.RATE_PER_KM
				+ timeInMin * Constant.TIME_CHARGE_PER_MIN;

		if (fare < Constant.MIN_FARE_AMT) {
			fare = Constant.MIN_FARE_AMT;
		}

		fare = Util.parseDoubleVal(fare);
		return fare;
	}

	public double bookMultipleRides(int rideCnt) {
		System.out.println(
				"---------------Booked " + rideCnt + " rides----------------");
		double totalFare = 0;
		for (int i = 0; i < rideCnt; i++) {
			double randomDistance = Util.parseDoubleVal(Math.random() * 8 + 2);
			double randomTime = Util
					.parseDoubleVal((Math.random() * 9 + 1) * randomDistance);
			double fareAmt = calculateFare(randomDistance, randomTime);
			System.out.println("Fare amount for ride " + (i + 1) + " : "
					+ fareAmt + " INR (" + randomDistance + "," + randomTime
					+ ")");
			totalFare = totalFare + fareAmt;
		}
		totalFare = Util.parseDoubleVal(totalFare);
		return totalFare;
	}

}