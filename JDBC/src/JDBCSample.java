import java.sql.*;

/**
 * Created by alexei.yakushyn on 02.10.2017.
 */

public class JDBCSample {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "adminiptv2017";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);
            // Open a connection
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            // Execute a query
            statement = connection.createStatement();
            // Create tables students, progress
            statement.executeUpdate("create table if not exists students (id int primary key auto_increment, firstname varchar(50), lastname varchar(50));");
            statement.executeUpdate("create table if not exists progress (student_id int primary key auto_increment, physics int, math int, programming int)");
            // filling tables
            statement.executeUpdate("INSERT INTO students VALUES (1, 'Vasja', 'Vasechkin')");
            statement.executeUpdate("INSERT INTO students VALUES (2, 'Petja', 'Petechkin')");
            statement.executeUpdate("INSERT INTO students VALUES (3, 'John', 'Malkovich')");
            statement.executeUpdate("INSERT INTO students VALUES (4, 'Sara', 'Connor')");
            statement.executeUpdate("INSERT INTO students VALUES (5, 'Life', 'Isgood')");

            statement.executeUpdate("INSERT INTO progress VALUES (1,2,3,3)");
            statement.executeUpdate("INSERT INTO progress VALUES (2,5,5,5)");
            statement.executeUpdate("INSERT INTO progress VALUES (3,4,3,2)");
            statement.executeUpdate("INSERT INTO progress VALUES (4,5,4,3)");
            statement.executeUpdate("INSERT INTO progress VALUES (5,4,4,5)");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM students.students WHERE id in (SELECT student_id FROM students.progress WHERE math = 3);");
            while (resultSet.next()){
                String firstName = resultSet.getString("firstname");
                System.out.println(firstName + " has 3 in math");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
