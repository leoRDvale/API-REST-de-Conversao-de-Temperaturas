package com.leonard.calctemperatura.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonard.calctemperatura.domain.TemperatureOperator;
import com.leonard.calctemperatura.exception.UnsupportedTemperatureTargetException;
import com.leonard.calctemperatura.util.NumberConverter;

@RestController
@RequestMapping("/conversor")
public class ConversorController {

	private final TemperatureOperator temperatureOperator;

	public ConversorController(TemperatureOperator temperatureOperator) {
		this.temperatureOperator = temperatureOperator;
	}

	@GetMapping("/celsiusParaKelvin/{temperatura}")
	public ResponseEntity<Double> celsiusParaKelvin(@PathVariable String temperatura) {
		return ResponseEntity.ok(temperatureOperator.celsiusParaKelvin(parseTemperature(temperatura)));
	}

	@GetMapping("/celsiusParaFahrenheit/{temperatura}")
	public ResponseEntity<Double> celsiusParaFahrenheit(@PathVariable String temperatura) {
		return ResponseEntity.ok(temperatureOperator.celsiusParaFahrenheit(parseTemperature(temperatura)));
	}

	@GetMapping("/kelvinParaCelsius/{temperatura}")
	public ResponseEntity<Double> kelvinParaCelsius(@PathVariable String temperatura) {
		return ResponseEntity.ok(temperatureOperator.kelvinParaCelsius(parseTemperature(temperatura)));
	}

	@GetMapping("/kelvinParaFahrenheit/{temperatura}")
	public ResponseEntity<Double> kelvinParaFahrenheit(@PathVariable String temperatura) {
		return ResponseEntity.ok(temperatureOperator.kelvinParaFahrenheit(parseTemperature(temperatura)));
	}

	@GetMapping("/fahrenheitParaCelsius/{temperatura}")
	public ResponseEntity<Double> fahrenheitParaCelsius(@PathVariable String temperatura) {
		return ResponseEntity.ok(temperatureOperator.fahrenheitParaCelsius(parseTemperature(temperatura)));
	}

	@GetMapping("/fahrenheitParaKelvin/{temperatura}")
	public ResponseEntity<Double> fahrenheitParaKelvin(@PathVariable String temperatura) {
		return ResponseEntity.ok(temperatureOperator.fahrenheitParaKelvin(parseTemperature(temperatura)));
	}

	private Double parseTemperature(String temperatura) {
		if (!NumberConverter.isNumeric(temperatura)) {
			throw new UnsupportedTemperatureTargetException("O valor informado não é numérico.");
		}

		return NumberConverter.convertToDouble(temperatura);
	}
}