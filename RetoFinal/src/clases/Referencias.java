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
public class Referencias {
    private int idReferencia;
    private int idEmpleado;
    private int idReferente;
    private int idTipoRferencia;

    public Referencias(int idReferencia, int idEmpleado, int idReferente, int idTipoRferencia) {
        this.idReferencia = idReferencia;
        this.idEmpleado = idEmpleado;
        this.idReferente = idReferente;
        this.idTipoRferencia = idTipoRferencia;
    }

    /**
     * @return the idReferencia
     */
    public int getIdReferencia() {
        return idReferencia;
    }

    /**
     * @param idReferencia the idReferencia to set
     */
    public void setIdReferencia(int idReferencia) {
        this.idReferencia = idReferencia;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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
     * @return the idTipoRferencia
     */
    public int getIdTipoRferencia() {
        return idTipoRferencia;
    }

    /**
     * @param idTipoRferencia the idTipoRferencia to set
     */
    public void setIdTipoRferencia(int idTipoRferencia) {
        this.idTipoRferencia = idTipoRferencia;
    }
    
    
    
}
