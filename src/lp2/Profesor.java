/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

import java.util.Arrays;

/**
 *
 * @author pere
 */
public class Profesor {
  String nombre;
  int nif;
  String telofono;
  Asignatura[] asignaturas;
  int calendario;

    public Profesor() {
    }

    public Profesor(String nombre, int nif, String telofono,Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.nif = nif;
        this.telofono = telofono;
        this.asignaturas = asignaturas;
        this.calendario = 0;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", nif=" + nif + ", telofono=" + telofono + ", asignaturas=" + Arrays.toString(asignaturas) + ", calendario=" + calendario + '}';
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getTelofono() {
        return telofono;
    }

    public void setTelofono(String telofono) {
        this.telofono = telofono;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getCalendario() {
        return calendario;
    }

    public void setCalendario(int calendario) {
        this.calendario = calendario;
    }
  
  
  
}
