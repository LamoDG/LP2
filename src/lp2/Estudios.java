/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

import java.util.Arrays;
import javax.print.DocFlavor;

/**
 *
 * @author pere
 */
public class Estudios {

    int identificacion;
    String nombre;
    String estudios;

    String cursoAcademico;
    String fechaComienzo;
    String fechaFinalizacion;
    int Horas;
    int dias;
    String turno;//turno mañana 8:00-15:00,tarde 15:00-22:00    
    String[] asignaturas;//los estudios de taller, conferencia y mesa redonda no contemplan asignaturas en sí
    int[] aulas;
    String[] profesores;
    //rango horario
    int calendario;//ja vorem com funciona
    String tipo;
    int maxEstudiantes;

    public Estudios() {
    }

    public Estudios(int identificacion, String nombre, String estudios,String fechaComienzo,
            String fechaFinalizacion, String turno, String[] asignaturas, int[] aulas,
            String[] profesores, String tipo, int maxEstudiantes) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.estudios = estudios;
        this.cursoAcademico = fechaComienzo.substring(6) + "-" + fechaFinalizacion.substring(6);
        this.fechaComienzo = fechaComienzo;
        this.fechaFinalizacion = fechaFinalizacion;
        this.Horas = Horas;//falta implemetar
        this.dias = dias;// falta implementar
        this.turno = turno;
        this.asignaturas = asignaturas;
        this.aulas = aulas;
        this.profesores = profesores;
        this.tipo = tipo;
        this.maxEstudiantes = maxEstudiantes;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCursoAcademico() {
        return cursoAcademico;
    }

    public void setCursoAcademico(String cursoAcademico) {
        this.cursoAcademico = cursoAcademico;
    }

    public String getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(String fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int[] getAulas() {
        return aulas;
    }

    public void setAulas(int[] aulas) {
        this.aulas = aulas;
    }

    public String[] getProfesores() {
        return profesores;
    }

    public void setProfesores(String[] profesores) {
        this.profesores = profesores;
    }

    public int getCalendario() {
        return calendario;
    }

    public void setCalendario(int calendario) {
        this.calendario = calendario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMaxEstudiantes() {
        return maxEstudiantes;
    }

    public void setMaxEstudiantes(int maxEstudiantes) {
        this.maxEstudiantes = maxEstudiantes;
    }

    @Override
    public String toString() {
        return "Estudios{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", estudios=" + estudios + ", cursoAcademico=" + cursoAcademico + ", fechaComienzo=" + fechaComienzo + ", fechaFinalizacion=" + fechaFinalizacion + ", Horas=" + Horas + ", dias=" + dias + ", turno=" + turno + ", asignaturas=" + Arrays.toString(asignaturas) + ", aulas=" + Arrays.toString(aulas) + ", profesores=" + Arrays.toString(profesores) + ", calendario=" + calendario + ", tipo=" + tipo + ", maxEstudiantes=" + maxEstudiantes + '}';
    }

}
