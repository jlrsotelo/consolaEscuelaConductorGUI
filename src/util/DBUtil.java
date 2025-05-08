package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static constants.GlobalConstants.PASSWORD;
import static constants.GlobalConstants.USER;
import static constants.GlobalConstants.URL;

public class DBUtil {
    public Connection conectar() throws SQLException {
        try {
            Connection cn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection ok");
            return cn;
        }catch (SQLException e){
            throw e;
        }
    }
}
