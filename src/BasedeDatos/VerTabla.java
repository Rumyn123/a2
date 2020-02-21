/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rumyn
 */
public class VerTabla {
    
    public void visualizar_empresa(JTable tabla){
        Metodos metodo = new Metodos();
        Conexion conn = new Conexion();
        ResultSet rs = conn.visualizar_empresa();
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("RFC");
        dt.addColumn("Registro de Camara");
        dt.addColumn("Cuenta Estatal");
        dt.addColumn("Representante legal");
        dt.addColumn("Direccion");
        dt.addColumn("Codigo postal");
        dt.addColumn("Telefono");
        try{
            int b = 0;
            while(rs.next()){
                b = 1;
                Object[] fila = new Object[7]; //El 2 es el numero de columna
                for(int i = 0; i<=6; i++){
                        fila[i] = rs.getObject(i+1);
                }
                
                dt.addRow(fila);
            }
            
            if(b == 0){
                Object[] fila = new Object[7];
                for(int i = 0; i< 7; i++){
                    fila[i] = "No Cargado";
                    }
                dt.addRow(fila);
            }
            
            tabla.setModel(dt);
            tabla.setRowHeight(100);
        }catch(Exception ex){
            metodo.mensaje_consola("Error al visualizar en la tabla");
        }
    }
    
    public boolean comprobarVacio(Object obj){
        return obj != null;
    }
    
    public void visualizar_clientes(JTable tabla){
        Conexion conn = new Conexion();
        ResultSet rs = conn.visualizar_clientes();
        
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("ID");
        dt.addColumn("Nombre");
        
        try{
            while(rs.next()){
                Object[] fila = new Object[2]; //El 2 es el numero de columnas
                fila[0] = rs.getObject(1); //primer valor es la id, el segundo el nombre
                fila[1] = rs.getObject(2);    
                Metodos.mensaje("Id: "+fila[0].toString());
                Metodos.mensaje("Nombre: "+fila[1].toString());
                dt.addRow(fila);
            }
            
            tabla.setModel(dt);
            tabla.setRowHeight(100);
        }catch(Exception ex){
            System.out.println("Error al visualizar en la tabla");
        }
    }
    
    public void visualizar_precios(JTable tabla){
        Conexion conn = new Conexion();
        ResultSet rs = conn.visualizar_precios();
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("ID");
        dt.addColumn("Nombre");
        dt.addColumn("Precio");
        
        try{
            while(rs.next()){
                Object[] fila = new Object[3]; //El 2 es el numero de columnas
                fila[0] = rs.getObject(1); //primer valor es la id, el segundo el nombre
                fila[1] = rs.getObject(2);               
                fila[2] = rs.getObject(3);     
                dt.addRow(fila);
            }
            
            tabla.setModel(dt);
            tabla.setRowHeight(50);
        }catch(Exception ex){
            System.out.println("Error al visualizar en la tabla precios");
        }
    }
    
    public void visualizar(JTable tabla, String t){
        Conexion conn = new Conexion();
        ResultSet rs;
        tabla.setDefaultRenderer(Object.class, new TablaImagen());
        
        DefaultTableModel dt = new DefaultTableModel();
        
        switch(t){
            case "Cliente":
                
                break;
            case "Factura":
                
                break;
            case "Precio":
                dt.addColumn("ID");
                dt.addColumn("Nombre");
                dt.addColumn("Precio");
                rs = conn.visualizar_precios();
                try{
                    while(rs.next()){
                        Object[] fila = new Object[3]; //El 2 es el numero de columnas
                        fila[0] = rs.getObject(1); //primer valor es la id, el segundo el nombre
                        fila[1] = rs.getObject(2);               
                        fila[2] = rs.getObject(3);     
                        dt.addRow(fila);
                    }

                    tabla.setModel(dt);
                    tabla.setRowHeight(50);
                }catch(Exception ex){
                    System.out.println("Error al visualizar en la tabla precios");
                }
                break;
            case "Servicio":
                dt.addColumn("ID");
                dt.addColumn("Nombre");
                dt.addColumn("Corto");
                rs = conn.visualizar_servicios();
                try{
                    while(rs.next()){
                        Object[] fila = new Object[3]; //El 2 es el numero de columnas
                        fila[0] = rs.getObject(1); //primer valor es la id, el segundo el nombre
                        fila[1] = rs.getObject(2);               
                        fila[2] = rs.getObject(3);     
                        dt.addRow(fila);
                    }

                    tabla.setModel(dt);
                    tabla.setRowHeight(50);
                }catch(Exception ex){
                    System.out.println("Error al visualizar en la tabla servicios");
                }
                break;
            case "Univ":
                dt.addColumn("ID");
                dt.addColumn("Nombre");
                dt.addColumn("Corto");
                rs = conn.visualizar_unidadDeVenta();
                try{
                    while(rs.next()){
                        Object[] fila = new Object[3]; //El 2 es el numero de columnas
                        fila[0] = rs.getObject(1); //primer valor es la id, el segundo el nombre
                        fila[1] = rs.getObject(2);               
                        fila[2] = rs.getObject(3);     
                        dt.addRow(fila);
                    }

                    tabla.setModel(dt);
                    tabla.setRowHeight(50);
                }catch(Exception ex){
                    System.out.println("Error al visualizar en la tabla precios");
                }
                break;
        }
    }
    
    
}
