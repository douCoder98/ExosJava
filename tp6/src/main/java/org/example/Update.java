package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    public static void main(String[] args) {
        try {
            Connection conn = ConnectionDb.connectionDb();

            String strUpdate = "UPDATE Acces SET statut='Dev' WHERE id=1";
            Statement stUpdate = conn.createStatement();
            stUpdate.executeUpdate(strUpdate);

            String strSelect = "SELECT * FROM Acces;";
            Statement stSelect = conn.createStatement();
            ResultSet users = stSelect.executeQuery(strSelect);

            while (users.next()) {
                System.out.println("Prenom: " + users.getString("prenom") + ", Login: " + users.getString("login") + ", Statut: " + users.getString("statut") + ", Age: " + users.getString("age"));
            }
            conn.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
