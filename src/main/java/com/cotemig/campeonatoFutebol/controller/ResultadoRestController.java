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

import com.cotemig.campeonatoFutebol.model.Resultado;
import com.cotemig.campeonatoFutebol.service.ResultadoService;

/**
 * @author equipe devs
 *
 */
@RestController
@RequestMapping("/resultado/rest")
public class ResultadoRestController {

	@Autowired
	private ResultadoService resultadoService;

	@RequestMapping(value = "/{id}/get", method = RequestMethod.GET)
	public Optional<Resultado> getResultado(@PathVariable("id") Integer id) {
		return resultadoService.getResultadoById(id);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Resultado> getResultados() {
		return resultadoService.getAllResultados();
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertResultado(@RequestBody Resultado resultado) {
		resultadoService.insertResultado(resultado);
	}

}
