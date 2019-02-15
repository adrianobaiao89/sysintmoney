package br.com.sysint.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysint.api.model.Lancamento;
import br.com.sysint.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
