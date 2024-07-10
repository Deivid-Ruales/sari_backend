package sari_backend.modulos;

import sari_backend.conexion.Conexion_base_datos;

public class Usuarios {
   Conexion_base_datos usuario = new Conexion_base_datos();
    public void Consulta(){
        usuario.Conectar();
        usuario.Leer_BD("SELECT * FROM usuario", "nombre");
        usuario.Desconectar();
    }
    
    public void Modificar(){
        usuario.Conectar();
        usuario.Actualizar_BD("UPDATE usuario SET nombre = 'Andres' WHERE id = '1';");
        usuario.Desconectar();    
    }
    
    public void Crear (){
        usuario.Conectar();
        usuario.Crear_BD("INSERT INTO usuario (id, nombre, cedula, email, direccion, telefono, rol, contrasena) "
                + "VALUES (5, 'Adrian Guzman', '1004214010', 'adrianguzman@gmail', 'Calle 10 centro', '3153335552', 1, '1234');");
        usuario.Desconectar();
    }
    
    public void Eliminar (){
        usuario.Conectar();
        usuario.Eliminar_BD("DELETE FROM usuario WHERE id = 5;");
        usuario.Desconectar();
    }  
}
