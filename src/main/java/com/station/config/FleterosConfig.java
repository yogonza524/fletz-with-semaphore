/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author gonzalo
 */
@Configuration
@ConfigurationProperties(prefix = "view.fleteros")
@Data
public class FleterosConfig {
    
    private int total;
    private boolean conImagenes;
    private boolean carousel;
    private boolean tituloNegrita;
}
