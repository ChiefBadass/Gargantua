/**
 * Clase CreacionTarea - Implementación del patrón Factory para la creación de instancias de Tarea.
 *
 * Esta clase proporciona un método estático para crear instancias de la clase Tarea.
 * Se aplica el patrón Factory para encapsular la lógica de creación de Tarea,
 * permitiendo crear tareas de manera más flexible y centralizada.
 *
 * 
 */
package mx.edu.itson.gargantua.creacion;

import mx.edu.itson.gargantua.entidades.Tarea;


public class CreacionTarea {
    /**
     * Crea y retorna una nueva instancia de la clase Tarea con la descripción proporcionada.
     *
     * @param descripcion Descripción de la tarea.
     * @return Nueva instancia de la clase Tarea.
     */
    public static Tarea crearTarea(String descripcion) {
        return new Tarea(descripcion);
    }
}
