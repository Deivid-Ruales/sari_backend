package sari_backend.modulos;

import sari_backend.conexion.Conexion_base_datos;

public class Dispositivos {
    Conexion_base_datos dispositivo = new Conexion_base_datos();
    public void Consulta(){
        dispositivo.Conectar();
        dispositivo.Leer_BD("SELECT * FROM dispositivo", "referencia");
        dispositivo.Desconectar();
    }
    
    public void Modificar(){
        dispositivo.Conectar();
        dispositivo.Actualizar_BD("UPDATE dispositivo SET referencia = 'L3110' WHERE id = '1';");
        dispositivo.Desconectar();    
    }
    
    public void Crear (){
        dispositivo.Conectar();
        dispositivo.Crear_BD("INSERT INTO dispositivo (id, tipo, marca, referencia, serial_num, descripcion, propietario) "
                + "VALUES (4, 'Impresora', 'Canon', 'G2600', 'GVDW235006', 'Multifuncional color negra con deposito de tintas', 2);");
        dispositivo.Desconectar();
    }
    
    public void Eliminar (){
        dispositivo.Conectar();
        dispositivo.Eliminar_BD("DELETE FROM dispositivo WHERE id = 4;");
        dispositivo.Desconectar();
    }   
}
