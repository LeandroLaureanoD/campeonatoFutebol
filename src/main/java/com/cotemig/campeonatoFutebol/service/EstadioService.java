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

	List<Estadio> getAllEstadio();

	List<Estadio> getAllEstadios();

	List<Estadio> getAllEstadiosByCidade(Integer idCidade);

	void deleteAllEstadios();

	void deleteEstadioById(Integer id);

	void updateEstadioById(Integer id, Estadio estadio);

	void updateEstadio(Estadio estadio);

	void insertEstadio(Estadio estadio);
}
