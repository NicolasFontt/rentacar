
package datos;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operacion {
    Conexion conexion = new Conexion();
    
    public ResultSet listar(String operacion){
        try{
            Class.forName(conexion.getDriver()).newInstance();
            Connection connection = DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(operacion);
            ResultSet resultset =  preparedStatement.executeQuery();
            return resultset;
        }catch(Exception ex){
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha producido un error: "+ex.getMessage());
            return null;
           
            
        }
    }
    public void ejecutar(String operacion){
        try{
            Class.forName(conexion.getDriver()).newInstance();
            Connection connection = DriverManager.getConnection(conexion.getUrl(),conexion.getUser(),conexion.getPassword());
            PreparedStatement preparedStatement = connection.prepareStatement(operacion);
            
            int filasAfectadas = preparedStatement.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(null, "Operacion ejecutada correctamente. Filas Afectadas: "+filasAfectadas);
            
        }catch(SQLException ex){
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha producido un error: "+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha producido un error: "+ex.getMessage());
        } catch (InstantiationException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha producido un error: "+ex.getMessage());
        } catch (IllegalAccessException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Se ha producido un error: "+ex.getMessage());
        }
        
    }
    
}
