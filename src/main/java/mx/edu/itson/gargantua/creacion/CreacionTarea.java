/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itson.gargantua.creacion;

import mx.edu.itson.gargantua.entidades.Tarea;

/**
 *
 * @author carlo
 */
public class CreacionTarea {
    public static Tarea crearTarea(String descripcion) {
        return new Tarea(descripcion);
    }
}
