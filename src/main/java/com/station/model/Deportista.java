/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GeneratorType;

/**
 *
 * @author gonzalo
 */
@Data
@Builder
@Entity(name = "Deportista") //Hibernate
@Table(name = "deportista")
public class Deportista implements Serializable{
    
    public final static Long ID = 2L;
    
    @Id
    @Column(name = "id_deportista")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDeportista;
    
    @Column(name = "nya", nullable = false)
    private String apelidoYNombre;
    
    @Column(name = "dni", nullable = false)
    private String dni;
    
    @Column(name = "num_tel", nullable = false)
    private String numTel;
}
