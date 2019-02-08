/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasbinarios;

import ioDatos.Ventas;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MarekLegends
 */
public class VentasBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        /*
        Ventas v = new Ventas("Marcos", 23, 6, 4);
        vVentasNuevas.add(v);
        
        //ioDatos.Archivo.añadirVentas(vVentasNuevas);
        
        Ventas v2 = new Ventas("MaDos", 23, 6, 4);
        vVentasNuevas.add(v2);
        
         ioDatos.Archivo.añadirVentas(vVentasNuevas);
*/ 
        ArrayList<Ventas> vVentasNuevas = ioDatos.Archivo.leerFichero();
        int opc = 7;
       
       
        do{
            opc = ioDatos.Menu.mostrarMenu();
            switch(opc){
                case 1:
                    System.out.println("Añadir ventas");
                    
                    Ventas v = new Ventas("Marcos", 23, 6, 4);
                     vVentasNuevas.add(v);
                      ioDatos.Archivo.añadirVentas(vVentasNuevas);
                    break;
                    
                case 2:
                    System.out.println("Mostrar ventas de un cliente");
                     ArrayList<String> vcliente = new ArrayList();
                     Scanner leer = new Scanner(System.in);
                     String clientebuscar = "";
                     clientebuscar = leer.nextLine();
                                      
                     
                   
                     for (int i = 0; i < vVentasNuevas.size(); i++) {
                        if (vVentasNuevas.get(i).getCliente().equalsIgnoreCase(clientebuscar)) {
                            System.out.println(""+vVentasNuevas.get(i).getCliente()+""+vVentasNuevas.get(i).getProducto()+""+vVentasNuevas.get(i).getCantidad()+""+vVentasNuevas.get(i).getPrecioUnitario()+"");
                        }
                    }
                    
                    
                    
                    break;
                    
                case 3:
                    System.out.println("Ver todos los clientes");
                     ArrayList<String> vclientes = new ArrayList();
                    for (Ventas vmostrar : vVentasNuevas) {
                        if (!vclientes.contains(vmostrar.getCliente())) {
                            vclientes.add(vmostrar.getCliente());
                        }
                    }
                    System.out.println("Hay "+ vclientes.size()+"");
                    break;
                    
                case 4:
                    System.out.println("Clonando el fichero");
                    
                   ioDatos.Archivo.clonarArchivo(new File("ventas.dat"));
                   
                    
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    
                    break;
            }
            
        }while(opc!=5);
                
          
        
      
    }
    
}
