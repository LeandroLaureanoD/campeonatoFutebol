/**
 * 
 */
package com.cotemig.campeonatoFutebol.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.campeonatoFutebol.model.Equipe;
import com.cotemig.campeonatoFutebol.service.EquipeService;
import com.cotemig.campeonatoFutebol.service.JogadorService;

/**
 * @author equipe devs
 *
 */
@Controller
public class EquipeController {

	@Autowired
	private EquipeService equipeService;
	
	@Autowired
	private JogadorService jogadorService;

	@RequestMapping(value = "/equipe/inserir", method = RequestMethod.GET)
	public ModelAndView inserirEquipe() {
		return new ModelAndView("equipe/insert", "equipe", new Equipe());
	}

	@RequestMapping(value = "/equipe/inserir", method = RequestMethod.POST)
	public String submitInsert(@Valid @ModelAttribute("equipe") Equipe equipe, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}

		equipeService.insertEquipe(equipe);

		return "redirect:/equipe";
	}

	@RequestMapping(value = "/equipe/delete", method = RequestMethod.GET)
	public ModelAndView delete(Integer id) {
		return new ModelAndView("equipe/delete", "equipe", equipeService.getEquipeById(id).get());
	}

	@RequestMapping(value = "/equipe/delete", method = RequestMethod.POST)
	public String submitDelete(@Valid @ModelAttribute("equipe") Equipe equipe, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}

		equipeService.deleteEquipeById(equipe.getId());

		return "redirect:/equipe";
	}

	@RequestMapping(value = "/equipe/update", method = RequestMethod.GET)
	public ModelAndView update(Integer id) {
		return new ModelAndView("equipe/update", "equipe", equipeService.getEquipeById(id).get());
	}

	@RequestMapping(value = "/equipe/update", method = RequestMethod.POST)
	public String submitUpdate(@Valid @ModelAttribute("equipe") Equipe equipe, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}

		//equipeService.updateEquipeById(equipe.getId(), equipe);
		equipeService.updateEquipe(equipe);

		return "redirect:/equipe";
	}

	@RequestMapping(value = "/equipe/read", method = RequestMethod.GET)
	public ModelAndView read() {
		ModelAndView mav = new ModelAndView("equipe/read");
		mav.addObject("equipes", equipeService.getAllEquipes());
		return mav;
	}

	@RequestMapping(value = "/equipe", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("jogadores", jogadorService.getAllJogadores());
		mav.addObject("equipes", equipeService.getAllEquipes());
		return mav;
	}

}
