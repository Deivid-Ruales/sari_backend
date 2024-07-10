package sari_backend.modulos;

import sari_backend.conexion.Conexion_base_datos;

public class TurnoTrabajo {
    Conexion_base_datos turno = new Conexion_base_datos();
    
    public void Consulta(){
        turno.Conectar();
        turno.Leer_BD("SELECT * FROM turno_trabajo", "estado");
        turno.Desconectar();
    }
    
    public void Modificar(){
        turno.Conectar();
        turno.Actualizar_BD("UPDATE turno_trabajo SET estado = 'En turno' WHERE id = '1';");
        turno.Desconectar();    
    }
    
    public void Crear (){
        turno.Conectar();
        turno.Crear_BD("INSERT INTO turno_trabajo (id, fecha_hora_inicio, fecha_hora_fin, estado, dispositivo, encargado) "
                + "VALUES (4, '2024-07-01 20:30:00', '2024-08-05 18:15:22', 'En turno', 2, 1);");
        turno.Desconectar();
    }
    
    public void Eliminar (){
        turno.Conectar();
        turno.Eliminar_BD("DELETE FROM turno_trabajo WHERE id = 4;");
        turno.Desconectar();
    } 
}
