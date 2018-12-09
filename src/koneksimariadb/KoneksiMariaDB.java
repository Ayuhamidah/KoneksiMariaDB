package koneksimariadb;import javax.swing.JOptionPane;
import java.sql.*;
public class KoneksiMariaDB {
    public static void main(String[] args) {
		try
		{
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mariadb://localhost/Barang","root","root");
            Statement state = koneksi.createStatement();
            
            state.executeUpdate("insert into DetilBarang" + "(ID,Nama,Harga)" + "values" + "('B005','Susu Coklat','7500')");
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan","Pesan",JOptionPane.INFORMATION_MESSAGE);
            
            state.close();
		} 
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Error : " + ex,"Pesan",JOptionPane.ERROR_MESSAGE);
		}				
	}
}    