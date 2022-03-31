/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1dpbo2022;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author acer
 */

public class dbConnection {
    public static Connection con;
    public static Statement stm;
    
    public void connect(){//untuk membuka koneksi ke database
        try {
            String url ="jdbc:mysql://localhost/db_books_tp1dpbo";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
    public String getValueDb(String sql, String col) {
        String value = "";
        try {
            connect();
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                value = res.getString(col);
            }
        }catch(Exception e) {
            System.err.println("Query gagal" +e.getMessage());
        }
        return value;
    }
    
    public DefaultTableModel readTableAuthor(JTable author) {
        DefaultTableModel tAuthor = null;
        author.setDefaultRenderer(Object.class, new TableModel());
        try {
            Object[] column = {"No.", "Image", "Nama", "Jumlah Buku"};
            connect();
            tAuthor = new DefaultTableModel(null, column);
            String sql = "SELECT * FROM tauthors;";
            ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                Object[] result = new Object[4];
                result[0] = res.getInt("id");
                Image image = null;
                try {
                    URL url = new URL(res.getString("img"));
                    image = ImageIO.read(url);
                    ImageIcon img = new ImageIcon(image.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                    JLabel myImg = new JLabel(img);
                    result[1] = myImg;
                }catch(IOException e) {
                }
                result[2] = res.getString("nama");
                result[3] = res.getInt("jumlah_buku");
                
                tAuthor.addRow(result);
            }
            author.setRowHeight(100);
            author.setModel(tAuthor);
        }catch(Exception e) {
            System.err.println("Read gagal " + e.getMessage());
        }
        
        return tAuthor;
    }
    
    public DefaultTableModel readTableBook(JTable book) {
        DefaultTableModel tBook = null;
        book.setDefaultRenderer(Object.class, new TableModel());
        try {
            Object[] column = {"No.", "Image", "Penerbit", "Author", "Deskripsi"};
            connect();
            tBook = new DefaultTableModel(null, column);
            String sql = "SELECT * FROM tbooks;";
            ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                Object[] result = new Object[5];
                result[0] = res.getInt("id");
                Image image = null;
                try {
                    URL url = new URL(res.getString("img"));
                    image = ImageIO.read(url);
                    ImageIcon img = new ImageIcon(image.getScaledInstance(100, 200, Image.SCALE_SMOOTH));
                    JLabel myImg = new JLabel(img);
                    result[1] = myImg;
                }catch(IOException e) {
                }
                result[2] = res.getString("penerbit");
                result[3] = res.getString("author");
                result[4] = res.getString("deskripsi");
                
                tBook.addRow(result);
            }
            book.setRowHeight(200);
            book.setModel(tBook);
        }catch(Exception e) {
            System.err.println("Read gagal " + e.getMessage());
        }
        
        return tBook;
    }

    public void Query(String inputan){
        try{
            connect();
            String sql = inputan;
            stm.execute(sql);
        }catch(Exception e){
            System.err.println("Read gagal " +e.getMessage());
        }
    }
}
