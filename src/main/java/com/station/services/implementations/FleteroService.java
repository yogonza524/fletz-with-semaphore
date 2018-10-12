/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.services.implementations;

import com.station.model.Fletero;
import com.station.repositories.FleteroRepository;
import com.station.services.interfaces.FleteroServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gonzalo
 */
@Service
public class FleteroService implements FleteroServiceInterface{

    @Autowired
    private FleteroRepository fleteroRepository;
    
    @Override
    public Fletero findOne(String id) {
        return this.fleteroRepository.findOne(id);
    }

    @Override
    public List<Fletero> findAll() {
//        return this.fleteroRepository.findAll();
        return null;
    }
    
}
