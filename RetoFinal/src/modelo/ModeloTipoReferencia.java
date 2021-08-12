/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.Ciudad;
import clases.TipoReferencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;


public class ModeloTipoReferencia {
    Conexion conexion;

    public ModeloTipoReferencia() {
        conexion = new Conexion();
        
    }
    public boolean crear(String nuevo) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "INSERT INTO tipo_referencia(tipo) VALUES (?)";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, nuevo);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.out.println("Error al crear un tipo de refereancia : " + e.getMessage());
            return false;
        }
    }

    public boolean editar(int id, String nuevo) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "UPDATE tipo_referencia SET tipo = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, nuevo);
            statement.setInt(2, id);
            int rowsUpdate = statement.executeUpdate();
            return rowsUpdate > 0;
        } catch (SQLException e) {
            System.out.println("Error en Modelo Editar tipo de refereancia: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int id) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "DELETE FROM tipo_referencia WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            int rowsDelete = statement.executeUpdate();
            return rowsDelete > 0;
        } catch (SQLException e) {
            System.out.println("Error en Modelo Eliminar tipo de referencia : " + e.getMessage());
            return false;
        }
    }

    public String buscar(int id) {
        String tipo = "";
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "SELECT * FROM tipo_referencia WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                tipo = result.getString(2);
            }
            return tipo;
        } catch (SQLException e) {
            System.out.println("Error en Modelo Editar tipo de referencia : " + e.getMessage());
            return tipo;
        }
    }

    public LinkedList<TipoReferencia> listar() {
        LinkedList<TipoReferencia> lista = new LinkedList<>();
        TipoReferencia tipoReferencia = null;
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "SELECT * FROM tipo_referencia";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int idTipoReferencia = result.getInt(1);
                String nombre = result.getString(2);
                tipoReferencia = new TipoReferencia(idTipoReferencia, nombre);
                lista.add(tipoReferencia);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Error en Modelo tipo referencia: " + e.getMessage());
            return lista;
        }
    }
}
