package sari_backend.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion_base_datos {
    String url = "jdbc:mysql://localhost:3306/";
    String baseDatos = "sari";
    String usuario = "root";
    String clave = "2611";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection conexion = null;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public conexion_base_datos () {
    }
    
    public Connection conectar (){
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url + baseDatos, usuario, clave);
            System.out.println("*****Conexión exitosa a " + baseDatos + "*****");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("**Error de conexión a base de datos " + baseDatos + "**");
            Logger.getLogger(conexion_base_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    
    public ResultSet leerBD (String comando, String columna){
        try {
            preparedStatement = conexion.prepareStatement(comando);
            resultSet = preparedStatement.executeQuery();
            System.out.println("Lectura correcta");
            while (resultSet.next()){
                String list = resultSet.getString(columna);
                System.out.println(list);
            }
        } catch (SQLException ex) {
            System.out.println("Lectura incorrecta");
            Logger.getLogger(conexion_base_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }
    
    public void crearBD (String comando){
        try {
            preparedStatement = conexion.prepareStatement(comando);
            preparedStatement.executeUpdate();
            System.out.println("Creacion correcta");
        } catch (SQLException ex) {
            System.out.println("Creacion incorrecta");
            Logger.getLogger(conexion_base_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void actualizarBD (String comando){
        try {
            preparedStatement = conexion.prepareStatement(comando);
            preparedStatement.executeUpdate();;
            System.out.println("Actualizacion correcta");
        } catch (SQLException ex) {
            System.out.println("Actualizacion incorrecta");
            Logger.getLogger(conexion_base_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarBD (String comando){
        try {
            preparedStatement = conexion.prepareStatement(comando);
            preparedStatement.executeUpdate();
            System.out.println("Eliminacion correcta");
        } catch (SQLException ex) {
            System.out.println("Eliminacion incorrecta");
            Logger.getLogger(conexion_base_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconectar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexion_base_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
