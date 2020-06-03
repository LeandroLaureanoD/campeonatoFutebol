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

import com.cotemig.campeonatoFutebol.model.Classificacao;
import com.cotemig.campeonatoFutebol.service.ClassificacaoService;

/**
 * @author equipe devs
 *
 */
@RestController
public class ClassificacaoRestController {

	@Autowired
	private ClassificacaoService classificacaoService;

	@RequestMapping(value = "classificacao/rest/get/{id}", method = RequestMethod.GET)
	public Optional<Classificacao> getClassificacao(@PathVariable("id") Integer id) {
		return classificacaoService.getClassificacaoById(id);
	}

	@RequestMapping(value = "classificacao/rest/getAll", method = RequestMethod.GET)
	public List<Classificacao> getClassificacoes() {
		return classificacaoService.getAllClassificacoes();
	}

	@RequestMapping(value = "classificacao/rest/insert", method = RequestMethod.POST)
	public void insertClassificacao(@RequestBody Classificacao classificacao) {
		classificacaoService.insertClassificacao(classificacao);
	}

}
