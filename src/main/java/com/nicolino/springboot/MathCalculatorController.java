package com.nicolino.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathCalculatorController {

	@GetMapping("sum-two-values")
	public String sumTwoValues(@RequestParam String value1, @RequestParam String value2) {
		Double result =  Double.parseDouble(value1) +  Double.parseDouble(value2);
		return Double.toString(result);
	}
}
