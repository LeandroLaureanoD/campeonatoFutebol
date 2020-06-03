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

import com.cotemig.campeonatoFutebol.model.Cidade;
import com.cotemig.campeonatoFutebol.model.Estadio;
import com.cotemig.campeonatoFutebol.service.CidadeService;
import com.cotemig.campeonatoFutebol.service.EstadioService;

/**
 * @author equipe devs
 *
 */
@RestController
public class CidadeRestController {

	@Autowired
	private EstadioService estadioService;

	@Autowired
	private CidadeService cidadeService;

	/* 4 métodos básicos implementados */
	@RequestMapping(value = "cidade/rest/get/{id}", method = RequestMethod.GET)
	public Optional<Cidade> getCidade(@PathVariable("id") Integer id) {
		return cidadeService.getCidadeById(id);
	}

	@RequestMapping(value = "cidade/rest/getAll", method = RequestMethod.GET)
	public List<Cidade> getCidades() {
		return cidadeService.getAllCidades();
	}

	@RequestMapping(value = "cidade/rest/insert", method = RequestMethod.POST)
	public void insertCidade(@RequestBody Cidade cidade) {
		cidadeService.insertCidade(cidade);
	}

	@RequestMapping(value = "cidade/rest/getAllEstadios/{idCidade}", method = RequestMethod.GET)
	public List<Estadio> getAllEstadiosByCidade(@PathVariable("idCidade") Integer idCidade) {
		return estadioService.getAllEstadiosByCidade(idCidade);
	}

}
