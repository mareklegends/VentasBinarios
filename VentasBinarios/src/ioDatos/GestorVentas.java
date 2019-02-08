/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

import java.util.ArrayList;

/**
 *
 * @author MarekLegends
 */
public class GestorVentas {
    private ArrayList<Ventas> vVentas;

    public GestorVentas() {
        vVentas = Archivo.leerFichero();
    }

 
    
    
}
