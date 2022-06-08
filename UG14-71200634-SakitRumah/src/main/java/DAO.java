import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    public static void getPasienSembuh() {

    }

    public void inputPasien(Pasien pasien) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/rumahsakit";
        Connection conn = DriverManager.getConnection(url,"root","");
        Statement statement = conn.createStatement();
        String sql = "INSERT INTO pasien values ('"+pasien.getRm()+"','"+pasien.getNama()+"','"+pasien.getUsia()+"','"+pasien.getAlamat()+"')";
        statement.executeUpdate(sql);
    }

}