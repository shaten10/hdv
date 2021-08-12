package Pruebas;

import clases.*;
import modelo.*;

public class main {      
    
    public static void main(String[] args) {
        /*ModeloCiudad mc = new ModeloCiudad();*/
        ModeloReferentes r = new ModeloReferentes();
        System.out.println(r.crear("Textual"));
        /*for (Genero c:g.listar()) {
           System.out.println(c.getGenero());
        }*/
    }
}

