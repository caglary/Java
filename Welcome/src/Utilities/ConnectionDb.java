package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDb {

    public void connectMysql() {

        String computerName = ComputerInfo.getComputerName();
        String computerNameForUbuntu=ComputerInfo.computerNameForUbuntu();
        String computerNameForWindows=ComputerInfo.computerNameForWindows();
        if (computerName.toLowerCase() == computerNameForUbuntu.toLowerCase()) {

            try {

                Connection connectionDb = DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme", "root", "");
                System.out.println("Connected to database...");

            } catch (SQLException exception) {
                System.out.println(exception.getSQLState());
                System.out.println(exception.getNextException());
                System.out.println(exception.getErrorCode());
            } 
        } else if (computerName == computerNameForWindows) {

            try {

                Connection connectionDb = DriverManager.getConnection("jdbc:mysql://localhost:3306/deneme", "root","1234");
                System.out.println("Connected to database...");
            } catch (SQLException exception) {

                System.out.println(exception.getSQLState());
                System.out.println(exception.getNextException());
                System.out.println(exception.getErrorCode());
            } 
        }

    }

}
