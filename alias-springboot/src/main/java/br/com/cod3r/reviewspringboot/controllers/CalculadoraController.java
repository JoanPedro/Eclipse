package br.com.cod3r.reviewspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("somar/{a}/{b}")
	public Double somar(@PathVariable double a, @PathVariable double b) {
		return a + b;
	}
	
	@GetMapping("/subtrair")
	public Double subtrair(
		@RequestParam(name = "a") double a,
		@RequestParam(name = "b") double b
	) {
		return a - b;
	}
}
