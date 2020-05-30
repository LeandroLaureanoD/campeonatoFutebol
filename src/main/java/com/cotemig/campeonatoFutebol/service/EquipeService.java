/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.campeonatoFutebol.model.Equipe;

/**
 * @author equipe devs
 *
 */
public interface EquipeService {
	Optional<Equipe> getEquipeById(Integer id);

	List<Equipe> getAllEquipes();

	void insertEquipe(Equipe equipe);
}
