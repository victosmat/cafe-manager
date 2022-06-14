package ConnectSqlServer;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectSqlServer {
    public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connection = "jdbc:sqlserver://localhost;databaseName=QuanCaffee;";
        String tenDangNhap = "sa";
        String matKhau = "123";
        Connection con = DriverManager.getConnection(connection, tenDangNhap, matKhau);
        return con;
    }
}
