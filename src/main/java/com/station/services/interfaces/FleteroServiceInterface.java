/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.services.interfaces;

import com.station.model.Fletero;
import java.util.List;

/**
 *
 * @author gonzalo
 */
public interface FleteroServiceInterface {
    public Fletero findOne(String id);
    public List<Fletero> findAll();
    
}
