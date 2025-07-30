/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.ec;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    @DisplayName("Prueba de funcionamiento normal")
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String result = Operations.MakeFormula();

        assertTrue(result instanceof String);
    }

    @Test
    @DisplayName("Prueba de estructura adecuada")
    public void testMakeFormulaStructure(){
        String formula = Operations.MakeFormula();
        char last = formula.charAt(0);
        Boolean validacion = false;
        ArrayList<Character> operadores = new ArrayList<>();
        operadores.add('+');
        operadores.add('-');
        operadores.add('/');
        operadores.add('*');
        for(int i = 1; i < formula.length(); i++){
            char caracter = formula.charAt(i);
            if(operadores.contains(last) && operadores.contains(caracter)){
                validacion = true;
            }
            last = caracter;
        }
        assertTrue(validacion);
    }

    /**
     * Test of Solve method, of class Operations.
     */
    @Test
    public void testSolve() {
        System.out.println("Solve");
        String formula = "";
        String expResult = "";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
