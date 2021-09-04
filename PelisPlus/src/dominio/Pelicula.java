/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Ruldin
 */
public class Pelicula {
    private String nombre;
    
    public Pelicula(String nombre_peli){
        this.nombre=nombre_peli;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
