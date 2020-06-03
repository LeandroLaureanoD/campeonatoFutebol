/**
 * 
 */
package com.cotemig.campeonatoFutebol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.campeonatoFutebol.service.ResultadoService;

/**
 * @author equipe devs
 *
 */
@RestController
public class ResultadoRestController {

	@Autowired
	private ResultadoService resultadoService;
}
