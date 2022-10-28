/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.Conexion;
import datos.UsuarioDaoJDBC;
import dominio.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Emily Barrientos
 */
public class main {
        public static void main(String[] args) {
//            Connection conexion = null;
//        try {
//            conexion = Conexion.getConnection();
//            System.out.println("SI SE PUDO CONECTAR A LA BD");
//            if (conexion.getAutoCommit()) {
//                conexion.setAutoCommit(false);
//            }
//
//            UsuarioDaoJDBC usuarioJdbc = new UsuarioDaoJDBC(conexion);
//
//            UsuarioDTO cambioUsuario = new UsuarioDTO();
//            cambioUsuario.setId(1);
//            cambioUsuario.setNombre("juan");
//            cambioUsuario.setCorreo("juan@gmail.com");
//            cambioUsuario.setContrasenia("123");
//            usuarioJdbc.update(cambioUsuario);
//
//            UsuarioDTO nuevoUsuario = new UsuarioDTO();
//            nuevoUsuario.setNombre("rogrigo");
//            nuevoUsuario.setCorreo("rodigo@gmail.com");
//            //nuevoUsuario.setPassword("estaesunaclavedelargaduracionparaproteccion");
//            nuevoUsuario.setContrasenia("123");
//            usuarioJdbc.insert(nuevoUsuario);
//
//            conexion.commit();
//            System.out.println("Se ha hecho commit de la transaccion");
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//            System.out.println("Entramos al rollback");
//            try {
//                conexion.rollback();
//            } catch (SQLException ex1) {
//                ex1.printStackTrace(System.out);
//            }
//        }
//    }
             
            
//            
//        Connection conexion = null;
//        
//        try {
//            conexion = Conexion.getConnection();
//            System.out.println("SI SE PUDO CONECTAR");
//            if(conexion.getAutoCommit()){
//                conexion.setAutoCommit(false);
//            }
//            UsuarioDaoJDBC usuarioJdbc = new UsuarioDaoJDBC(conexion);
//
//           UsuarioDTO cambioUsuario = new UsuarioDTO();
//            
//            UsuarioDTO nuevoUsuario = new UsuarioDTO();
//            nuevoUsuario.setNombre("rogrigo");
//            nuevoUsuario.setCorreo("rodigo@gmail.com");
//            //nuevoUsuario.setPassword("estaesunaclavedelargaduracionparaproteccion");
//            nuevoUsuario.setContrasenia("123");
//            usuarioJdbc.insert(nuevoUsuario);
//        } catch (SQLException e) {
//            System.out.println("Hay problemas "+e.getMessage());
//        }

 //definimos la variable conexion
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            
            //el autocommit por default es true, lo pasamos a false
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
                System.out.println("SE HA CONECTADO");
            }

            UsuarioDaoJDBC UsuarioDaoJDBC = new UsuarioDaoJDBC(conexion) {};
            
            List<UsuarioDTO> usuarios = UsuarioDaoJDBC.select();
            
         for(UsuarioDTO usuario : usuarios){
             System.out.println("Usuarios Registrados:"+ usuario);
            
        }
         conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }


       }

}
        
        

