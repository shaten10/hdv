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
public class Empresa {
    private String nit;
    private String nombre;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String email;
    private String sitioWeb;
    private String desarrollador;
    private String emailDev;

    public Empresa() {
        this.nit = "11223546-2";
        this.nombre = "Desarrollos A&A";
        this.telefono = "12345678";
        this.direccion = "cra87d #56f - 16";
        this.email = "Alejandra@gmai.com";
        this.ciudad = "Bogota";  
        this.desarrollador = "Andres Ayala";
        this.emailDev = "alquius@gmail.com";
        this.sitioWeb = "www.desarrollos.gov.co";
    
        
        
    }
    
    
 

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the sitioWeb
     */
    public String getSitioWeb() {
        return sitioWeb;
    }

    /**
     * @return the desarrollador
     */
    public String getDesarrollador() {
        return desarrollador;
    }

    /**
     * @return the emailDev
     */
    public String getEmailDev() {
        return emailDev;
    }
    
    
    
}
  
