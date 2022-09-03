package com.cab.invoice.util;

import java.text.DecimalFormat;

public class Util {

	private static DecimalFormat decimalFormat = new DecimalFormat("#.##");

	public static double parseDoubleVal(double val) {
		return Double.parseDouble(decimalFormat.format(val));
	}

}