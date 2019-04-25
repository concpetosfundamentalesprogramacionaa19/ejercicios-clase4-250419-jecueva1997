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
public class Selecciondoble {
    
    public static void main(String[] args) {
        // documentacion 
        
        Scanner entrada = new Scanner(System.in);
        
        // metodo principal
        
        String miMensaje = Operacion.mensaje; 
        
        int calificacion = 85; 
       
        if (calificacion >=85){
            // System.out.printf("Usted esta aprobado con %d\n", calificacion);
            System.out.printf("Usted esta aprobado con %d\n", calificacion);
            
        // estructura condicional Para 
        } else {
            System.out.printf("Usted esta reprobado con %d\n", calificacion);
        }
        int calificacion_2 = 45 ;
        
        if (calificacion_2>=85) {
        System.out.printf("Usted esta aprobado con %d\n", calificacion_2);
        } else {    
            System.out.printf("Usted esta reprobado con %d\n", calificacion_2);
        }    
        
    }
    
}
