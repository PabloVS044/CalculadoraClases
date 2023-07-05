/*
Nombre: Pablo José Vásquez Santos
Codigo Técnico: IN5AM
Carné: 2018044
Fecha de Creación: 14/03/2022
Fechas de Modificaciones:
package org.pablovasquez.system;
*/
package org.pablovasquez.system;

import javax.swing.JOptionPane;
import org.pablovasquez.bean.Division;
import org.pablovasquez.bean.Multiplicacion;
import org.pablovasquez.bean.Resta;
import org.pablovasquez.bean.Salida;
import org.pablovasquez.bean.Suma;


public class Principal {

    public static void main(String[] args) {
        int menu;
        menu=Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion"
           +"\n 1) Suma "
           +"\n 2) Resta "
           +"\n 3) Multiplicación "
           +"\n 4) División "
           +"\n 5) Salida "));
        
        switch (menu){
            case 1:
                JOptionPane.showMessageDialog(null, "Programador: Pablo Vásquez");
                Suma suma = new Suma(0,0);
                suma.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
                suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La suma es: " + String.valueOf(suma.sumatoria(suma.getNum1(), suma.getNum2())));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Programador: Pablo Vásquez");
                Resta resta = new Resta(0,0);
                resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La resta es: " + String.valueOf(resta.restar(resta.getNum1(), resta.getNum2())));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Programador: Pablo Vásquez");
                Multiplicacion multiplicacion = new Multiplicacion(0,0);
                multiplicacion.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                multiplicacion.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + String.valueOf(multiplicacion.multiplicar(multiplicacion.getNum1(), multiplicacion.getNum2())));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Programador: Pablo Vásquez");
                Division division = new Division(0,0);
                division.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                division.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + String.valueOf(division.dividir(division.getNum1(), division.getNum2())));
                break;
            case 5:
                Salida salida = new Salida();
                salida.salir();
                break;
            default: JOptionPane.showMessageDialog(null, "No se eligió una opción valida");
        }
        
    }
    
}
