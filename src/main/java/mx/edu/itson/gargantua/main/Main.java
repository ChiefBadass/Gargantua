/**
 * Clase Main - Punto de entrada principal de la aplicación Gargantua.
 *
 * En este punto de entrada, se realiza una serie de operaciones utilizando las clases y patrones definidos:
 * - Se obtiene una instancia única de la clase Conexion, aplicando el patrón Singleton.
 * - Se utiliza el patrón Factory en la clase CreacionTarea para crear instancias de la clase Tarea y agregarlas a la lista de tareas.
 * - Se utiliza el patrón Adapter en la clase AdapterTarea para mostrar las descripciones de las tareas almacenadas en la lista.
 * - Se elimina una tarea de la lista para demostrar la manipulación de la lista de tareas.
 * - Se vuelve a utilizar el Adapter para mostrar las tareas restantes en la lista.
 *
 * La aplicación ilustra el uso coordinado de las clases y patrones mencionados para la gestión de tareas.
 *
 * 
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
         // Obtener una instancia única de la clase Conexion utilizando el patrón Singleton
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
