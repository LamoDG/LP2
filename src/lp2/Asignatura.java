/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

/**
 *
 * @author pere
 */
public class Asignatura {

    private int identificacion;
    private int calendario;
    private int Capacidad;
    private String tipoClase;
    private String nombre;

    public Asignatura() {
        identificacion = 0;
        tipoClase = null;
        calendario = 0;
        Capacidad = 0;
        nombre = null;
    }

    public Asignatura(int ident, String nom, String tipoclass, int capacidad) {
        identificacion = ident;
        tipoClase = tipoclass;
        Capacidad = capacidad;
        nombre = nom;
        calendario = 0;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "identificacion=" + identificacion + ", calendario=" + calendario + ", Capacidad=" + Capacidad + ", tipoClase=" + tipoClase + ", nombre=" + nombre + '}';
    }


    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getCalendario() {
        return calendario;
    }
    
    public String getTipo() {
        return tipoClase;
    }

    public void setCalendario(int calendario) {
        this.calendario = calendario;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(String tipoClase) {
        this.tipoClase = tipoClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
