/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;

import paquetedos.Operacion;
/**
 *
 * @author reati
 */
public class SeleccionSimple {
    
    public static void main(String[] args) {
        // documentacion 
        
        Scanner entrada = new Scanner(System.in);
        
        // metodo principal
        
        String miMensaje = Operacion.mensaje; 
        
        int calificacion; 
        System.out.println("Ingrese la primera nota");
        calificacion = entrada.nextInt();
        
        if (calificacion >=85){
            // System.out.printf("Usted esta aprobado con %d\n", calificacion);
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }
        
        
        int calificacion_2 ;
        System.out.println("Ingrese la segunda nota");
        calificacion_2 = entrada.nextInt();
        
        if (calificacion_2>=85) {
        System.out.printf("%s %d\n", miMensaje, calificacion_2);
            
            
            
        }
    }
    
}
