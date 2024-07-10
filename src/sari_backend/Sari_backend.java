package sari_backend;

import sari_backend.conexion.Conexion_base_datos;
import sari_backend.modulos.Dispositivos;
import sari_backend.modulos.HistorialDispositivos;
import sari_backend.modulos.TurnoTrabajo;
import sari_backend.modulos.Usuarios;

public class Sari_backend {

    public static void main(String[] args) {
        //------------------------------------
        //MODULO DE DISPOSITIVOS
        //------------------------------------
        //Prueba de conexion a la base de datos SARI en la tabla de DISPOSITIVOS
        Dispositivos dispositivo = new Dispositivos();
        //Leer la columna de REFERENCIA  de la tabla DISPOSITIVOS
        System.out.println("-----MODULO DISPOSITIVOS-----");
        dispositivo.Consulta();
        
        //Actualizar la REFERENCIA de la tabla DISPOSITIVOS del ID 1
        dispositivo.Modificar();
        //Comprobar la actualizacion en la tabla
        dispositivo.Consulta();
        
        //Crear un registro en la tabla DISPOSITIVOS con id 4
        dispositivo.Crear();
        //Comprobar la insercion del registro
        dispositivo.Consulta();
        
        //Eliminacion del registro creado en DISPOSITIVOS con id 4
        dispositivo.Eliminar();
        //Comprobar la eliminacion del registro 4
        dispositivo.Consulta();
        
        //------------------------------------
        //MODULO DE USUARIOS
        //------------------------------------
        //Prueba de conexion a la tabla de USUARIO
        Usuarios usuarios = new Usuarios();
        //Leer la columna de NOMBRE  de la tabla USUARIO
        System.out.println("-----MODULO USUARIOS-----");
        usuarios.Consulta();
        //Actualizar el NOMBRE de la tabla USUARIO del ID 1
        usuarios.Modificar();
        //Comprobar la actualizacion en la tabla
        usuarios.Consulta();
        
        //Crear un registro en la tabla USUARIO con id 4
        usuarios.Crear();
        //Comprobar la insercion del registro
        usuarios.Consulta();
        
        //Eliminacion del registro creado en DISPOSITIVOS con id 4
        usuarios.Eliminar();
        //Comprobar la eliminacion del registro 4
        usuarios.Consulta();
        
        //------------------------------------
        //MODULO DE HISTORIAL DE DISPOSITIVOS
        //------------------------------------
        //Prueba de conexion a la tabla de HISTORIAL_DISPOSITIVO
        HistorialDispositivos historial = new HistorialDispositivos();
        //Leer la columna de OBSERVACIONES de la tabla HISTORIAL_DISPOSITIVO
        System.out.println("-----MODULO HISTORIAL DE DISPOSITIVOS-----");
        historial.Consulta();
        //Actualizar las OBSERVACIONES de la tabla HISTORIAL_DISPOSITIVO del ID 1
        historial.Modificar();
        //Comprobar la actualizacion en la tabla
        historial.Consulta();
        
        //Crear un registro en la tabla HISTORIAL_DISPOSITIVO con id 4
        historial.Crear();
        //Comprobar la insercion del registro
        historial.Consulta();
        
        //Eliminacion del registro creado en HISTORIAL_DISPOSITIVO con id 4
        historial.Eliminar();
        //Comprobar la eliminacion del registro 4
        historial.Consulta();
        
        //------------------------------------
        //MODULO DE TURNO DE TRABAJO
        //------------------------------------
        //Prueba de conexion a la tabla de TURNO_TRABAJO
        TurnoTrabajo turno = new TurnoTrabajo();
        //Leer la columna de ESTADO de la tabla TURNO_TRABAJO
        System.out.println("-----MODULO TURNO DE TRABAJO-----");
        turno.Consulta();
        //Actualizar las ESTADO de la tabla TURNO_TRABAJO del ID 1
        turno.Modificar();
        //Comprobar la actualizacion en la tabla
        turno.Consulta();
        
        //Crear un registro en la tabla TURNO_TRABAJO con id 4
        turno.Crear();
        //Comprobar la insercion del registro
        turno.Consulta();
        
        //Eliminacion del registro creado en TURNO_TRABAJO con id 4
        turno.Eliminar();
        //Comprobar la eliminacion del registro 4
        turno.Consulta();
    }
    
}
