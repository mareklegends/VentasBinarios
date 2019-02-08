/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

import java.util.Scanner;

/**
 *
 * @author MarekLegends
 */
public class Menu {
    public static int mostrarMenu(){
            int opc=7;
            
            
            while(opc<1 && opc<4){
               try{              
           
            System.out.println("-----Menu-----");
            System.out.println("1. Mostrar el valor de las facturas de un cliente.");
            System.out.println("2. Mostrar cantidad de clientes.");
            System.out.println("3. ");
            System.out.println("4. Salir");
            System.out.println("--------------");
            
            Scanner leer = new Scanner(System.in);
            
            opc=leer.nextInt();
            
             }catch(Exception e){
                 System.out.println("Opción valida, elija otra");
             }  
            }
           
            return opc;
  }         
}
