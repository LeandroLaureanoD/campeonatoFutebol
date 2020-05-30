/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.campeonatoFutebol.model.Cidade;

/**
 * @author equipe devs
 *
 */
public interface CidadeService {
	Optional<Cidade> getCidadeById(Integer id);

	List<Cidade> getAllCidadesByEstado(Integer idEstado);

	List<Cidade> getAllCidades();

	void insertCidade(Cidade cidade);
}
