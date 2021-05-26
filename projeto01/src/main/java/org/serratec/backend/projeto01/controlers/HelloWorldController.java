package org.serratec.backend.projeto01.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/ola")
	public String sayHello(@RequestParam String nome, String sobrenome) {
		return nome.toUpperCase()+" "+sobrenome.toLowerCase();
	}
	
	@GetMapping("/soma")
	public String somar(@RequestParam Integer n1, Integer n2) {
		return "A soma é: "+(n1+n2);
	}
	
	@GetMapping("/subtrair")
	public String subtrair(@RequestParam Integer n1, Integer n2) {
		return "A subtração é: "+(n1-n2);
	}
	
	@GetMapping("/multiplicar")
	public String multiplicar(@RequestParam Integer n1, Integer n2) {
		return "A multiplicação é: "+(n1*n2);
	}
	
	@GetMapping("/dividir")
	public String dividr(@RequestParam Double n1, Double n2) {
		if (n2==0) {
			return "Não é possível dividir um número por zero!";
		} else {
		
		return "A divisão é: "+(n1/n2);}
	}
	
	@GetMapping("/operacao")
	public String dividr(@RequestParam String operador,Double n1, Double n2) {
		if(operador.contains("-")) {
			return "A subtração é: "+(n1-n2);
		} else if (operador.contains("*")) {
			return "A multiplicação é: "+(n1*n2);
		} else if (operador.contains("/")) {
			return "A divisão é: "+(n1/n2);
		} if(operador.contains("+")) {
			return "A soma é: "+(n1+n2);
		} else {
			return "Operador inválido";
		}
	}		
		
		
		
		
	}
	

