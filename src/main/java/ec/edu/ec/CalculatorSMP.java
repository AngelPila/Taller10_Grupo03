package ec.edu.ec;


public class CalculatorSMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String question = Operations.MakeFormula();
        System.out.println(question);
        String ret = Operations.Solve("02+02+04");
        System.out.println(ret);
    }
    
}
