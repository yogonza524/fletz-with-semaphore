/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.model;

import java.io.Serializable;
import java.util.Random;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author gonzalo
 */
@Data
@Builder
@Entity(name = "Fletero")
@Table(name = "fletero")
public class Fletero implements Serializable{
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "dni")
    private String dni;
    
    @Column(name = "apellido_y_nombre")
    private String apellidoYNombre;
    
    @Column(name = "domicilio")
    private String domicilio;
    
    private String imagen;
    private String email;
    private String web;
    private String tel;
    private String movil;
    private String pais;
    private String localidad;
    private Integer reputacion;
    
    public void setRandomId() {
        this.id = new StringBuilder("fletero-").append(UUID.randomUUID().toString()).toString();
    }
    
}
