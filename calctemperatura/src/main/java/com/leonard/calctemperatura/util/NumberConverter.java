package com.leonard.calctemperatura.util;

public final class NumberConverter {

	private NumberConverter() {
	}

	public static boolean isNumeric(String value) {
		if (value == null || value.isBlank()) {
			return false;
		}

		String normalizedValue = value.replace(',', '.');
		return normalizedValue.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

	public static Double convertToDouble(String value) {
		if (value == null) {
			return null;
		}

		return Double.valueOf(value.replace(',', '.'));
	}
}