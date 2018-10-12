package com.station.fletz;

import com.station.model.Fletero;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FletzApplicationTests {

    @Autowired
    private List<Fletero> fletersoDummy;
    
    @Test
    public void contextLoads() {
    }
    
    @Test
    public void probarListaDeFleterosDummyTest() {
        assertNotNull(fletersoDummy);
        
        fletersoDummy.stream().forEach(System.out::println);
    }

}
