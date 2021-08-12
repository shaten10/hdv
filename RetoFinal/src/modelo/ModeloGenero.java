/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.Ciudad;
import clases.Genero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class ModeloGenero {
    Conexion conexion;

    public ModeloGenero() {
        conexion = new Conexion();
    }
    public boolean crear(String nuevo) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "INSERT INTO genero(genero) VALUES (?)";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, nuevo);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.out.println("Error al crear un genero : " + e.getMessage());
            return false;
        }
    }

   public boolean editar(int id, String nuevo) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "UPDATE genero SET genero = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, nuevo);
            statement.setInt(2, id);
            int rowsUpdate = statement.executeUpdate();
            return rowsUpdate > 0;
        } catch (SQLException e) {
            System.out.println("Error en Modelo Editar genero : " + e.getMessage());
            return false;
        }
    }

  public boolean eliminar(int id) {
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "DELETE FROM genero WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            int rowsDelete = statement.executeUpdate();
            return rowsDelete > 0;
        } catch (SQLException e) {
            System.out.println("Error en Modelo Eliminar genero : " + e.getMessage());
            return false;
        }
    }

      public String buscar(int id) {
        String tipo = "";
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "SELECT * FROM genero WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                tipo = result.getString(2);
            }
            return tipo;
        } catch (SQLException e) {
            System.out.println("Error en Modelo buscar genero : " + e.getMessage());
            return tipo;
        }
    }

    public LinkedList<Genero> listar() {
        LinkedList<Genero> lista = new LinkedList<>();
        Genero genero = null;
        try (Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPass())) {
            String query = "SELECT * FROM genero";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int idGenero = result.getInt(1);
                String nombre = result.getString(2);
                genero = new Genero(idGenero, nombre);
                lista.add(genero);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Error en Modelo genero : " + e.getMessage());
            return lista;
        }
    }
    
}
