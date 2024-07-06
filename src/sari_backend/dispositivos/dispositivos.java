package sari_backend.dispositivos;

import sari_backend.conexion.conexion_base_datos;

public class dispositivos {
    conexion_base_datos dispositivo = new conexion_base_datos();
    public void consultaDispositivos(){
        dispositivo.conectar();
        dispositivo.leerBD("SELECT * FROM dispositivo", "referencia");
        dispositivo.desconectar();
    }
    
    public void modificarDispositivo(){
        dispositivo.conectar();
        dispositivo.actualizarBD("UPDATE dispositivo SET referencia = 'L3110' WHERE id = '1';");
        dispositivo.desconectar();    
    }
    
    public void crearDispositivo (){
        dispositivo.conectar();
        dispositivo.crearBD("INSERT INTO dispositivo (id, tipo, marca, referencia, serial_num, descripcion, propietario) "
                + "VALUES (4, 'Impresora', 'Canon', 'G2600', 'GVDW235006', 'Multifuncional color negra con deposito de tintas', 2);");
        dispositivo.desconectar();
    }
    
    public void eliminarDispositivo (){
        dispositivo.conectar();
        dispositivo.eliminarBD("DELETE FROM dispositivo WHERE id = 4;");
        dispositivo.desconectar();
    }   
}
