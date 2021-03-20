package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class start {
    public static void main(String[] args) throws Exception  {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=
        DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
        String sql="update choose set score=score+100 where score=95.00 ";
        Statement stmt=conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(conn);
        System.out.println(count);
        stmt.close();
        conn.close();
    }
}
