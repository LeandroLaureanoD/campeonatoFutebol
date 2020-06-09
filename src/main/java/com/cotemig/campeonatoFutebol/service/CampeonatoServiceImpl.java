/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.campeonatoFutebol.model.Campeonato;
import com.cotemig.campeonatoFutebol.repository.CampeonatoRepository;

/**
 * @author equipe devs
 *
 */
@Service("campeonatoService")
public class CampeonatoServiceImpl implements CampeonatoService {

	@Autowired
	CampeonatoRepository campeonatoRepository;

	@Override
	public Optional<Campeonato> getCampeonatoById(Integer id) {
		return campeonatoRepository.findById(id);
	}

	@Override
	public List<Campeonato> getAllCampeonatos() {
		return campeonatoRepository.findAll();
	}

	@Override
	public void insertCampeonato(Campeonato campeonato) {
		campeonatoRepository.save(campeonato);
	}

	@Override
	public void deleteAllCampeonatos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCampeonatoById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCampeonato(Campeonato campeonato) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCampeonatoById(Integer id, Campeonato campeonato) {
		// TODO Auto-generated method stub

	}

}
