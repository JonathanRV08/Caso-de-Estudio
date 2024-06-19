package com.mycompany.gestiondetareas;

public class NodoCola {
     private Tarea dato;
    private NodoCola atras;

    public NodoCola(Tarea dato) {
        this.dato = dato;
    }
    
    public Tarea getDato() {
        return dato;
    }
    public void setDato(Tarea dato) {
        this.dato = dato;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }
    
       public String imprimirDetalleNodo(){
        return this.dato.imprimirDetalleTarea();
    }
}
