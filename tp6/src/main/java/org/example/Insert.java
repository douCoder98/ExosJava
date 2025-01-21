package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        try {
            Connection conn = ConnectionDb.connectionDb();

            String strInsert = "INSERT INTO Acces"
                    + "(prenom, login, password, statut, age) "
                    + "VALUES ('Toto', 'toto', 'password', 'Eleve', 20);";
            Statement stAddUser = conn.createStatement();
            stAddUser.executeUpdate(strInsert);
            conn.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
