package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBConnection {
    private static Connection conn;

    private DBConnection() {
    }



    public static Connection getConnection() throws ClassNotFoundException, SQLException {


        try {
            if( conn == null || conn.isClosed() )
            {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testbudget",
                        "root",
                        "Tharu724*");

            }
        }
        catch (ClassNotFoundException  e) {

            e.printStackTrace();
        }


        return conn;
    }

    public static void closeConnection(PreparedStatement preparedStatement , Connection conn) {
        try {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            if(conn != null) {
                conn.close();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
