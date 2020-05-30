/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.campeonatoFutebol.model.Estado;
import com.cotemig.campeonatoFutebol.repository.EstadoRepository;

/**
 * @author equipe devs
 *
 */
@Service("estadoService")
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	EstadoRepository estadoRepository;

	@Override
	public Optional<Estado> getEstadoById(Integer id) {
		return estadoRepository.findById(id);
	}

	@Override
	public List<Estado> getAllEstados() {
		return estadoRepository.findAll();
	}

	@Override
	public void insertEstado(Estado estadio) {
		estadoRepository.save(estadio);
	}

}
