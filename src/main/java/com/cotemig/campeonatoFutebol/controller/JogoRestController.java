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

import com.cotemig.campeonatoFutebol.model.Jogo;
import com.cotemig.campeonatoFutebol.service.JogoService;

/**
 * @author equipe devs
 *
 */
@RestController
public class JogoRestController {

	@Autowired
	private JogoService jogoService;

	@RequestMapping(value = "jogo/rest/get/{id}", method = RequestMethod.GET)
	public Optional<Jogo> getJogo(@PathVariable("id") Integer id) {
		return jogoService.getJogoById(id);
	}

	@RequestMapping(value = "jogo/rest/getAll", method = RequestMethod.GET)
	public List<Jogo> getJogos() {
		return jogoService.getAllJogos();
	}

	@RequestMapping(value = "jogo/rest/insert", method = RequestMethod.POST)
	public void insertJogo(@RequestBody Jogo jogo) {
		jogoService.insertJogo(jogo);
	}

}
