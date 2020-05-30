/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.campeonatoFutebol.model.Equipe;
import com.cotemig.campeonatoFutebol.repository.EquipeRepository;

/**
 * @author equipe devs
 *
 */
@Service("equipeService")
public class EquipeServiceImpl implements EquipeService {

	@Autowired
	EquipeRepository equipeRepository;

	@Override
	public Optional<Equipe> getEquipeById(Integer id) {
		return equipeRepository.findById(id);
	}

	@Override
	public List<Equipe> getAllEquipes() {
		return equipeRepository.findAll();
	}

	@Override
	public void insertEquipe(Equipe equipe) {
		equipeRepository.save(equipe);
	}

}
