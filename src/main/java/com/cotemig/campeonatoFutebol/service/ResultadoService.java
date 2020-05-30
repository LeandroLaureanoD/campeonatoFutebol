/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.campeonatoFutebol.model.Resultado;

/**
 * @author equipe devs
 *
 */
public interface ResultadoService {
	Optional<Resultado> getResultadoById(Integer id);

	List<Resultado> getAllResultados();

	void insertResultado(Resultado resultado);
}
