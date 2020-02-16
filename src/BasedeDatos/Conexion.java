/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Rumyn
 */
public class Conexion {
    
    //Declaracion de propiedades
    private static final String tablaClientes = "clientes";
    private static final String tablaEmpresa = "empresa";
    private static final String tablaFacturacion = "facturacion";
    private static final String tablaPrecio = "precio";
    private static final String tablaServicios = "servicios";
    private static final String tablaUnidadDeVenta = "univ";
    //Fin declaracion de propiedades
    
    public Connection conectar(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/a2"; //Direccion en la que se conectará a la db
        try{
            Class.forName("com.mysql.jdbc.Driver"); //Este hace una seleccion para cargar una subinstancia de la misma clase para solo usar conexiones mysql ya que cada db tiene sus protocolos distintos
            con = DriverManager.getConnection(url, "root",""); //Despues de registrar el driver de mysql se usa el metodo DriverManager para iniciar la conexion dando de parametros la url, el usuario y la pass de la db
            System.out.println("En linea con a2");
        } catch (Exception ex){
            System.out.println("Error, no se pudo conectar a a2");
        }
        return con;
        
    }
    
    public ResultSet visualizar_clientes(){
        Connection con = conectar(); //Conectamos a la DB
        ResultSet rs = null; //La variable ResultSet almacena lo que retorne una consulta SQL
        try{
            PreparedStatement ps = con.prepareStatement("select * from "+tablaClientes); //PreparedStatement prepara una consulta SQL para su posterior ejecución
            rs = ps.executeQuery(); //El ResultSet será igual a lo que retorne la ejecución del PreparedStatement
        } catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
    
    public ResultSet visualizar_empresa(){
        Connection con = conectar(); //Conectamos a la DB
        ResultSet rs = null; //La variable ResultSet almacena lo que retorne una consulta SQL
        try{
            PreparedStatement ps = con.prepareStatement("select * from "+tablaEmpresa); //PreparedStatement prepara una consulta SQL para su posterior ejecución
            rs = ps.executeQuery(); //El ResultSet será igual a lo que retorne la ejecución del PreparedStatement
        } catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
    
    public ResultSet visualizar_facturas(){
        Connection con = conectar(); //Conectamos a la DB
        ResultSet rs = null; //La variable ResultSet almacena lo que retorne una consulta SQL
        try{
            PreparedStatement ps = con.prepareStatement("select * from "+tablaFacturacion); //PreparedStatement prepara una consulta SQL para su posterior ejecución
            rs = ps.executeQuery(); //El ResultSet será igual a lo que retorne la ejecución del PreparedStatement
        } catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
    
    public ResultSet visualizar_precios(){
        Connection con = conectar(); //Conectamos a la DB
        ResultSet rs = null; //La variable ResultSet almacena lo que retorne una consulta SQL
        try{
            PreparedStatement ps = con.prepareStatement("select * from "+tablaPrecio); //PreparedStatement prepara una consulta SQL para su posterior ejecución
            rs = ps.executeQuery(); //El ResultSet será igual a lo que retorne la ejecución del PreparedStatement
        } catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
    
    public ResultSet visualizar_servicios(){
        Connection con = conectar(); //Conectamos a la DB
        ResultSet rs = null; //La variable ResultSet almacena lo que retorne una consulta SQL
        try{
            PreparedStatement ps = con.prepareStatement("select * from "+tablaServicios); //PreparedStatement prepara una consulta SQL para su posterior ejecución
            rs = ps.executeQuery(); //El ResultSet será igual a lo que retorne la ejecución del PreparedStatement
        } catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
    
    public ResultSet visualizar_unidadDeVenta(){
        Connection con = conectar(); //Conectamos a la DB
        ResultSet rs = null; //La variable ResultSet almacena lo que retorne una consulta SQL
        try{
            PreparedStatement ps = con.prepareStatement("select * from "+tablaUnidadDeVenta); //PreparedStatement prepara una consulta SQL para su posterior ejecución
            rs = ps.executeQuery(); //El ResultSet será igual a lo que retorne la ejecución del PreparedStatement
        } catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
}
