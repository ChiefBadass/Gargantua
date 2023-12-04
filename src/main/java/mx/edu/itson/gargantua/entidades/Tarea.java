/**
 * Clase Tarea - Representa una tarea con una descripción.
 *
 * Esta clase encapsula la información de una tarea, con un atributo de descripción.
 * Proporciona un constructor para inicializar la descripción y un método para obtener la descripción.
 *
 * 
 */
package mx.edu.itson.gargantua.entidades;


public class Tarea {
    
    private String descripcion;

    /**
     * Constructor de la clase Tarea.
     *
     * @param descripcion Descripción de la tarea.
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Obtiene la descripción de la tarea.
     *
     * @return Descripción de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }
}
