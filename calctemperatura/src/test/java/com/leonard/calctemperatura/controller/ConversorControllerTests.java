package com.leonard.calctemperatura.controller;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class ConversorControllerTests {

	private final MockMvc mockMvc = MockMvcBuilders
			.standaloneSetup(new ConversorController(new com.leonard.calctemperatura.domain.TemperatureOperator()))
			.setControllerAdvice(new com.leonard.calctemperatura.exception.CustomizedResponseEntityExceptionHandler())
			.build();

	@Test
	void shouldReturnBadRequestForNonNumericInput() throws Exception {
		mockMvc.perform(get("/conversor/celsiusParaKelvin/abc"))
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.message").value("O valor informado não é numérico."));
	}

	@Test
	void shouldConvertCelsiusToKelvin() throws Exception {
		mockMvc.perform(get("/conversor/celsiusParaKelvin/0"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$").value(273.15));
	}
}