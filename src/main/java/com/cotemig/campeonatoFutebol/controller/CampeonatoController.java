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

import com.cotemig.campeonatoFutebol.model.Campeonato;
import com.cotemig.campeonatoFutebol.model.Jogo;
import com.cotemig.campeonatoFutebol.service.CampeonatoService;
import com.cotemig.campeonatoFutebol.service.JogoService;

/**
 * @author equipe devs
 *
 */
@RestController
public class CampeonatoController {

	@Autowired
	CampeonatoService campeonatoService;
	
	@RequestMapping(value = "/inserir/campeonato", method = RequestMethod.GET)
	public ModelAndView inserirCampeonato(){
		
		return new ModelAndView("insert-campeonato","campeonato",new Campeonato());
	}
	
	@RequestMapping(value = "/inserir/campeonato", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("campeonato")Campeonato campeonato, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	        
	 campeonatoService.insertCampeonato(campeonato);
	        
	        return "redirect:";
	 }
	
	@RequestMapping(value = "/delete/campeonato", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "campeonato", campeonatoService.getCampeonatoById(id).get());
	 }
	 
	 @RequestMapping(value = "/delete/campeonato", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("campeonato")Campeonato campeonato,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 campeonatoService.deleteCampeonatoById(campeonato.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/update/campeonato", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "campeonato", campeonatoService.getCampeonatoById(id).get());
	 }
	 
	 @RequestMapping(value = "/update/campeonato", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("campeonato")Campeonato campeonato,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 campeonatoService.updateCampeonatoById(campeonato.getId(), campeonato);
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read/campeonato", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("read");
	        mav.addObject("campeonato", campeonatoService.getAllCampeonatos());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/campeonato", method = RequestMethod.GET)
	 public ModelAndView index() {
	        
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("campeonato", campeonatoService.getAllCampeonatos());
	        return mav;
	 }
}
