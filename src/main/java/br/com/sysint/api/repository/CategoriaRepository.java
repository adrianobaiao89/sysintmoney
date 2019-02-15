package br.com.sysint.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysint.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	

}
