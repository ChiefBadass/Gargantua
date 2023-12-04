/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itson.gargantua.conexion;

import java.util.ArrayList;
import java.util.List;
import mx.edu.itson.gargantua.entidades.Tarea;

/**
 *
 * @author carlo
 */
public class Conexion {
    private static  Conexion instancia = null;
    private List<Tarea> tareas;

    private Conexion() {
        tareas = new ArrayList<>();
    }

    public static Conexion obtenerInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(Tarea tarea) {
        tareas.remove(tarea);
    }

    public List<Tarea> obtenerTareas() {
        return tareas;
    }
}
