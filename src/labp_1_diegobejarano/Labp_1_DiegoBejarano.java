/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labp_1_diegobejarano;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Labp_1_DiegoBejarano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int respuesta = -1;
        Scanner read = new Scanner(System.in);
        
        while(respuesta != 0){
            System.out.println("Menu");
            System.out.println("Opcion 1. Mensaje");
            System.out.println("Opcion 2. Calculadora");
            System.out.println("Opcion 3. Edades");
            
            respuesta = read.nextInt();
            
            // Opcion 1. Mensaje
            if (respuesta == 1){
                System.out.println("El instructor carlos tiene aires a Quackity");
                
            } // Opcion 2. Calculadora
            else if(respuesta == 2){
                System.out.println("Ingrese numero uno: ");
                int n1 = read.nextInt();
                System.out.println("Ingrese numero dos: ");
                int n2 = read.nextInt();
                
                int resultado = n1 * n2;
                
                System.out.println("Resultado: "+resultado);
            } // Opcion 3. Calculadora de edades
            else if(respuesta == 3){
                System.out.println("Ingrese su edad: ");
                int edad = read.nextInt();
                
                if (edad >= 18){
                    System.out.println("Usted es mayor de edad");
                } 
                else{
                    System.out.println("Usted no es mayor de edad");
                }
            }
    
        }
        
    }
    
}
