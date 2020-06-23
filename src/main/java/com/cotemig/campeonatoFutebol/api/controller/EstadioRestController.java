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

import com.cotemig.campeonatoFutebol.model.Estadio;
import com.cotemig.campeonatoFutebol.model.Jogo;
import com.cotemig.campeonatoFutebol.service.EstadioService;
import com.cotemig.campeonatoFutebol.service.JogoService;

/**
 * @author equipe devs
 *
 */
@RestController
@RequestMapping("/estadio/rest")
public class EstadioRestController {

	@Autowired
	private JogoService jogoService;

	@Autowired
	private EstadioService estadioService;

	@RequestMapping(value = "/{id}/get", method = RequestMethod.GET)
	public Optional<Estadio> getEstadio(@PathVariable("id") Integer id) {
		return estadioService.getEstadioById(id);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Estadio> getEstadios() {
		return estadioService.getAllEstadios();
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertEstadio(@RequestBody Estadio estadio) {
		estadioService.insertEstadio(estadio);
	}

	@RequestMapping(value = "/{idEstadio}/getAllJogos", method = RequestMethod.GET)
	public List<Jogo> getAllJogosByEstadio(@PathVariable("idEstadio") Integer idEstadio) {
		return jogoService.getAllJogosByEstadio(idEstadio);
	}

}
