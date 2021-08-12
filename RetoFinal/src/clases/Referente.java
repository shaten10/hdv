/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Howl
 */
public class Referente extends Persona {
    private int idReferente;
    private String nombre;

    public Referente(int idReferente, String nombre, int ciudad, String direccion, String telefono, String celular, String email) {
        super(ciudad, direccion, telefono, celular, email);
        this.idReferente = idReferente;
        this.nombre = nombre;
    }

    /**
     * @return the idReferente
     */
    public int getIdReferente() {
        return idReferente;
    }

    /**
     * @param idReferente the idReferente to set
     */
    public void setIdReferente(int idReferente) {
        this.idReferente = idReferente;
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
