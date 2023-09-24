package OCP.P1;

import java.sql.*;

public class Question53Test {
    public static void main(String[] args) throws SQLException {
        String var1 = "jdbc:derby:zoo;create=true";
        Connection var2 = DriverManager.getConnection(var1);
        String var3 = "SELECT id FROM employees";

        try {
            Statement var4 = var2.createStatement();

            try {
                ResultSet var5 = var4.executeQuery(var3);
                var4.executeQuery("SELECT id FROM customer");

                while(var5.next()) {
                    System.out.println("Employee ID: " + var5.getInt("id"));
                }
            }
            catch (Throwable var8) {
                var8.printStackTrace();
                if (var4 != null) {
                    try {
                        var4.close();
                    } catch (Throwable var7) {
                        var8.addSuppressed(var7);
                    }
                }

                throw var8;
            }


            if (var4 != null) {
                var4.close();
            }

        } catch (Exception var9) {
            var9.printStackTrace();
            System.out.println("Error");
        }

        System.out.println("Thoaikx");
    }
    }
