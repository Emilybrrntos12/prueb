/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import dominio.ActoresDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Emily Barrientos
 */
public interface ActoresDAO {
    
   public List<ActoresDTO> select() throws SQLException;
   public int insert(ActoresDTO actore) throws SQLException;
   public int update(ActoresDTO actore) throws SQLException;
   public int delete(ActoresDTO actore) throws SQLException;
    
}
