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
public class potencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //Declarar e inicializar las variables
        
        int num, pot, j, resul;
        
        num = 0; pot = 0;  j = 1; resul = 1;
        
        //Ingresar los datos
        
        System.out.println("Ingresar la base de la potencia");
        num = leer.nextInt();
        
        System.out.println("Ingresar la potencia");
        pot = leer.nextInt();
        //Ciclo repetitivo
        while (j <= pot){
            resul = resul * num;
            j = j + 1;  
        }
        
        System.out.println("La potencia de: " +num + "elevado a " +pot + " es: " +resul);
        //presentar 
        
        
        
        
    }
    
}
