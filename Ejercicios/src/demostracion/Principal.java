/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner;
/**
 *
 * @author reati
 */
public class Principal {
    
    public static void main(String[] args) {
    // documentacion
    
    
    Scanner entrada = new Scanner(System.in);
    
    // ingreso de vaiables
    float mensajes;
    float costos = 3;
    float val;
    float valor1;
    float valor2;
    float valor3;
    float mensajes1;
    
    // se pide a usuario el costo
    System.out.println("Ingrese la cantidad de mensajes");
    mensajes = entrada.nextInt();
        
    if (mensajes <= 40){
        val= (float) (costos + (costos * 0.12));
        System.out.printf("El costo menusual es: %.2f", val);
    }else{
        if(mensajes > 40 && mensajes <= 200){
                mensajes = (float) ((mensajes - 40)*0.05);
                valor2 = ((mensajes + costos));
                valor2 = (float) (valor2 + (valor2 * 0.12));
                System.out.printf("El costo mensaual es: %.2f", valor2);
                } else {
                    if (mensajes >200){
                    mensajes1 = (mensajes - 200);
                    valor2 = (float)(mensajes1 * 0.10);
                    valor3 = (float) ((mensajes - mensajes1 -40) * 0.05);
                    val = (float) (costos + valor2 + valor3);
                    val = (float) (val + (val * 0.12));
                    System.out.printf("El costo menusual es: %.2f", val);
                }
            }
        }
    }
}
                    
        
            
            
    
       
