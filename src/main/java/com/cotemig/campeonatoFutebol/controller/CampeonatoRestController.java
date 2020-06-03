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
import com.cotemig.campeonatoFutebol.service.CampeonatoService;

/**
 * @author equipe devs
 *
 */
@RestController
public class CampeonatoRestController {

	@Autowired
	private CampeonatoService campeonatoService;

	/* 3 métodos básicos implementados */
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

}
