package sari_backend.modulos;

import sari_backend.conexion.Conexion_base_datos;

public class HistorialDispositivos {
    Conexion_base_datos historial = new Conexion_base_datos();
    public void Consulta(){
        historial.Conectar();
        historial.Leer_BD("SELECT * FROM historial_dispositivo", "observaciones");
        historial.Desconectar();
    }
    
    public void Modificar(){
        historial.Conectar();
        historial.Actualizar_BD("UPDATE historial_dispositivo SET observaciones = 'Reparación' WHERE id = '1';");
        historial.Desconectar();    
    }
    
    public void Crear (){
        historial.Conectar();
        historial.Crear_BD("INSERT INTO historial_dispositivo (id, dispositivo, turno_trabajo, almohadillas, paginas_impresas, paginas_adf, observaciones) "
                + "VALUES (4, 1, 2, '55%', '22.500', '1.500', 'Revisión');");
        historial.Desconectar();
    }
    
    public void Eliminar (){
        historial.Conectar();
        historial.Eliminar_BD("DELETE FROM historial_dispositivo WHERE id = 4;");
        historial.Desconectar();
    }  
}
