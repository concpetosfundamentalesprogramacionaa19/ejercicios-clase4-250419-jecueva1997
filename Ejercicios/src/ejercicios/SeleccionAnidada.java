/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquetedos.Operacion2;

/**
 *
 * @author reati
 */
public class SeleccionAnidada {
    
    
    public static void main(String[] args) {
    // documentacion
    Scanner entrada = new Scanner(System.in);
    String miMensaje1 = Operacion2.mensaje1;
    String miMensaje2 = Operacion2.mensaje2;
    String miMensaje3 = Operacion2.mensaje3;
    String miMensaje4 = Operacion2.mensaje4;
    
    
    int calificacion; 
        System.out.println("Ingrese la primera nota");
        calificacion = entrada.nextInt();
        
     if (calificacion >=90) {
       System.out.printf("%s %d\n", miMensaje1, calificacion);
       
    } else {
       if (calificacion <90 && calificacion >=80){
           System.out.printf("%s %d\n", miMensaje2, calificacion);
   
       } else {
           if (calificacion <80 && calificacion >=50){
               System.out.printf("%s %d\n", miMensaje3, calificacion);
               
           } else {
               System.out.printf("%s %d\n", miMensaje4, calificacion);
               
           }
               
               
         }
    
        
        
    
    
    
     }
     }
}