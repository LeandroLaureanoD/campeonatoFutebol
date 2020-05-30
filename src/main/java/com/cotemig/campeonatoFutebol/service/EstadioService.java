/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.campeonatoFutebol.model.Estadio;

/**
 * @author equipe devs
 *
 */
public interface EstadioService {
	Optional<Estadio> getEstadioById(Integer id);

	List<Estadio> getAllEstadios();

	void insertEstadio(Estadio estadio);
}
