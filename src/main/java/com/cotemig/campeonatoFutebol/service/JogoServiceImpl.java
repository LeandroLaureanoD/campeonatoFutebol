/**
 * 
 */
package com.cotemig.campeonatoFutebol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.campeonatoFutebol.model.Jogo;
import com.cotemig.campeonatoFutebol.repository.JogoRepository;

/**
 * @author equipe devs
 *
 */
@Service("jogoService")
public class JogoServiceImpl implements JogoService {

	@Autowired
	JogoRepository jogoRepository;

	@Override
	public Optional<Jogo> getJogoById(Integer id) {
		return jogoRepository.findById(id);
	}

	@Override
	public List<Jogo> getAllJogos() {
		return jogoRepository.findAll();
	}

	@Override
	public void insertJogo(Jogo jogo) {
		jogoRepository.save(jogo);
	}

}
