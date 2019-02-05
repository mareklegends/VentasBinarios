/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

/**
 *
 * @author alumno
 */
public class Ventas {
    private String cliente;
    private int producto;
    private int cantidad;
    private double precioUnitario;   

    public Ventas(String cliente, int producto, int cantidad, double precioUnitario) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
   
   
}
