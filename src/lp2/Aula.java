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
public class Aula {

    int identificacion;

    String tipo;
    int calendario;//s'ha de mirar que vol realment
    int capacidad;

    public Aula() {
        this.identificacion = 0;
        this.calendario = 0;
        this.capacidad = 0;
    }

    public Aula(int identificacion, String tipo, int capacidad) {
        this.identificacion = identificacion;
        this.capacidad = capacidad;
        this.tipo=tipo;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getCalendario() {
        return calendario;
    }

    public void setCalendario(int calendario) {
        this.calendario = calendario;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Aula{" + "identificacion=" + identificacion + ", tipo=" + tipo + ", calendario=" + calendario + ", capacidad=" + capacidad + '}';
    }
    

}
