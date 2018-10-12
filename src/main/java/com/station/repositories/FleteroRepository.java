/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.repositories;

import com.station.model.Fletero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gonzalo
 */
@Repository
public interface FleteroRepository extends CrudRepository<Fletero, String>{
    
}
