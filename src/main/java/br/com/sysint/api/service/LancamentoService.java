package br.com.sysint.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sysint.api.model.Lancamento;
import br.com.sysint.api.model.Pessoa;
import br.com.sysint.api.repository.LancamentoRepository;
import br.com.sysint.api.repository.PessoaRepository;
import br.com.sysint.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lacamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lacamentoRepository.save(lancamento);
	}
	
	
}
