/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu_cine;

/**
 *
 * @author jesusl
 */
public class FacturaTicket {
    private String nombre, pelicula, fecha_funcion, ubicacion;
    private int valor, nfactura;

    public FacturaTicket(String nombre, String pelicula, String fecha_funcion, String ubicacion, int valor, int nfactura) {
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.fecha_funcion = fecha_funcion;
        this.ubicacion = ubicacion;
        this.valor = valor;
        this.nfactura = nfactura;
    }

    public String toString(){
        return "Nombre: "+nombre
                + "\nPelicula: "+pelicula
                + "\nFecha: "+ fecha_funcion
                + "\nUbicacion: "+ubicacion
                + "\nValor: $"+valor
                + "\nNumero de de Ticket: "+nfactura+"\n";
    }


    
    
    
}
