package com.mycompany.gestiondetareas;

public class NodoPila {
    private Tarea dato;
    private NodoPila siguiente;

    public Tarea getDato() {
        return dato;
    }

    public void setDato(Tarea dato) {
        this.dato = dato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    public NodoPila(){
        this.siguiente = null;
    }
    public String imprimirContenido(){
        return this.dato.imprimirDetalleTarea();
    }
}
