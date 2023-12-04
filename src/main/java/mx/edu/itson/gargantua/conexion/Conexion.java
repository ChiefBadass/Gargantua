/**
 * Clase Conexion - Implementación del patrón Singleton para gestionar conexiones y tareas.
 *
 * Esta clase representa una conexión única para gestionar tareas, aplicando el patrón Singleton.
 * Permite agregar, eliminar y obtener tareas, manteniendo una única instancia de la conexión en toda
 * la aplicación.
 *
 * @author carlo
 */
package mx.edu.itson.gargantua.conexion;

import java.util.ArrayList;
import java.util.List;
import mx.edu.itson.gargantua.entidades.Tarea;


public class Conexion {
    private static  Conexion instancia = null;
    private List<Tarea> tareas;

     /**
     * Constructor privado para garantizar que la instancia se cree solo una vez.
     */
    private Conexion() {
        tareas = new ArrayList<>();
    }

      /**
     * Método estático para obtener la única instancia de la clase Conexion.
     *
     * Si no existe una instancia previa, se crea una nueva. De lo contrario, se devuelve la instancia existente.
     *
     * @return Instancia única de la clase Conexion.
     */ 
    
    public static Conexion obtenerInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    /**
     * Agrega una tarea a la lista de tareas gestionadas por la conexión.
     *
     * @param tarea Tarea a ser agregada.
     */
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    /**
     * Elimina una tarea de la lista de tareas gestionadas por la conexión.
     *
     * @param tarea Tarea a ser eliminada.
     */
    public void eliminarTarea(Tarea tarea) {
        tareas.remove(tarea);
    }

     /**
     * Obtiene la lista de tareas gestionadas por la conexión.
     *
     * @return Lista de tareas.
     */
    public List<Tarea> obtenerTareas() {
        return tareas;
    }
}
