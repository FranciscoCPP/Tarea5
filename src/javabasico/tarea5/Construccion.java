package javabasico.tarea5;

public class Construccion {

    private int cantidad_ventanas;
    private long precio;
    private double altura;
    private boolean patente;
    private String nombre;

    public void setCantidadVentanas(int valor){
        this.cantidad_ventanas = valor;
    }

    public void setPrecio(long valor){
        this.precio = valor;
    }

    public void setAltura(double valor){
        this.altura = valor;
    }

    public void setPatente(boolean valor){
        this.patente = valor;
    }

    public void setNombre(String valor){
        this.nombre = valor;
    }

    public int getCantidadVentanas(){
        return this.cantidad_ventanas;
    }

    public long getPrecio(){
        return this.precio;
    }

    public double getAltura(){
        return this.altura;
    }

    public boolean getPatente(){
        return this.patente;
    }

    public String getNombre(){
        return this.nombre;
    }


}
