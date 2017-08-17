/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialfibonacci;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class FactorialFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("1.Factorial");
        System.out.println("2.Fibonacci");
        
        int Numero = 0;
        Numero = Leer.nextInt();
        
        if(Numero == 1){
             Calculos ObjetoFactorial = new Calculos();
            ObjetoFactorial.setVisible(true);
        }
        else if(Numero == 2)
        {
            Fibonacci ObjetoFactorial = new Fibonacci();
            ObjetoFactorial.setVisible(true);
        }
        
       
    }
    
}
