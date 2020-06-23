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
import com.cotemig.campeonatoFutebol.model.Jogador;
import com.cotemig.campeonatoFutebol.service.JogadorService;

/**
 * @author equipe devs
 *
 */
@RestController
@RequestMapping("/jogador/rest")
public class JogadorRestController {

	@Autowired
	private JogadorService jogadorService;

	@RequestMapping(value = "/{id}/get", method = RequestMethod.GET)
	public Optional<Jogador> getJogador(@PathVariable("id") Integer id) {
		return jogadorService.getJogadorById(id);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Jogador> getJogadores() {
		return jogadorService.getAllJogadores();
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertJogador(@RequestBody Jogador jogador) {
		jogadorService.insertJogador(jogador);
	}

	@RequestMapping(value = "/{idJogador}/getByAge/{age}", method = RequestMethod.GET)
	public List<Jogador> getAllJogadoresByAge(@PathVariable("age") Integer age) {
		return jogadorService.getAllJogadoresByAge(age);
	}

	@RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
	public void deleteJogador() {
		jogadorService.deleteAllJogador();
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
	public void deleteJogador(@PathVariable("id") Integer id) {
		jogadorService.deleteJogadorById(id);
	}

	@RequestMapping(value = "/{id}/update", method = RequestMethod.PUT)
	public void updateJogador(@RequestBody Jogador jogador, @PathVariable("id") Integer id) {
		jogadorService.updateJogadorById(id, jogador);
	}

}
