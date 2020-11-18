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
public class CiRepetitivos {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int i,n, suma;
        i = 1; n = 0; suma = 0;
        
        System.out.println("Ingrese el limite de numeros a presentar ");
        n = leer.nextInt();
        //Iniciamos el ciclo repetitivo
        while (i <= n){
            System.out.println(i);
            suma = suma + i;
            i = i +1;
          }
        System.out.println("La suma de los números es : " +suma);
                
   
    }
    
}
