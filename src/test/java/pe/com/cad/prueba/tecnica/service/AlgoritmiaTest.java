/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.cad.prueba.tecnica.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class AlgoritmiaTest {
    
    public AlgoritmiaTest() {
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

    /**
     * Test of arregloNumeros method, of class Algoritmia.
     */
    @Test
    public void testArregloNumeros1() {
        System.out.println("arregloNumeros");
        //arrange
        int[] entrada = {2, 1, 4, 5};
        Algoritmia instance = new Algoritmia();
        int[] expResult = {1, 2, 3, 4, 5};
        //act
        int[] result = instance.arregloNumeros(entrada);
        //asert
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of arregloNumeros method, of class Algoritmia.
     */
    @Test
    public void testArregloNumeros2() {
        System.out.println("arregloNumeros");
        //arrange
        int[] entrada = {4, 2, 9};
        Algoritmia instance = new Algoritmia();
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //act
        int[] result = instance.arregloNumeros(entrada);
        //assert
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of arregloNumeros method, of class Algoritmia.
     */
    @Test
    public void testArregloNumeros3() {
        System.out.println("arregloNumeros");
        //arrange
        int[] entrada = {6, 10, 4};
        Algoritmia instance = new Algoritmia();
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //act
        int[] result = instance.arregloNumeros(entrada);
        //assert
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of cadenaProactiva method, of class Algoritmia.
     */
    @Test
    public void testCadenaProactiva1() {
        System.out.println("cadenaProactiva");
        //arrange
        String cadena = "123 abcd*3";
        Algoritmia instance = new Algoritmia();
        String expResult = "123 bcde*3";
        //act
        String result = instance.cadenaProactiva(cadena);
        //assert
        assertEquals(expResult, result);
    }
    /**
     * Test of cadenaProactiva method, of class Algoritmia.
     */
    @Test
    public void testCadenaProactiva2() {
        System.out.println("cadenaProactiva");
        //arrange
        String cadena = "**Casa 52";
        Algoritmia instance = new Algoritmia();
        String expResult = "**Dbtb 52";
        //act
        String result = instance.cadenaProactiva(cadena);
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of dinero method, of class Algoritmia.
     */
    /*@Test
    public void testDinero() {
        System.out.println("dinero");
        double monto = 0.0;
        Algoritmia instance = new Algoritmia();
        double[][] expResult = null;
        double[][] result = instance.dinero(monto);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
