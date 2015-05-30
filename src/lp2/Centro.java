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
public class Centro {
    int identificacion;
    enum estudios{
        master,cusoDeEspecializacion,taller,conferencia,mesaRedonda
    }
    Aula[] Aulas;
    Profesor[] profesores;
}
