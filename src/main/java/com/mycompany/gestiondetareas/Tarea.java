package com.mycompany.gestiondetareas;

public class Tarea {
    
   private int id;
   private String descripcion;
   private String prioridad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Tarea(int id, String descripcion, String prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
   public String imprimirDetalleTarea(){
        return "Tarea # " + this.id + " - " + "Descripción" + this.descripcion + " - " + " Prioridad " + this.prioridad;
    }
}
