/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itson.gargantua.adapter;

import java.util.List;
import mx.edu.itson.gargantua.entidades.Tarea;

/**
 *
 * @author carlo
 */
public class AdapterTarea {
    public static void mostrarTareas(List<Tarea> tareas) {
        for (Tarea tarea : tareas) {
            System.out.println("Tarea: " + tarea.getDescripcion());
        }
    }
}
