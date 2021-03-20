import java.sql.*;

public class JDBC_task_3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=
                DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
        String sql_create="create table student (SNO Varchar(20),Name Varchar(10),Age Integer , College Varchar(30))";
        String sql_insert="INSERT INTO student(SNO,NAME,Age,College) VALUES"+
                "('s001','老大',20,'计算机学院')," +
                "('s002','老二',19,'计算机学院')," +
                "('s003','老三',18,'计算机学院')," +
                "('s004','老四',17,'计算机学院')" +
                ";";
        String sql_delete="delete from student where SNO='s004'";
        Statement stmt=conn.createStatement();
        stmt.executeUpdate(sql_create);
        stmt.executeUpdate(sql_insert);
        stmt.executeUpdate(sql_delete);
        String sql_select="SELECT * FROM student;";
        ResultSet rs = stmt.executeQuery(sql_select);
        while(rs.next()){
            System.out.print(rs.getString("SNO"));
            System.out.print(rs.getString("Name"));
            System.out.print(rs.getString("Age"));
            System.out.print(rs.getString("College"));
            System.out.println();;
        }
        stmt.close();
        conn.close();
        rs.close();
    }
}
