
package org.pablovasquez.bean;

public class Multiplicacion {
    
    //atributos
    private double num1;
    private double num2;
    
    
    //constructor nulo
    public Multiplicacion(){
        
    }
    
    
    //Constructor con argumentos
    public Multiplicacion(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //Metodos de acceso

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double multiplicar(double num1, double num2){
        double result = num1 * num2;
        return result;
    }
    
}
