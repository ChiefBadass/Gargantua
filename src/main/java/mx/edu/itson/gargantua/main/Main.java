/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itson.gargantua.main;

import java.util.List;
import mx.edu.itson.gargantua.adapter.AdapterTarea;
import mx.edu.itson.gargantua.conexion.Conexion;
import mx.edu.itson.gargantua.creacion.CreacionTarea;
import mx.edu.itson.gargantua.entidades.Tarea;

/**
 *
 * @author carlo
 */
public class Main {
    
    public static void main(String[] args) {
        Conexion listaTareas = Conexion.obtenerInstancia();

        // Utilizando el Factory para crear tareas
        listaTareas.agregarTarea(CreacionTarea.crearTarea("Hacer la compra"));
        listaTareas.agregarTarea(CreacionTarea.crearTarea("Estudiar para el examen"));

        // Utilizando el Adapter para mostrar las tareas
        AdapterTarea.mostrarTareas(listaTareas.obtenerTareas());

        // Eliminar una tarea de la lista
        List<Tarea> tareas = listaTareas.obtenerTareas();
        if (!tareas.isEmpty()) {
            listaTareas.eliminarTarea(tareas.get(0));
        }

        // Mostrar las tareas restantes en la lista
        AdapterTarea.mostrarTareas(listaTareas.obtenerTareas());
    }
    
}
