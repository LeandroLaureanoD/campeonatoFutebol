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

	@Override
	public void deleteAllEquipe() {
		equipeRepository.deleteAll();
	}

	@Override
	public void deleteEquipeById(Integer id) {
		equipeRepository.deleteById(id);
	}

	@Override
	public void updateEquipe(Equipe equipe) {
		equipeRepository.save(equipe);
	}

	@Override
	public void updateEquipeById(Integer id, Equipe equipe) {
		Optional<Equipe> getEquipe = getEquipeById(id);
		getEquipe.get().setNome(equipe.getNome());

		equipeRepository.save(equipe);
	}

	@Override
	public List<Equipe> getAllEquipesByCampeonato(Integer idCampeonato) {
		return equipeRepository.getAllEquipesByCampeonato(idCampeonato);
	}

	@Override
	public String getNomeEquipe(Integer id) {
		return equipeRepository.getNomeEquipe(id);
	}

}
