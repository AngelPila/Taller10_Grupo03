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
import org.junit.jupiter.api.DisplayName;

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
    @DisplayName("Sumas con 2 caracteres por operando")
    public void testSolve() {
        System.out.println("Solve");
        String formula = "01+01+05*09/09";
        String expResult = "01+01+05*09/09=7";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    @DisplayName("Test de valores con una sola cifra")
    public void testSolve2() {
        System.out.println("Solve");
        String formula = "2+2+3+4";
        String expResult = "2+2+3+4=11";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    @DisplayName("Test de valores con dos cifras")
    public void testSolve3() {
        System.out.println("Solve");
        String formula = "12+12*12-12";
        String expResult = "12+12*12-12=144";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    @DisplayName("Test de valores nulos")
    public void testSolve4() {
        System.out.println("Solve");
        String formula = "12+12*12-0";
        String expResult = "12+12*12-0=156";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    @DisplayName("Test de valores nulos")
    public void testSolve5() {
        System.out.println("Solve");
        String formula = "12+12*0";
        String expResult = "12+12*0=12";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }
      @Test
    @DisplayName("Test de solo multiplicaciones")
    public void testSolve6() {
        System.out.println("Solve");
        String formula = "12*12*13";
        String expResult = "12*12*13=1872";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Test probando una division para 0")
    public void testSolve7() {
        System.out.println("Solve");
        String formula = "50+34/0*2";
        assertThrows(ArithmeticException.class, ()->{ Operations.Solve(formula);});
    }

    @Test
    @DisplayName("Test probando una expresion vacia")
    public void testSolve8() {
        System.out.println("Solve");
        String formula = " ";
        assertThrows(StringIndexOutOfBoundsException.class, ()->{ Operations.Solve(formula);});
    }

    @Test
    @DisplayName("Test de valores con tres cifras")
    public void testSolve9() {
        System.out.println("Solve");
        String formula = "100+130*122-123";
        String expResult = "100+130*122-123=15837";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
 @Test
    @DisplayName("Test de solo divisiones")
    public void testSolve10() {
        System.out.println("Solve");
        String formula = "500/20/4";
        String expResult = "500/20/4=6";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
    }
}
