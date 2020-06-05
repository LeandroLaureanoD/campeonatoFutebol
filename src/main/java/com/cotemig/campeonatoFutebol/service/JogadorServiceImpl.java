/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.campeonatoFutebol.model.Jogador;
import com.cotemig.campeonatoFutebol.repository.JogadorRepository;

/**
 * @author equipe devs
 *
 */
@Service("jogadorService")
public class JogadorServiceImpl implements JogadorService {

	@Autowired
	JogadorRepository jogadorRepository;

	@Override
	public Optional<Jogador> getJogadorById(Integer id) {
		return jogadorRepository.findById(id);
	}

	@Override
	public List<Jogador> getAllJogadoresByAge(Integer age) {
		return jogadorRepository.getAllJogadoresByAge(age);
	}

	@Override
	public List<Jogador> getAllJogadoresByEquipe(Integer idEquipe) {
		return jogadorRepository.getAllJogadoresByEquipe(idEquipe);
	}

	@Override
	public List<Jogador> getAllJogadores() {
		return jogadorRepository.findAll();
	}

	@Override
	public void insertJogador(Jogador jogador) {
		jogadorRepository.save(jogador);
	}

	@Override
	public void updateJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllJogador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateJogadorById(Integer id, Jogador jogador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllJogadorById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteJogadorById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
