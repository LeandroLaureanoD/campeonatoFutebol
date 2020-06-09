/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.campeonatoFutebol.model.Jogo;

/**
 * @author equipe devs
 *
 */
public interface JogoService {
	Optional<Jogo> getJogoById(Integer id);

	List<Jogo> getAllJogosByEstadio(Integer idEstadio);

	List<Jogo> getAllJogos();

	void insertJogo(Jogo jogo);

	List<Jogo> getAllJogosByCampeonato(Integer idCampeonato);

}
