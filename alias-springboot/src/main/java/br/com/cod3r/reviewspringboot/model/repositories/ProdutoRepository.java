package br.com.cod3r.reviewspringboot.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.cod3r.reviewspringboot.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
	
}
