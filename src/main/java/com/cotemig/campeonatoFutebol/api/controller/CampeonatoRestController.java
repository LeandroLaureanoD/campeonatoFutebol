/**
 * 
 */
package com.cotemig.campeonatoFutebol.api.controller;

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
@RequestMapping("/campeonato/rest")
public class CampeonatoRestController {

	@Autowired
	private JogoService jogoService;

	@Autowired
	private EquipeService equipeService;

	@Autowired
	private CampeonatoService campeonatoService;

	@RequestMapping(value = "/{id}/get", method = RequestMethod.GET)
	public Optional<Campeonato> getCampeonato(@PathVariable("id") Integer id) {
		return campeonatoService.getCampeonatoById(id);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Campeonato> getCampeonatos() {
		return campeonatoService.getAllCampeonatos();
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertCampeonato(@RequestBody Campeonato campeonato) {
		campeonatoService.insertCampeonato(campeonato);
	}

	@RequestMapping(value = "/{idCampeonato}/getAllJogos", method = RequestMethod.GET)
	public List<Jogo> getAllJogosByCampeonato(@PathVariable("idCampeonato") Integer idCampeonato) {
		return jogoService.getAllJogosByCampeonato(idCampeonato);
	}

	@RequestMapping(value = "/{idCampeonato}/getAllEquipes", method = RequestMethod.GET)
	public List<Equipe> getAllEquipesByCampeonato(@PathVariable("idCampeonato") Integer idCampeonato) {
		return equipeService.getAllEquipesByCampeonato(idCampeonato);
	}

}
