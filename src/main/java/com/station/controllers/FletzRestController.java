/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.controllers;

import com.station.model.Fletero;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gonzalo
 */
@RestController
public class FletzRestController {
    
    @Autowired
    private List<Fletero> fletersoDummy;
    
    //JSON -> Javascript Object Notation
    @RequestMapping(value = "/dummyFleteros", method = RequestMethod.GET)
    public Map fletrosDummy() {
        Map<String, Object> result = new HashMap<>();
        
        //key : value
        
        result.put("timestamp", System.currentTimeMillis());
        result.put("status", fletersoDummy.size() > 0 ? 200 : 404);
        result.put("message", fletersoDummy.size() > 0 ? "Se encontraron datos" : "No hay fleteros en la lista");
        result.put("data", fletersoDummy);
        
        return result;
    }
    
    @RequestMapping(value = "/dummyFleteros/{nombreFletero}", method = RequestMethod.GET)
    public Map fleterosPorNombre(@PathVariable("nombreFletero") String nombre) {
        Map<String, Object> result = new HashMap<>();
        
        Fletero buscado = null;
        
        for (Fletero f : fletersoDummy) {
            if (f.getApellidoYNombre().equalsIgnoreCase(nombre)) {
                buscado = f;
                break;
            }
        }
        
        result.put("timestamp", System.currentTimeMillis());
        result.put("data", buscado != null ? buscado : "No lo encontre");
        result.put("status", buscado != null ? 200 : 404);
        
        return result;
    }
    
    @RequestMapping(value = "/emojis", method = RequestMethod.GET)
    public Map emojis() {
        Map<String, Object> result = new HashMap<>();
        
        return result;
    }
}
