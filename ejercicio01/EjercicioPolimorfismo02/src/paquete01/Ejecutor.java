/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
         AutomovilGasolina aut1 = new AutomovilGasolina(20,3,"Pedro Paladinez",
                 "213123123");       
         AutomovilDiesel aut2 = new AutomovilDiesel(10,20,2,"Pablo Paladinez",
                 "21341241"); 
         System.out.println(aut1);
         System.out.println(aut2);
    }
}
