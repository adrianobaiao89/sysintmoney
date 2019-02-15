package br.com.sysint.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysint.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}