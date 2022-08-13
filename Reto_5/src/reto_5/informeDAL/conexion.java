
package reto_5.informeDAL;

import java.sql.*;
/**
 *
 * @author Jhon Manrique
 */
public class conexion {
    String strConexionDB = "jdbc:sqlite:D:/MINTIC/PROGRAMACION/CICLO_2/Reto_5/ProyectosConstruccion.db";
    Connection conn = null;
    // try chatch
    public conexion(){
        try{
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection(strConexionDB);
        System.out.println("Conexion Establecida");
    
    }
        catch(Exception e){
            
            System.out.println("Error en la conexion "+ e);
        }
        
        }
        public int ejecutarSentenciaSQL(String strSentenciaSQL){
            try{
                PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
                pstm.execute();
                return 1;
            }
            catch (Exception e){
                System.out.println(e);
                return 0;
            }
    }
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try{
                PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
                ResultSet respuesta = pstm.executeQuery();
                return respuesta;
            }
            catch (Exception e){
                System.out.println(e);
                return null;
            }
        
    
    
    }




}


