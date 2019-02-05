package ioDatos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Archivo {

    private static String linea;

  
    public static void leerFichero(){
        
        File f = new File("ventas.dat");
        FileInputStream fi = null;
        DataInputStream salida = null;
       
        
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el archivo");
            }
        }
        
        try {
            fi = new FileInputStream(f);
            salida = new DataInputStream(fi);
          while(true){
            Ventas v = new Ventas(salida.readUTF(), salida.readInt(), salida.readInt(), salida.readDouble());
          }
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer el archivo");
        } catch (IOException ex) {
            System.out.println("Error de lectura de fichero");
        }finally{
            try {
                salida.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el programa");
            }
        }
 
    }
    
    
    
}
