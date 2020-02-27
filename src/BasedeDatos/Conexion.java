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
    
    
    public Integer obtenerUltimoID(String tabla){
        String consulta, help;
        Connection con = conectar();
        ResultSet rs = null;
        PreparedStatement ps = null;
        int id;
        switch(tabla){
            case "Cliente":
                consulta = "SELECT clientes.cli_id FROM clientes ORDER BY clientes.cli_id DESC ";
                try{
                    ps = con.prepareStatement(consulta);
                    rs = ps.executeQuery();
                    rs.first();
                    id = (Integer.parseInt(rs.getObject(1).toString()))+1;
                    Metodos.mensaje("Se leyo de la db el ultimo id disponible: "+id);
                    return id;
                }catch(Exception ex){
                    Metodos.mensaje_consola("Error de consulta al visualizar el ultimo ID");
                }
                Metodos.mensaje("No se leyò el ultimo id");
                break;
            case "Precio":
                consulta = "SELECT * FROM "+tablaPrecio+" ORDER BY p_id DESC";
                try{
                    ps = con.prepareStatement(consulta);
                    rs = ps.executeQuery();
                    rs.first();
                    help = rs.getString(1);
                    id = Integer.parseInt(help);
                    id++;
                    Metodos.mensaje("Se leyo de la db el ultimo id disponible: "+id);
                    return id;
                }catch(Exception ex){
                    Metodos.mensaje_consola("Error de consulta al visualizar el ultimo ID");
                }
                Metodos.mensaje("No se leyò el ultimo id");
                break;
            case "Univ":
                consulta = "SELECT * FROM "+tablaUnidadDeVenta+" ORDER BY `uni_id` DESC ";
                try{
                    ps = con.prepareStatement(consulta);
                    rs = ps.executeQuery();
                    rs.first();
                    help = rs.getString(1);
                    id = Integer.parseInt(help);
                    id++;
                    Metodos.mensaje("Se leyo de la db el ultimo id disponible: "+id);
                    return id;
                }catch(Exception ex){
                    Metodos.mensaje_consola("Error de consulta al visualizar el ultimo ID");
                }
                Metodos.mensaje("No se leyò el ultimo id");
                break;
            case "Factura":
                break;
            case "Servicio":
                consulta = "SELECT * FROM "+tablaServicios+" ORDER BY `ser_id` DESC";
                try{
                    ps = con.prepareStatement(consulta);
                    rs = ps.executeQuery();
                    rs.first();
                    help = rs.getString(1);
                    id = Integer.parseInt(help);
                    id++;
                    Metodos.mensaje("Se leyo de la db el ultimo id disponible: "+id);
                    return id;
                }catch(Exception ex){
                    Metodos.mensaje_consola("Error de consulta al visualizar el ultimo ID de Servicio");
                }
                Metodos.mensaje("No se leyò el ultimo id");
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
    
    public ResultSet buscarId(String tabla, String id){
        
        Connection con = conectar();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String buscar;
        switch(tabla){
            case "Cliente":
                buscar = "SELECT * FROM `clientes` WHERE `cli_id` = "+id;
                try{
                    ps = con.prepareStatement(buscar);
                    rs = ps.executeQuery();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
                break;
            case "Factura":
                buscar = "SELECT * FROM `facturacion` WHERE `fac_id` = "+id;
                try{
                    ps = con.prepareStatement(buscar);
                    rs = ps.executeQuery();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
                break;
            case "Precio":
                buscar = "SELECT * FROM `precio` WHERE `p_id`= "+id;
                try{
                    ps = con.prepareStatement(buscar);
                    rs = ps.executeQuery();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
                break;
            case "Servicio":
                buscar = "SELECT * FROM `servicios` WHERE `ser_id` = "+id;
                try{
                    ps = con.prepareStatement(buscar);
                    rs = ps.executeQuery();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
                break;
            case "Univ":
                buscar = "SELECT * FROM `univ` WHERE `uni_id` = "+id;
                try{
                    ps = con.prepareStatement(buscar);
                    rs = ps.executeQuery();
                }catch(SQLException ex){
                    System.out.println(ex);
                }
                break;
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
            Metodos.mensaje("Error al guardar");
        }
    }
    
    public void guardar(String tabla, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String campo9){
        Connection con = conectar(); //Conectamos a la DB
         //Creamos un String con la consulta del insert
        PreparedStatement ps = null; //preparar la consulta
        String insert;
        
        
        switch(tabla){
            case "Cliente":
                insert = "INSERT INTO `clientes` (`cli_nombre`, `cli_rfc`, `cli_moneda`, `cli_nprecio`, `cli_credito`, `cli_direc`, `cli_cp`, `cli_tel`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try{
                    ps = con.prepareStatement(insert); //Prepara la consulta
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);
                    ps.setString(3, campo3);
                    ps.setString(4, campo4);
                    ps.setString(5, campo5);
                    ps.setString(6, campo6);
                    ps.setString(7, campo7);
                    ps.setString(8, campo8);
                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al guardar en la tabla "+tabla);
                }
                break;
            case "Empresa":
                insert = "insert into empresa (em_rfc, em_camara, em_estatal, em_representante, em_direccion, em_cp, em_tel) values (?,?,?,?,?,?,?)";
                try{
                    ps = con.prepareStatement(insert); //Prepara la consulta
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);
                    ps.setString(3, campo3);
                    ps.setString(4, campo4);
                    ps.setString(5, campo5);
                    ps.setString(6, campo6);
                    ps.setString(7, campo7);
                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al guardar en la tabla "+tabla);
                }
                break;
            case "Factura":
                insert = "insert into empresa (em_rfc, em_camara, em_estatal, em_representante, em_direccion, em_cp, em_tel) values (?,?,?,?,?,?,?)";
                try{
                    ps = con.prepareStatement(insert); //Prepara la consulta
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);
                    ps.setString(3, campo3);
                    ps.setString(4, campo4);
                    ps.setString(5, campo5);
                    ps.setString(6, campo6);
                    ps.setString(7, campo7);
                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al guardar en la tabla "+tabla);
                }
                break;
            case "Precio":
                insert = "INSERT INTO `precio` (`p_nombre`, `p_costo`) VALUES (?, ?)";
                try{
                    ps = con.prepareStatement(insert); //Prepara la consulta
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);

                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al guardar en la tabla "+tabla);
                }
                break;
            case "Servicio":
                insert = "INSERT INTO `servicios` (`ser_nombre`, `ser_corto`, `ser_desc`, `ser_uni`, `ser_pre`) VALUES (?, ?, ?, ?, ?)";
                try{
                    ps = con.prepareStatement(insert); //Prepara la consulta
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);
                    ps.setString(3, campo3);
                    ps.setString(4, campo4);
                    ps.setString(5, campo5);
                    Metodos.mensaje("Nombre : "+campo1+" Corto : "+campo2+" Descripcion : "+campo3+" Unidad : "+campo4+" Precio : "+campo5);
                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al guardar en la tabla "+tabla);
                }
                break;
            case "Univ":
                insert = "INSERT INTO `univ` (`uni_nombre`, `uni_corto`) VALUES (?,?);";
                try{
                    ps = con.prepareStatement(insert); //Prepara la consulta
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);
                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al guardar en la tabla "+tabla);
                }
                break;
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
            
            Metodos.mensaje("La consulta resultante es "+ update+" con el rfc " + rfc + " el rCamara "+ rCamara + " La cEstatal "+ cEstatal + " El rLegal "+ rLegal + " la dir " + direccion + " el cp "+ cp+ " y el tel "+tel);
            
            ps.executeUpdate(); //Ejecuta la consulta
        }catch(Exception ex){
            Metodos.mensaje("Error al actualizar");
        }
    }
    
    public void actualizar(String tabla, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String campo9){
        Connection con = conectar();
        String update; 
        PreparedStatement ps = null;
        
        switch(tabla){
            case "Cliente":
                update = "UPDATE `clientes` SET `cli_nombre` = ?, `cli_rfc` = ?, `cli_moneda` = ?, `cli_nprecio` = ?, `cli_credito` = ?, `cli_direc` = ?, `cli_cp` = ?, `cli_tel` = ? WHERE `clientes`.`cli_id` = ?";
                try{
                    ps = con.prepareStatement(update);
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);
                    ps.setString(3, campo3);
                    ps.setString(4, campo4);
                    ps.setString(5, campo5);
                    ps.setString(6, campo6);
                    ps.setString(7, campo7);
                    ps.setString(8, campo8);
                    ps.setString(9, campo9);


                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al actualizar");
                }
                break;
            case "Empresa":
                update = "update empresa set em_rfc = ?, em_camara = ?, em_estatal = ?, em_representante = ?, em_direccion = ?, em_cp = ?, em_tel = ? WHERE empresa.em_rfc = ? ";
                try{
                    ps = con.prepareStatement(update);
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);
                    ps.setString(3, campo3);
                    ps.setString(4, campo4);
                    ps.setString(5, campo5);
                    ps.setString(6, campo6);
                    ps.setString(7, campo7);
                    ps.setString(8, campo1);


                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al actualizar");
                }
                break;
            case "Factura":
                
                break;
            case "Precio":
                update = "UPDATE `precio` SET `p_nombre` = ?, `p_costo` = ? WHERE `precio`.`p_id` = ?";
                try{
                    ps = con.prepareStatement(update);
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);
                    ps.setString(3, campo3);

                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al actualizar");
                }
                break;
            case "Servicio":
                
                break;
            case "Univ":
                update = "UPDATE `univ` SET `uni_nombre` = ?, `uni_corto` = ? WHERE `univ`.`uni_id` = ?";
                try{
                    ps = con.prepareStatement(update);
                    ps.setString(1, campo1);    //Cambia el primer parametro (nombre) del insert por la variable nombre
                    ps.setString(2, campo2);
                    ps.setString(3, campo3);

                    ps.executeUpdate(); //Ejecuta la consulta
                }catch(Exception ex){
                    Metodos.mensaje("Error al actualizar");
                }
                break;
        }
    }
    

    
    
}
