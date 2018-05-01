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
public class nodo {
    private nodo siguiente;
    private FacturaTicket dato;

    public nodo(nodo siguiente, FacturaTicket dato) {
        this.siguiente = siguiente;
        this.dato = dato;
    }
    

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    public FacturaTicket getDato() {
        return dato;
    }

    public void setDato(FacturaTicket dato) {
        this.dato = dato;
    }
    
}
