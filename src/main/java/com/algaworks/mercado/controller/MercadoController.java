package com.algaworks.mercado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.mercado.model.produto;

@Controller
public class MercadoController {

	@Autowired
	private produto produtos;
	
	@GetMapping("/mercado")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaMercado");
		
		modelAndView.addObject("Produtos", produtos.findAll());
		
		return modelAndView;
	}
	
}
