/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cirepetitivos;
import java.util.Scanner;
/**
 *
 * @author VICTOR
 */
public class VerificarNum {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int cont, n, num, sumpar, sumimpar, sumneg, sumpos;
        cont = 1; n = 1; sumpar = 0; sumimpar = 0; sumneg = 0; sumpos = 0;
        //Ingresar los datos de entrada: limite
        System.out.println("Ingrese el limite de números a verificar");
        n = leer.nextInt();
        
        //Crear el ciclo para verificar los números
        while (cont <= n){
            System.out.println("Ingrese el número a verificar");
            num = leer.nextInt();
            
            if (num % 2 == 0){
                sumpar = sumpar + num;
            }      
            else {
                sumimpar = sumimpar +num;
            }
            if (num > 0){
                sumpos = sumpos + num;
             
            }
            else {
                sumneg = sumneg +num;
                    
            }
            cont = cont +1;
            
            
        }
          System.out.println("La suma de los pares es: " +sumpar);
          System.out.println("La suma de los impares es: " +sumimpar);
          System.out.println("La suma de los postivos es: " +sumpos);
          System.out.println("La suma de los negativos es: " +sumneg);
          
 
   }

}

                
                
            
       
    
 


