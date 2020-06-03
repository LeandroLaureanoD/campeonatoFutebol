/**
 * 
 */
package com.cotemig.campeonatoFutebol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.campeonatoFutebol.service.EstadoService;

/**
 * @author equipe devs
 *
 */
@RestController
public class EstadoRestController {

	@Autowired
	private EstadoService estadoService;
}
