package richardlab21g01project2.utils.repositories;
import richardlab21g01project2.auth.Auth;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.sql.*;


public class AccountRepository {
    private static final String DATABASE_PATH = Paths.get("src/main/resources/db", "accounts.db").toString();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Change account information
     */
    public static boolean change(String username, String property, String value) {
        // List<String> userData = getAccountByUsername(username);
        // if (userData == null) return false;
        // else if (property.equals("username")) {
        //     userData.set(0, value);
        //     updateAccount(userData);
        //     return true;
        // }
        // else if (property.equals("email")) {
        //     userData.set(2, value);
        //     updateAccount(userData);
        //     return true;
        // }
        return false;
    }

    /**
     * Change accounts password
     */
    public static boolean changePassword(String username, String oldPassword, String newPassword) {
        // List<String> userData = getAccountByUsername(username);
        // if (userData == null) return false;
        // else if (Auth.verifyPassword(oldPassword, userData.get(1))) {
        //     userData.set(1, Auth.hashPassword(newPassword));
        //     updateAccount(userData);
        //     return true;
        // }
        return false;
    }

    public static List<String> getAccountByUsername(String username) {
        // try {
        //     File f = new File(Auth.class.getClassLoader().getResource("db/users.txt").getFile());
        //     try (Scanner s = new Scanner(f)) {
        //         while (s.hasNextLine()) {
        //             String data = s.nextLine();
        //             List<String> aList = Arrays.asList(data.split(","));

        //             if (aList.isEmpty()) {
        //                 return null;
        //             }
        //             else if (aList.get(0).equals(username)) {
        //                 return aList;
        //             }
        //         }
        //         s.close();
        //     }
        // } 
        // catch (FileNotFoundException e) {
        //     System.out.println("An error occurred.");
        // }
        return null;
    }

    public static List<String> getAccountByEmail(String email) {
        // try {
        //     File f = new File(Auth.class.getClassLoader().getResource("db/users.txt").getFile());
        //     try (Scanner s = new Scanner(f)) {
        //         while (s.hasNextLine()) {
        //             String data = s.nextLine();
        //             List<String> aList = Arrays.asList(data.split(","));

        //             if (aList.isEmpty()) {
        //                 return null;
        //             }
        //             else if (aList.get(2).equals(email)) {
        //                 return aList;
        //             }
        //         }
        //         s.close();
        //     }
        // } 
        // catch (FileNotFoundException e) {
        //     System.out.println("An error occurred.");
        // }
        return null;
    }

    public static int getNextId() {
        return 0;
    }

    /**
     * Checks if an account has admin permissions
    */
    public static boolean isAdmin(String username) {
        List<String> userData = AccountRepository.getAccountByUsername(username);
        if (userData == null) return false;
        else return userData.get(3).equals("ADMIN");
    }

 
    // public static void newAccount() {
    //     String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
    //     String USER = "guest";
    //     String PASS = "guest123";
    //     String QUERY = "SELECT id, first, last, age FROM Employees";
    //     // Open a connection
    //     try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    //        Statement stmt = conn.createStatement();
    //        ResultSet rs = stmt.executeQuery(QUERY);) {
    //        // Extract data from result set
    //        while (rs.next()) {
    //           // Retrieve by column name
    //           System.out.print("ID: " + rs.getInt("id"));
    //           System.out.print(", Age: " + rs.getInt("age"));
    //           System.out.print(", First: " + rs.getString("first"));
    //           System.out.println(", Last: " + rs.getString("last"));
    //        }
    //     } catch (SQLException e) {
    //        e.printStackTrace();
    //     } 
    // }
}

