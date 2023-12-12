/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Iza
 */
public class JaringanKeDatabase {
    static final String driver_JDBC = "com.mysql.cj.jdbc.Driver";
    static final String urlDb = "jdbc:mysql://localhost:3306/sell_db";
    static final String usernameDb = "root";
    static final String passwordDb = "nvadmin";
    static Connection koneksi;
    static Statement stat_statement;
    static ResultSet rs_resultSet;

    public static Connection koneksiDatabase(){
        try {
            Class.forName(driver_JDBC);
        } catch (ClassNotFoundException cnf){
            
        } try {
            koneksi =
                (Connection) DriverManager.getConnection(urlDb, usernameDb, passwordDb);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return koneksi;
    }
}
