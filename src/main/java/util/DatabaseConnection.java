package util;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements Closeable {
    private static DatabaseConnection instance;
    private Connection connection;
    String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=CET";
    String user = "root";
    String password = "test";
    public DatabaseConnection() {
        try {
            this.connection = DriverManager.getConnection(url,user,password);
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println("Database Connection Failed");
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null){
            instance = new DatabaseConnection();
        }
        else if (instance.getConnection().isClosed()){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    @Override
    public void close() throws IOException {
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
