/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.Ciudad;
import clases.EstadoCivil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList; 

public class ModeloEstadoCivil {
    Conexion conexion;

    public ModeloEstadoCivil() {
        conexion = new Conexion();
    }
     public boolean crear(String nuevo) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "INSERT INTO estado_civil(estado) VALUES (?)";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, nuevo);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.out.println("Error al crear un estado civil : " + e.getMessage());
            return false;
        }
    }

    public boolean editar(int id, String nuevo) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "UPDATE estado_civil SET estado = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, nuevo);
            statement.setInt(2, id);
            int rowsUpdate = statement.executeUpdate();
            return rowsUpdate > 0;
        } catch (SQLException e) {
            System.out.println("Error en Modelo Editar estado civil : " + e.getMessage());
            return false;
        }
    }

  public boolean eliminar(int id) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "DELETE FROM estado_civil WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            int rowsDelete = statement.executeUpdate();
            return rowsDelete > 0;
        } catch (SQLException e) {
            System.out.println("Error en Modelo Eliminar estado civil : " + e.getMessage());
            return false;
        }
    }

      public String buscar(int id) {
        String tipo = "";
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "SELECT * FROM estado_civil WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                tipo = result.getString(2);
            }
            return tipo;
        } catch (SQLException e) {
            System.out.println("Error en Modelo buscar estado civil : " + e.getMessage());
            return tipo;
        }
    }

    public LinkedList<EstadoCivil> listar() {
        LinkedList<EstadoCivil> lista = new LinkedList<>();
        EstadoCivil estadoCivil = null;
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "SELECT * FROM estado_civil";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int idEstadoCivil = result.getInt(1);
                String nombre = result.getString(2);
                estadoCivil = new EstadoCivil(idEstadoCivil, nombre);
                lista.add(estadoCivil);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Error en Modelo estado civil: " + e.getMessage());
            return lista;
        }
    }
}
