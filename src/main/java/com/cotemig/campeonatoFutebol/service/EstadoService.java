/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.campeonatoFutebol.model.Estado;

/**
 * @author equipe devs
 *
 */
public interface EstadoService {
	Optional<Estado> getEstadoById(Integer id);

	List<Estado> getAllEstados();

	void insertEstado(Estado estadio);
}
