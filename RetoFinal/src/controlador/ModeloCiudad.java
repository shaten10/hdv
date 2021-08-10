package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModeloCiudad {
    Conexion conexion;

    public ModeloCiudad() {
        conexion = new Conexion();
    }
    
    public boolean crear(String nuevo){
        try(Connection conn= DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPass())){
            String query ="INSERT INTO ciudades(ciudad) VALUES (?)";
            PreparedStatement statement = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, nuevo);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted>0){
                return true;
            }
            return false;            
        }catch(SQLException e){
            System.out.println("Error al crear una ciudad: "+ e.getMessage()); 
            return false;
        }
    }
    
    public boolean editar(int id, String nuevo){
        try(Connection conn = DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPass())){
            String query = "UPDATE ciudades SET ciudad = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1,nuevo);
            statement.setInt(2,id);
            int rowsUpdate = statement.executeUpdate();
            return rowsUpdate > 0;          
        }catch(SQLException e){
            System.out.println("Error en Modelo Editar Ciudad: " + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminar(int id){
        try(Connection conn = DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPass())){
            String query = "DELETE FROM ciudades WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1,id);
            int rowsDelete = statement.executeUpdate();
            return rowsDelete > 0;          
        }catch(SQLException e){
            System.out.println("Error en Modelo Eliminar Ciudad: " + e.getMessage());
            return false;
        }
    }
    
    public String buscar(int id){
        String ciudad = "";
        try(Connection conn = DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPass())){
            String query = "SELECT * FROM ciudades WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                ciudad = result.getString(2);
            }
            return ciudad;
        }catch(SQLException e){
            System.out.println("Error en Modelo Editar Ciudad: " + e.getMessage());
            return ciudad;
        }
    }   
    

}
