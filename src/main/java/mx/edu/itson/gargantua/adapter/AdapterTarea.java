/**
 * Clase AdapterTarea - Clase adaptadora para mostrar las descripciones de las tareas.
 *
 * Esta clase proporciona un método estático para mostrar las descripciones de las tareas
 * contenidas en una lista dada. Funciona como un adaptador simple para facilitar la visualización
 * de información específica de las tareas en la consola.
 *
 * @author carlo
 */
package mx.edu.itson.gargantua.adapter;

import java.util.List;
import mx.edu.itson.gargantua.entidades.Tarea;

/**
     * Muestra las descripciones de las tareas en la consola.
     *
     * Este método toma una lista de objetos Tarea y muestra sus descripciones en la consola.
     * Cada descripción se imprime precedida por el texto "Tarea: ".
     *
     * @param tareas Lista de objetos Tarea cuyas descripciones se mostrarán.
     */
public class AdapterTarea {
    public static void mostrarTareas(List<Tarea> tareas) {
        for (Tarea tarea : tareas) {
            System.out.println("Tarea: " + tarea.getDescripcion());
        }
    }
}
