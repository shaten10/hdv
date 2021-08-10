package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String pass = "";
    private final String url = "jdbc:mysql://localhost:3306/hojas_de_vida";

    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getUrl() {
        return url;
    }
    
    

}
