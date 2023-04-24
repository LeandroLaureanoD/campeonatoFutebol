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

	void deleteAllCampeonatos();

	void deleteCampeonatoById(Integer id);

	void updateCampeonato(Campeonato campeonato);

	void insertCampeonato(Campeonato campeonato);

	void updateCampeonatoById(Integer id, Campeonato campeonato);
}
