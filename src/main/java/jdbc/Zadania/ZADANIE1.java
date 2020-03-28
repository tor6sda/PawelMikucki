package jdbc.Zadania;

import java.sql.*;

public class ZADANIE1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=CET";
        String user = "root";
        String password = "test";
        String query = "SELECT * from user;";
        try(
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.println("User firstname : " +resultSet.getString("USR_FIRSTNAME"));
                System.out.println("User lastname : "+resultSet.getString("USR_LASTNAME"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
