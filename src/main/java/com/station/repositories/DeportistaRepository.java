/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.repositories;

import com.station.model.Deportista;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gonzalo
 */
@Repository
public interface DeportistaRepository extends CrudRepository<Deportista,Long>{
    
    public List<Deportista> findByApelidoYNombre(String apellidoYNombre);
    
    @Query(value = "SELECT d FROM Deportista d WHERE d.apelidoYNombre LIKE %:apyn%")
    public List<Deportista> findLikeApellidoYNombre(@Param("apyn") String apellidoYNombre);
}
