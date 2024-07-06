package sari_backend;

import sari_backend.conexion.conexion_base_datos;
import sari_backend.dispositivos.dispositivos;

public class Sari_backend {

    public static void main(String[] args) {
        //Prueba de conexion a la base de datos SARI en la tabla de DISPOSITIVOS
        dispositivos dispositivo = new dispositivos();
        
        //Leer la columna de REFERENCIA  de la tabla DISPOSITIVOS
        dispositivo.consultaDispositivos();
        
        //Actualizar la REFERENCIA de la tabla DISPOSITIVOS del ID 1
        dispositivo.modificarDispositivo();
        //Comprobar la actualizacion en la tabla
        dispositivo.consultaDispositivos();
        
        //Crear un registro en la tabla DISPOSITIVOS con id 4
        dispositivo.crearDispositivo();
        //Comprobar la insercion del registro
        dispositivo.consultaDispositivos();
        
        //Eliminacion del registro creado en DISPOSITIVOS con id 4
        dispositivo.eliminarDispositivo();
        //Comprobar la eliminacion del registro 4
        dispositivo.consultaDispositivos();
        
    }
    
}
