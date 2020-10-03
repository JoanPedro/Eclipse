package br.com.cod3r.reviewspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.reviewspringboot.model.entities.Produto;
import br.com.cod3r.reviewspringboot.model.repositories.ProdutoRepository;

@RestController()
@RequestMapping(value = "/api/produtos", consumes = {"text/plain"}, headers = "Content-type: text/plain")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping()
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		produtoRepository.save(produto);
		return produto;
	}
}
