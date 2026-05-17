package com.leonard.calctemperatura.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TemperatureOperatorTests {

	private final TemperatureOperator temperatureOperator = new TemperatureOperator();

	@Test
	void shouldConvertCelsiusToKelvin() {
		assertEquals(273.15, temperatureOperator.celsiusParaKelvin(0.0));
	}

	@Test
	void shouldConvertFahrenheitToCelsius() {
		assertEquals(0.0, temperatureOperator.fahrenheitParaCelsius(32.0));
	}
}