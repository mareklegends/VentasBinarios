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
            
            Scanner leer = new Scanner(System.in);
            while((opc<1) || (opc>4)){
               try{              
           
            System.out.println("-----Menu-----");
                   System.out.println("añadir ventas");
                   System.out.println("mostrar ventas de un cliente");
                   System.out.println("cantidad de clientes");
                   System.out.println("Clonar el archivo");
                   System.out.println("salir");
            System.out.println("--------------");
            
            
            
            opc=leer.nextInt();
            
             }catch(Exception e){
                 System.out.println("Opción valida, elija otra");
                 break;
             }  
            }
           
            return opc;
  }         
}
