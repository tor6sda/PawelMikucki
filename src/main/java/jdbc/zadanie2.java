package jdbc;

import java.sql.*;
public class zadanie2 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/shop?serverTimezone=CET";
        String user = "root";
        String password = "test";
        String query = "select * from address where add_city like \"%\"?\"%\";";
        try(Connection connection = DriverManager.getConnection(url, user, password); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, "Paris");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("ADD_ID");
                String street = resultSet.getString("ADD_STREET");
                String city = resultSet.getString("ADD_CITY");
                System.out.println("Address ID: " + id + " Street: " + street + " City: " + city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
