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
    
    Metodos metodo = new Metodos();
    
    public Integer obtenerUltimoID(String tabla){
        
        Connection con = conectar();
        switch(tabla){
            case "Clientes":
                String consulta = "SELECT clientes.cli_id FROM clientes ORDER BY clientes.cli_id DESC ";
        ResultSet rs = null;
        int id;
        try{
            PreparedStatement ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            id = (Integer.parseInt(rs.getObject(1).toString()))+1;
            Metodos.mensaje("Se leyo de la db el ultimo id disponible: "+id);
            return id;
        }catch(Exception ex){
            Metodos.mensaje_consola("Error de consulta al visualizar el ultimo ID");
        }
        Metodos.mensaje("No se leyò el ultimo id");
        
                break;
            case "Precios":
                break;
            default:
                Metodos.mensaje("Porfavor, no intente romper el codigo");
                break;
        }
        return -1;
        
    }
    
    
    public ResultSet visualizar_clientes(){
        Connection con = conectar(); //Conectamos a la DB
        ResultSet rs = null; //La variable ResultSet almacena lo que retorne una consulta SQL
        try{
            PreparedStatement ps = con.prepareStatement("select * from "+tablaClientes); //PreparedStatement prepara una consulta SQL para su posterior ejecución
            rs = ps.executeQuery(); //El ResultSet será igual a lo que retorne la ejecución del PreparedStatement
        } catch(Exception ex){
            System.out.println("Error de consulta al visualizar clientes");
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
    
    public ResultSet buscarId_Cliente(String id){
        Connection con = conectar();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String buscar = "SELECT * FROM `clientes` WHERE `cli_id` = "+id;
        try{
            ps = con.prepareStatement(buscar);
            rs = ps.executeQuery();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return rs;
    }
    
    public void guardar_empresa(String rfc, String rCamara, String cEstatal, String rLegal, String direccion, String cp, String tel){
        Connection con = conectar(); //Conectamos a la DB
        String insert = "insert into empresa (em_rfc, em_camara, em_estatal, em_representante, em_direccion, em_cp, em_tel) values (?,?,?,?,?,?,?)"; //Creamos un String con la consulta del insert
        PreparedStatement ps = null; //preparar la consulta

        try{
            ps = con.prepareStatement(insert); //Prepara la consulta
            ps.setString(1, rfc);    //Cambia el primer parametro (nombre) del insert por la variable nombre
            ps.setString(2, rCamara);
            ps.setString(3, cEstatal);
            ps.setString(4, rLegal);
            ps.setString(5, direccion);
            ps.setString(6, cp);
            ps.setString(7, tel);

            
            ps.executeUpdate(); //Ejecuta la consulta
        }catch(Exception ex){
            metodo.mensaje("Error al guardar");
        }
    }
    
    public void guardar_cliente(String rfc, String rCamara, String cEstatal, String rLegal, String direccion, String cp, String tel){
        Connection con = conectar(); //Conectamos a la DB
        String insert = "insert into empresa (em_rfc, em_camara, em_estatal, em_representante, em_direccion, em_cp, em_tel) values (?,?,?,?,?,?,?)"; //Creamos un String con la consulta del insert
        PreparedStatement ps = null; //preparar la consulta

        try{
            ps = con.prepareStatement(insert); //Prepara la consulta
            ps.setString(1, rfc);    //Cambia el primer parametro (nombre) del insert por la variable nombre
            ps.setString(2, rCamara);
            ps.setString(3, cEstatal);
            ps.setString(4, rLegal);
            ps.setString(5, direccion);
            ps.setString(6, cp);
            ps.setString(7, tel);

            
            ps.executeUpdate(); //Ejecuta la consulta
        }catch(Exception ex){
            metodo.mensaje("Error al guardar");
        }
    }
    
    public void actualizar_empresa(String rfc, String rCamara, String cEstatal, String rLegal, String direccion, String cp, String tel){
        Connection con = conectar();
        String update = "update empresa set em_rfc = ?, em_camara = ?, em_estatal = ?, em_representante = ?, em_direccion = ?, em_cp = ?, em_tel = ? WHERE empresa.em_rfc = ? ";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(update);
            ps.setString(1, rfc);    //Cambia el primer parametro (nombre) del insert por la variable nombre
            ps.setString(2, rCamara);
            ps.setString(3, cEstatal);
            ps.setString(4, rLegal);
            ps.setString(5, direccion);
            ps.setString(6, cp);
            ps.setString(7, tel);
            ps.setString(8, rfc);
            
            metodo.mensaje("La consulta resultante es "+ update+" con el rfc " + rfc + " el rCamara "+ rCamara + " La cEstatal "+ cEstatal + " El rLegal "+ rLegal + " la dir " + direccion + " el cp "+ cp+ " y el tel "+tel);
            
            ps.executeUpdate(); //Ejecuta la consulta
        }catch(Exception ex){
            metodo.mensaje("Error al actualizar");
        }
    }
    

    
    
}
