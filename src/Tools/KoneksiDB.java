/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 4750z
 */
public class KoneksiDB {
    public Connection getConnection() throws SQLException{
        Connection cnn;
        try{
            String server = "jdbc:mysql://localhost/dbsiakadv1_161530026";
            String drever = "com.mysql.jdbc.Driver";
            Class.forName(drever);
            cnn = DriverManager.getConnection(server, "root","");
            return cnn;
        }catch(SQLException | ClassNotFoundException se){
            JOptionPane.showMessageDialog(null, "Error Koneksi Database : "+se);
            return null;
        }
    }
}
