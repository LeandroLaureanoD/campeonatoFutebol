/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.campeonatoFutebol.model.Resultado;
import com.cotemig.campeonatoFutebol.repository.ResultadoRepository;

/**
 * @author equipe devs
 *
 */
@Service("resultadoService")
public class ResultadoServiceImpl implements ResultadoService {

	@Autowired
	ResultadoRepository resultadoRepository;

	@Override
	public Optional<Resultado> getResultadoById(Integer id) {
		return resultadoRepository.findById(id);
	}

	@Override
	public List<Resultado> getAllResultados() {
		return resultadoRepository.findAll();
	}

	@Override
	public void insertResultado(Resultado resultado) {
		resultadoRepository.save(resultado);
	}

}
