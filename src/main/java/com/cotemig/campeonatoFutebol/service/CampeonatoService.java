/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.campeonatoFutebol.model.Campeonato;

/**
 * @author equipe devs
 *
 */
public interface CampeonatoService {
	Optional<Campeonato> getCampeonatoById(Integer id);

	List<Campeonato> getAllCampeonatos();

	void insertCampeonato(Campeonato campeonato);
}
