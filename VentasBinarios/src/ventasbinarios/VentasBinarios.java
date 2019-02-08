/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasbinarios;

import ioDatos.Ventas;

/**
 *
 * @author MarekLegends
 */
public class VentasBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ioDatos.Archivo.leerFichero();
        
        Ventas v = new Ventas("Marcos", 23, 6, 4);
        
        ioDatos.Archivo.añadirVentas(v);
        
          ioDatos.Archivo.leerFichero();
    }
    
}
