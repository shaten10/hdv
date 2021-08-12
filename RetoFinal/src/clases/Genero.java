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
public class Genero {

    private int idGenero;
    private String genero;

    public Genero(int idGenero, String genero) {
        this.idGenero = idGenero;
        this.genero = genero;
    }

    /**
     * @return the idGenero
     */
    public int getIdGenero() {
        return idGenero;
    }

    /**
     * @param idGenero the idGenero to set
     */
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

}
