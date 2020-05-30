/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.campeonatoFutebol.model.Cidade;
import com.cotemig.campeonatoFutebol.repository.CidadeRepository;

/**
 * @author equipe devs
 *
 */
@Service("cidadeService")
public class CidadeServiceImpl implements CidadeService {

	@Autowired
	CidadeRepository cidadeRepository;

	@Override
	public Optional<Cidade> getCidadeById(Integer id) {
		return cidadeRepository.findById(id);
	}

	@Override
	public List<Cidade> getAllCidadesByEstado(Integer idEstado) {
		return cidadeRepository.getAllCidadesByEstado(idEstado);
	}

	@Override
	public List<Cidade> getAllCidades() {
		return cidadeRepository.findAll();
	}

	@Override
	public void insertCidade(Cidade cidade) {
		cidadeRepository.save(cidade);
	}

}
