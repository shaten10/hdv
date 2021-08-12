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
public class TipoReferencia {
    
    private int idTipoReferencia;
    private String tipo;

    public TipoReferencia(int idTipoReferencia, String tipo) {
        this.idTipoReferencia = idTipoReferencia;
        this.tipo = tipo;
    }

    /**
     * @return the idTipoReferencia
     */
    public int getIdTipoReferencia() {
        return idTipoReferencia;
    }

    /**
     * @param idTipoReferencia the idTipoReferencia to set
     */
    public void setIdTipoReferencia(int idTipoReferencia) {
        this.idTipoReferencia = idTipoReferencia;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
