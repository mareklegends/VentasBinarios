package ioDatos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageInputStream;



/**
 *
 * @author MarekLegends
 */
public class Archivo {

    private static String linea;

  //Inicializar - leer el fichero
    public static ArrayList<Ventas> leerFichero(){
        
        File f = new File("ventas.dat");
        FileInputStream fi = null;
        DataInputStream salida = null;
        ArrayList<Ventas> vVentas = new ArrayList();
       
        
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
            vVentas.add(v);
          }
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer el archivo");
        } catch (IOException ex) {
            System.out.println("");
            //System.out.println("Fin de lectura");
        }finally{
            try {
                salida.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el programa");
            }
        }
        return vVentas;
 
    }
    //escribir en el fichero
    
    public static void añadirVentas(ArrayList<Ventas> vVentas) {
        File f = new File("ventas.dat");
        FileOutputStream fi = null;
        DataOutputStream entrada = null;

        
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el archivo");
            }
        }
        
        if (f.exists()) {
            try {
                fi = new FileOutputStream(f);
                entrada = new DataOutputStream(fi);
              
                    for (int i = 0; i < vVentas.size(); i++) {
                        entrada.writeUTF(vVentas.get(i).getCliente());
                        entrada.writeInt(vVentas.get(i).getProducto());
                        entrada.writeInt(vVentas.get(i).getCantidad());
                        entrada.writeDouble(vVentas.get(i).getPrecioUnitario());
                    }
              
                
            } catch (FileNotFoundException ex) {
                System.out.println("Error al escribir en el archivo");
            } catch (IOException ex) {
                System.out.println("Error al añadir los datos");
            }finally{
                try{
                    entrada.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
              
            
        }
    }
    
    
    public static void clonarArchivo(File fclone){
ArrayList<Ventas> vVentas2 = new ArrayList<>();
    File f=new File("datosCopia.dat");
    FileInputStream fi=null;
    DataInputStream leer=null;
    FileOutputStream fo=null;
    DataOutputStream escribir=null;
    //comprobamos si existe el archivo
    if(!f.exists()){
          try {
              f.createNewFile();
          } catch (IOException ex) {
              System.out.println("Fallo al comprobar el archivo");
          }
    }
    
      try {
          fi = new FileInputStream(fclone);
          leer = new DataInputStream(fi);
          fo = new FileOutputStream(f);
          escribir = new DataOutputStream(fo);
          
          while (true){
              escribir.writeUTF(leer.readUTF());
              escribir.writeInt(leer.readInt());
              escribir.writeInt(leer.readInt());
              escribir.writeDouble(leer.readDouble());
              
          }
      } catch (FileNotFoundException ex) {
          System.out.println("Fichero no encontrado");;
      } catch (IOException ex) {
          System.out.println("Fin de copiado");;
      }
    
    
  

}    
    
}
