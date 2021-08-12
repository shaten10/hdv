/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.Ciudad;
import clases.TipoDocumento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class ModeloTipoDocumento {
    Conexion conexion;

    public ModeloTipoDocumento() {
        conexion = new Conexion();
    }
   public boolean crear(String nuevo) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "INSERT INTO tipo_documento(tipo) VALUES (?)";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, nuevo);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.out.println("Error al crear un tipo de Documento : " + e.getMessage());
            return false;
        }
    }

    public boolean editar(int id, String nuevo) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "UPDATE tipo_documento SET tipo = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, nuevo);
            statement.setInt(2, id);
            int rowsUpdate = statement.executeUpdate();
            return rowsUpdate > 0;
        } catch (SQLException e) {
            System.out.println("Error en Modelo Editar tipo de documento : " + e.getMessage());
            return false;
        }
    }

   public boolean eliminar(int id) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "DELETE FROM tipo_documento WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            int rowsDelete = statement.executeUpdate();
            return rowsDelete > 0;
        } catch (SQLException e) {
            System.out.println("Error en Modelo Eliminar tipo de documento : " + e.getMessage());
            return false;
        }
    }

     public String buscar(int id) {
        String tipo = "";
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "SELECT * FROM tipo_documento WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                tipo = result.getString(2);
            }
            return tipo;
        } catch (SQLException e) {
            System.out.println("Error en Modelo buscar tipo de documento : " + e.getMessage());
            return tipo;
        }
    }

    public LinkedList<TipoDocumento> listar() {
        LinkedList<TipoDocumento> lista = new LinkedList<>();
        TipoDocumento tipoDocumento = null;
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "SELECT * FROM tipo_documento";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int idTipoDocumento = result.getInt(1);
                String nombre = result.getString(2);
                tipoDocumento = new TipoDocumento(idTipoDocumento, nombre);
                lista.add(tipoDocumento);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Error en Modelo tipo documento: " + e.getMessage());
            return lista;
        }
    }   
}


