package com.demo.util;

public class MathUtil {

	public static double rounded3(double value) {
		return (double) Math.round(value * 1000) / 1000;
	}
}
