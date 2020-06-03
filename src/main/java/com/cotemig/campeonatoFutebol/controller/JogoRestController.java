/**
 * 
 */
package com.cotemig.campeonatoFutebol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.campeonatoFutebol.service.JogoService;

/**
 * @author equipe devs
 *
 */
@RestController
public class JogoRestController {

	@Autowired
	private JogoService jogoService;
}
