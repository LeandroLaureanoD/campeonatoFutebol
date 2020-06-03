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
import com.cotemig.campeonatoFutebol.model.Estado;
import com.cotemig.campeonatoFutebol.service.CidadeService;
import com.cotemig.campeonatoFutebol.service.EstadoService;

/**
 * @author equipe devs
 *
 */
@RestController
public class EstadoRestController {

	@Autowired
	private CidadeService cidadeService;

	@Autowired
	private EstadoService estadoService;

	/* 4 métodos básicos implementados */
	@RequestMapping(value = "estado/rest/get/{id}", method = RequestMethod.GET)
	public Optional<Estado> getEstado(@PathVariable("id") Integer id) {
		return estadoService.getEstadoById(id);
	}

	@RequestMapping(value = "estado/rest/getAll", method = RequestMethod.GET)
	public List<Estado> getEstados() {
		return estadoService.getAllEstados();
	}

	@RequestMapping(value = "estado/rest/insert", method = RequestMethod.POST)
	public void insertEstado(@RequestBody Estado estado) {
		estadoService.insertEstado(estado);
	}

	@RequestMapping(value = "estado/rest/getAllCidades/{idEstado}", method = RequestMethod.GET)
	public List<Cidade> getAllCidadesByEstado(@PathVariable("idEstado") Integer idEstado) {
		return cidadeService.getAllCidadesByEstado(idEstado);
	}

}
