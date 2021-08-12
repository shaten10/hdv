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
public class EstadoCivil {
    private int idEstadoCivil;
    private String estado;

    public EstadoCivil(int idEstadoCivil, String estado) {
        this.idEstadoCivil = idEstadoCivil;
        this.estado = estado;
    }

    /**
     * @return the idEstadoCivil
     */
    public int getIdEstadoCivil() {
        return idEstadoCivil;
    }

    /**
     * @param idEstadoCivil the idEstadoCivil to set
     */
    public void setIdEstadoCivil(int idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
