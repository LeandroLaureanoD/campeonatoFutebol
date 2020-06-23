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

import com.cotemig.campeonatoFutebol.model.Cidade;
import com.cotemig.campeonatoFutebol.model.Estadio;
import com.cotemig.campeonatoFutebol.service.CidadeService;
import com.cotemig.campeonatoFutebol.service.EstadioService;

/**
 * @author equipe devs
 *
 */
@RestController
@RequestMapping("/cidade/rest")
public class CidadeRestController {

	@Autowired
	private EstadioService estadioService;

	@Autowired
	private CidadeService cidadeService;

	@RequestMapping(value = "/{id}/get", method = RequestMethod.GET)
	public Optional<Cidade> getCidade(@PathVariable("id") Integer id) {
		return cidadeService.getCidadeById(id);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Cidade> getCidades() {
		return cidadeService.getAllCidades();
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertCidade(@RequestBody Cidade cidade) {
		cidadeService.insertCidade(cidade);
	}

	@RequestMapping(value = "/{idCidade}/getAllEstadios", method = RequestMethod.GET)
	public List<Estadio> getAllEstadiosByCidade(@PathVariable("idCidade") Integer idCidade) {
		return estadioService.getAllEstadiosByCidade(idCidade);
	}

}
