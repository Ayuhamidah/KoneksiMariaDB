package koneksimariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi {
    
    Connection con;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/tokoalattulis01", "root", "");
            stm = con.createStatement();
            JOptionPane.showMessageDialog(null, "Berhasil Connect");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
    /*public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/tokoalattulis01","root","");
            Statement state = koneksi.createStatement();
            
            state.executeUpdate("insert into admin" + "(username, password)" + "values" + "('admin31', '1233')");
            JOptionPane.showMessageDialog(null, "Berhasil Login SELAMAT!!","Pesan",JOptionPane.INFORMATION_MESSAGE);
            
            state.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex,"Pesan",JOptionPane.ERROR_MESSAGE);
        }
    }*/
}