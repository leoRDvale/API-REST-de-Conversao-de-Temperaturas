package com.leonard.calctemperatura.domain;

import org.springframework.stereotype.Component;

@Component
public class TemperatureOperator {

	public Double celsiusParaKelvin(Double celsius) {
		return celsius + 273.15;
	}

	public Double celsiusParaFahrenheit(Double celsius) {
		return (celsius * 1.8) + 32.0;
	}

	public Double kelvinParaCelsius(Double kelvin) {
		return kelvin - 273.15;
	}

	public Double kelvinParaFahrenheit(Double kelvin) {
		return ((kelvin - 273.15) * 1.8) + 32.0;
	}

	public Double fahrenheitParaCelsius(Double fahrenheit) {
		return (fahrenheit - 32.0) / 1.8;
	}

	public Double fahrenheitParaKelvin(Double fahrenheit) {
		return ((fahrenheit - 32.0) / 1.8) + 273.15;
	}
}