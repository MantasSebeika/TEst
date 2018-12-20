/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author manta
 */
public class SaskiuLentaTest {
    
    public SaskiuLentaTest() {
    }
    
    
   
    @Test
    public void testInformacija() {
        System.out.println("Informacija");
        SaskiuLenta instance = new SaskiuLenta();
      
        String expResult = "As Saskiu lenta";
        String result = instance.Informacija();
        System.out.println("Antras unit Unit testas");
         Assert.assertEquals(expResult, result);
    }
    
}
