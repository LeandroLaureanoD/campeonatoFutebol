/**
 * 
 */
package com.cotemig.campeonatoFutebol.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.campeonatoFutebol.model.Jogador;
import com.cotemig.campeonatoFutebol.service.EquipeService;
import com.cotemig.campeonatoFutebol.service.JogadorService;

/**
 * @author equipe devs
 *
 */
@RestController
public class JogadorController {

	@Autowired
	 private JogadorService jogadorService;
	
	@Autowired
	 private EquipeService equipeService;
	
	@RequestMapping(value = "/jogador/all", method = RequestMethod.GET)
	 public ModelAndView insert() {
	        return new ModelAndView("Jogador", "jogador", jogadorService.getAllJogadores());
	 }
	//ROTA INSERT JOGADOR
	
	 @RequestMapping(value = "/jogador/insert", method = RequestMethod.GET)
	 public ModelAndView insertJogador() {
	       
		 ModelAndView mav = new ModelAndView("insertJogador");
		 
		 mav.addObject("jogador", new Jogador());
		 mav.addObject("equipe", equipeService.getAllEquipes());
		 
		 return mav;         		       		
	 }
	 
	 @RequestMapping(value = "/jogador", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("jogador")Jogador jogador, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 System.out.println(jogador.getEquipe().getId());
	 jogadorService.insertJogador(jogador);
	        
	        return "redirect:jogador/all";
	 } 
	//ROTA DELETE
	 
	 @RequestMapping(value = "/jogador/delete", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "jogador", jogadorService.getJogadorById(id).get());
	 }
	
	 @RequestMapping(value = "/delete", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("jogador")Jogador jogador,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 jogadorService.getJogadorById(jogador.getId());
	        
	        return "redirect:jogador/all";
	 }
	
	//ROTA UPDATE
	 
	 @RequestMapping(value = "/update", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "jogador", jogadorService.getJogadorById(id).get());
	 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("jogador")Jogador jogador,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	jogadorService.updateJogador(jogador);
	        
	        return "redirect:";
	 }
	 @RequestMapping(value = "/read", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("Jogador");
	        mav.addObject("jogador", jogadorService.getAllJogadores());
	        return mav;
	 }
	
}
