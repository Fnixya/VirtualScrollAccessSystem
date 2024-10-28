package richardlab21g01project2.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * temp
 * this is shit, we should use sqlite
 */
public class MySQLServerStartup {
    public static void run() {
        try {
            // Define the command to start MySQL
            String command = "net start MySQL";
            
            // Execute the command
            Process process = Runtime.getRuntime().exec(command);
            
            // Capture and display any output or errors (optional)
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
            System.out.println("MySQL Server started successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}