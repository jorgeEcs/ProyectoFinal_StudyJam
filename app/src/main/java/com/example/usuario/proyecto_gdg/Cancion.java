package com.example.usuario.proyecto_gdg;

import java.io.Serializable;

/**
 * Created by Usuario on 26/12/2016.
 */

public class Cancion implements Serializable {
    private String nombre;
    private String posicion;
    private int img;

    public Cancion() {
    }

    public Cancion(String nombre) {
        this.nombre = nombre;
    }

    public Cancion(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
