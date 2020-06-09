/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.campeonatoFutebol.model.Classificacao;

/**
 * @author equipe devs
 *
 */
public interface ClassificacaoService {
	Optional<Classificacao> getClassificacaoById(Integer id);

	List<Classificacao> getAllClassificacoes();

	void insertClassificacao(Classificacao classificacao);

	Optional<Classificacao> getClassificacaoByEquipe(Integer idEquipe);
}
