/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.TicketDAO;
import dao.UsuarioDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Usuario;

/**
 *
 * @author Enrique
 */
public class TestDAOs {
    
    public TestDAOs() {
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

     @Test
     public void hello() {
         TicketDAO tDao = new TicketDAO();
         UsuarioDAO uDao = new UsuarioDAO();
         
         tDao.save(uDao.getUsuarioByData("Enrique", "51541", "qwe@qweqw.com"), "Descripcioncilla", 1, 123);
     }
}
