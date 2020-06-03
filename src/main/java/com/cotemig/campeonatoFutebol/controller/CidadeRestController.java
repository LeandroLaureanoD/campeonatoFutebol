/**
 * 
 */
package com.cotemig.campeonatoFutebol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.campeonatoFutebol.service.CampeonatoService;
import com.cotemig.campeonatoFutebol.service.CidadeService;

/**
 * @author equipe devs
 *
 */
@RestController
public class CidadeRestController {

	@Autowired
	private CidadeService cidadeService;
}
