/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eq2grau;

/**
 *
 * @author alunocmc
 */
public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    
    public EquacaoSegundoGrau(double a,double b,double c){
        // this cria atributos 
    this.a = a;
    this.b = b;
    this.c = c;
}

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
    
    public double Calculardelta (){
        double delta;
        delta = b*b -4 *a *c;
        
        return delta;
    }
    
    public void CalcularX1(){
        x1 = (-b + Math.sqrt(Calculardelta()))/ (2*a);
    }
    
    public void CalcularX2(){
        x2 = (-b - Math.sqrt(Calculardelta()))/ (2*a);
    }
    
    public void imprimir(){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}
