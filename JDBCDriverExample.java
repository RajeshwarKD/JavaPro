import java.sql.*;
public class JDBCDriverExample {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_marks", "root", "password");
        System.out.println(con);
    }
}
