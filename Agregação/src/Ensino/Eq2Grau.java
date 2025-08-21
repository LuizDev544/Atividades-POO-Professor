/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eq2grau;
import java.util.Scanner;
/**
 *
 * @author alunocmc
 */
public class Eq2Grau {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| Equecaco do Segundo Grau ||");
        System.out.println("Digite o Numero para (a)");
        double a = sc.nextDouble(); 
        
        System.out.println("Digite o Numero para (b)");
        double b = sc.nextDouble(); 
        
        System.out.println("Digite o Numero para (c)");
        double c = sc.nextDouble(); 
        
        sc.close();
        
        EquacaoSegundoGrau eq1 = new EquacaoSegundoGrau(a,b,c);
        
        eq1.setA(a);
        eq1.setB(b);
        eq1.setC(c);
        if (eq1.Calculardelta()>= 0){
            eq1.CalcularX1();
            eq1.CalcularX2();
            eq1.imprimir();
        }else{
            System.out.println("Raizes nao reais");
        }
 
    }
    
}
