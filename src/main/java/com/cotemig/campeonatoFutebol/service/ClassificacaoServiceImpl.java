/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.campeonatoFutebol.model.Classificacao;
import com.cotemig.campeonatoFutebol.repository.ClassificacaoRepository;

/**
 * @author equipe devs
 *
 */
@Service("classificacaoService")
public class ClassificacaoServiceImpl implements ClassificacaoService {

	@Autowired
	ClassificacaoRepository classificacaoRepository;

	@Override
	public Optional<Classificacao> getClassificacaoById(Integer id) {
		return classificacaoRepository.findById(id);
	}

	@Override
	public List<Classificacao> getAllClassificacoes() {
		return classificacaoRepository.findAll();
	}

	@Override
	public void insertClassificacao(Classificacao classificacao) {
		classificacaoRepository.save(classificacao);
	}

	@Override
	public Optional<Classificacao> getClassificacaoByEquipe(Integer idEquipe) {
		return classificacaoRepository.getClassificacaoByEquipe(idEquipe);
	}

}
