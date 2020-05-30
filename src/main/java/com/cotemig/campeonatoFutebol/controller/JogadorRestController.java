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

import com.cotemig.campeonatoFutebol.model.Jogador;
import com.cotemig.campeonatoFutebol.service.JogadorService;

/**
 * @author equipe devs
 *
 */
@RestController
public class JogadorRestController {
	@Autowired
	private JogadorService jogadorService;

	@RequestMapping(value = "jogador/rest/get/{id}", method = RequestMethod.GET)
	public Optional<Jogador> getJogador(@PathVariable("id") Integer id) {
		return jogadorService.getJogadorById(id);
	}

	@RequestMapping(value = "jogador/rest/getByAge/{age}", method = RequestMethod.GET)
	public List<Jogador> getAllJogadoresByAge(@PathVariable("age") Integer age) {
		return jogadorService.getAllJogadoresByAge(age);
	}

	@RequestMapping(value = "jogador/rest/getAll", method = RequestMethod.GET)
	public List<Jogador> getJogadores() {
		return jogadorService.getAllJogadores();
	}

	@RequestMapping(value = "jogador/rest/insert", method = RequestMethod.POST)
	public void insertJogador(@RequestBody Jogador jogador) {
		jogadorService.insertJogador(jogador);
	}

}
