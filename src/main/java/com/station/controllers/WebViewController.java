/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.controllers;

import com.station.model.Fletero;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gonzalo
 */
@Controller
public class WebViewController {
    
    @Autowired
    private List<Fletero> fletersoDummy;
    
    @RequestMapping(value = "/fleteros", method = RequestMethod.GET)
    public String fleteros(Model model) {
        
        model.addAttribute("fleteros", fletersoDummy);
        
        return "fleteros";
    }
    
    @RequestMapping(value = "/contacto", method = RequestMethod.GET)
    public String contacto(Model model) {
        
        return "contacto";
    }
    
    @RequestMapping(value = "/registrarme", method = RequestMethod.GET)
    public String registrarme(Model model) {
        
        return "registrarme";
    }
    
    @RequestMapping(value = "/acceder", method = RequestMethod.GET)
    public String acceder(Model model) {
        
        return "acceder";
    }
    
    @RequestMapping(value = "/header", method = RequestMethod.GET)
    public String header(Model model) {
        
        return "components/acceder";
    }
    
    @RequestMapping(value = "/ficha", method = RequestMethod.GET)
    public String ficha(Model model, @RequestParam("id") String idFletero) {
        
        //1. Tengo el id del fletero y una lista de fleteros
        for (Fletero fletero : this.fletersoDummy) {
            //Verifico
            if (fletero.getId().equals(idFletero)) {
                model.addAttribute("fletero", fletero);
                break;
            }
        }
        
        return "ficha";
    }
}
