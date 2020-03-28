package jdbc;

import util.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class przyklad5 {
    public static void main(String[] args) {
        String sqlInsert = "Insert into country "+
                "(CO_NAME, CO_ALIAS) "+
                "VALUES (?,?)";
        Country[] countries = {new Country("Albania", "AL"),
                new Country("China", "CH"),
                new Country("Ukraine", "UE")};
        try(PreparedStatement prpStatement = DatabaseConnection.getInstance().getConnection().prepareStatement(sqlInsert)) {
            DatabaseConnection.getInstance().getConnection().setAutoCommit(false);
            for (int i=0; i<countries.length; i++){
                prpStatement.setString(1, countries[i].getCountryName());
                prpStatement.setString(2, countries[i].getCountryAlias());
                prpStatement.execute();
            }
            DatabaseConnection.getInstance().getConnection().commit();
        } catch (SQLException e) {
            try {
                DatabaseConnection.getInstance().getConnection().rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}

