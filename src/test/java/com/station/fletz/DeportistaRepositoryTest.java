/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.fletz;

import com.station.model.Deportista;
import com.station.repositories.DeportistaRepository;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author gonzalo
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class DeportistaRepositoryTest {
    
    @Autowired
    private DeportistaRepository deportistaRepository;
    
    private Long idDeportista;
    private String apellidoYNombre;
    private String nombreGuillermo;
    
    public DeportistaRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.idDeportista = 1L;
        this.apellidoYNombre = "Mariano Ginobilli";
        this.nombreGuillermo = "Guillermo";
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     @Ignore
     public void getOneSportEntityTest() {
         Deportista one = this.deportistaRepository.findOne(idDeportista);
         assertNotNull(one);
         System.out.println("Deportista: " + one);
     }
     
     @Test
     @Ignore
     public void getOneSportEntityByNameAndLastNameTest() {
         List<Deportista> otro = this.deportistaRepository.findByApelidoYNombre(apellidoYNombre);
         assertNotNull(otro);
         otro.stream().forEach(deportista -> {
             System.out.println(deportista);
         });
     }
     
     @Test
     @Ignore
     public void getAllGuillermoTest() {
         List<Deportista> guillermos = this.deportistaRepository
                 .findLikeApellidoYNombre(nombreGuillermo);
         assertNotNull(guillermos);
         assertEquals(4, guillermos.size());
         guillermos.stream().forEach(deportista -> {
             System.out.println(deportista);
         });
     }
     
     @Test
     public void listAllDeportistaTest() {
         this.deportistaRepository.save(
            Deportista.builder().dni("65432100").apelidoYNombre("Gonza Mendoza").numTel("3624589632").build()
         );
         Iterable<Deportista> todos = this.deportistaRepository.findAll();
         todos.forEach(System.out::println);
     }
}
