/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.station.fletz;

import com.station.model.Fletero;
import com.station.repositories.FleteroRepository;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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
public class FleteroRepositoryTest {
    
    @Autowired
    private FleteroRepository fleteroRepository;
    
    public FleteroRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getOneFleteroByIdTest() {
         Fletero one = fleteroRepository.findOne("123sd8g");
         Iterable<Fletero> todos = fleteroRepository.findAll();
         assertNotNull(todos);
         System.out.println("Fleteros");
         System.out.println("Total: " + fleteroRepository.count());
         todos.iterator().forEachRemaining(System.out::println);
//         assertNotNull(one);
     }
}
