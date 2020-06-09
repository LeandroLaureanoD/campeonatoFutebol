/**
 * 
 */
package com.cotemig.campeonatoFutebol.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.campeonatoFutebol.model.Campeonato;
import com.cotemig.campeonatoFutebol.model.Equipe;
import com.cotemig.campeonatoFutebol.model.Jogo;
import com.cotemig.campeonatoFutebol.service.CampeonatoService;
import com.cotemig.campeonatoFutebol.service.EquipeService;
import com.cotemig.campeonatoFutebol.service.JogoService;

/**
 * @author equipe devs
 *
 */
@RestController
public class CampeonatoRestController {

	@Autowired
	private JogoService jogoService;
	
	@Autowired
	private EquipeService equipeService;

	@Autowired
	private CampeonatoService campeonatoService;

	/* 4 métodos básicos implementados */
	@RequestMapping(value = "campeonato/rest/get/{id}", method = RequestMethod.GET)
	public Optional<Campeonato> getCampeonato(@PathVariable("id") Integer id) {
		return campeonatoService.getCampeonatoById(id);
	}

	@RequestMapping(value = "campeonato/rest/getAll", method = RequestMethod.GET)
	public List<Campeonato> getCampeonatos() {
		return campeonatoService.getAllCampeonatos();
	}

	@RequestMapping(value = "campeonato/rest/insert", method = RequestMethod.POST)
	public void insertCampeonato(@RequestBody Campeonato campeonato) {
		campeonatoService.insertCampeonato(campeonato);
	}

	@RequestMapping(value = "campeonato/rest/getAllJogos/{idCampeonato}", method = RequestMethod.GET)
	public List<Jogo> getAllJogosByCampeonato(@PathVariable("idCampeonato") Integer idCampeonato) {
		return jogoService.getAllJogosByCampeonato(idCampeonato);
	}

	@RequestMapping(value = "campeonato/rest/getAllEquipes/{idCampeonato}", method = RequestMethod.GET)
	public List<Equipe> getAllEquipesByCampeonato(@PathVariable("idCampeonato") Integer idCampeonato) {
		return equipeService.getAllEquipesByCampeonato(idCampeonato);
	}

}
