/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssplarragasa4;
import java.util.Scanner;
/**
 *
 * @author AALS
 */
public class SSPLarragaSA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Alfredo Alejandro Lárraga Sosa A01410278 LMc
        
        //Variables
        int opEntrada;
        Scanner kb= new Scanner (System.in);
        double a, resultado; // a=Angulo
        
        //Desplegar menú
        System.out.println("Calculadora de Tan, Sin y Cos");
        System.out.println("¿Qué vas a calcular?");
        System.out.println("1. Tangente");
        System.out.println("2. Seno");
        System.out.println("3. Coseno");
        System.out.println("4. Salir");
        opEntrada = kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Calculemos tu Tangente");
                a = mensajePedirDatos();
                resultado = Math.tan(a);
                System.out.println("Tu tangente es de "+ resultado);
                break;
            case 2:
                System.out.println("Calculemos tu Seno");
                a = mensajePedirDatos();
                resultado = Math.sin(a);
                System.out.println("Tu Seno es de "+ resultado);
                break;
            case 3:
                System.out.println("Calculemos tu Coseno");
                a= mensajePedirDatos();
                resultado = Math.cos(a);
                System.out.println("Tu Coseno es de" + resultado);
                break;
            default:
                System.out.println("¡Tú te lo pierdes!");  
            
                        
                        
                        
        }
                
    }           
    static double   mensajePedirDatos(){
        //Variables
        double a;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduzca un ángulo entre 0º y 360º");
        a= kb.nextDouble();
        return a;                             
    }
    
}
