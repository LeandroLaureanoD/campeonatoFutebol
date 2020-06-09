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

	List<Equipe> getAllEquipe();

	List<Equipe> getAllEquipes();

	void deleteAllEquipe();

	void deleteEquipeById(Integer id);

	void updateEquipeById(Integer id);

	void insertEquipe(Equipe equipe);

	void updateEquipeById(Integer id, Equipe equipe);

	List<Equipe> getAllEquipesByCampeonato(Integer idCampeonato);
}
