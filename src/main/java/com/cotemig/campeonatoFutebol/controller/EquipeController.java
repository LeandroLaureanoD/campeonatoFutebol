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

import com.cotemig.campeonatoFutebol.model.Equipe;
import com.cotemig.campeonatoFutebol.model.Jogador;
import com.cotemig.campeonatoFutebol.service.EquipeService;
import com.cotemig.campeonatoFutebol.service.JogadorService;

/**
 * @author equipe devs
 *
 */
@RestController
public class EquipeController {

	@Autowired
	EquipeService equipeService;
	
	@RequestMapping(value = "/inserir/equipe", method = RequestMethod.GET)
	public ModelAndView inserirEquipe(){
		
		return new ModelAndView("insert-equipe","equipe",new Equipe());
	}
	
		
	@RequestMapping(value = "/inserir/equipe", method = RequestMethod.POST)
	 public String submitInsert(@Valid @ModelAttribute("equipe")Equipe equipe, 
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	        
	 equipeService.insertEquipe(equipe);
	        
	        return "redirect:";
	 }
	
		
	@RequestMapping(value = "/delete/equipe", method = RequestMethod.GET)
	 public ModelAndView delete(Integer id) {
	 
	 return new ModelAndView("delete", "equipe", equipeService.getEquipeById(id).get());
	 }
	 
	 @RequestMapping(value = "/delete/equipe", method = RequestMethod.POST)
	 public String submitDelete(@Valid @ModelAttribute("equipe")Equipe equipe,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 equipeService.deleteEquipeById(equipe.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/update/equipe", method = RequestMethod.GET)
	 public ModelAndView update(Integer id) {
	 
	        return new ModelAndView("update", "equipe", equipeService.getEquipeById(id).get());
	 }
	 
	 @RequestMapping(value = "/update/equipe", method = RequestMethod.POST)
	 public String submitUpdate(@Valid @ModelAttribute("equipe")Equipe equipe,
	      BindingResult result, ModelMap model) {
	        
	 if (result.hasErrors()) {
	            return "error";
	        }
	 
	 equipeService.updateEquipeById(equipe.getId());
	        
	        return "redirect:";
	 }
	 
	 @RequestMapping(value = "/read/equipe", method = RequestMethod.GET)
	 public ModelAndView read() {
	        
	        ModelAndView mav = new ModelAndView("read");
	        mav.addObject("equipe", equipeService.getAllEquipe());
	        return mav;
	 }
	 
	 @RequestMapping(value = "/equipe", method = RequestMethod.GET)
	 public ModelAndView index() {
	        
	        ModelAndView mav = new ModelAndView("index");
	        mav.addObject("equipe", equipeService.getAllEquipe());
	        return mav;
	 }
}
