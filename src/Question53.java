import java.sql.*;

public  class Question53 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo;create=true";
        Connection conn = DriverManager.getConnection(url);
        String query = "SELECT id FROM employees";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
        /*    “A ResultSet object is automatically closed when the Statement object that generated it is closed,
                    re-executed, or used to retrieve the next result from a sequence of multiple results.*/

            // The ResultSet will be automatically closed when:
            // 1. stmt.close() is called
            // 2. stmt.executeQuery("another query") is called
            // 3. stmt.getMoreResults() is called for multiple result sets
            stmt.executeQuery("SELECT id FROM customer");
             while (rs.next()) {
               //process the results
                System.out.println("Employee ID: "+ rs.getInt("id"));
               }
         } // here Statement  auto close
        catch (Exception e) {
            e.printStackTrace();
           System.out.println ("Error");
             }
        }

    }

/*
    Given the code fragment:
        9. Connection conn = DriveManager.getConnection(dbURL, userName, passWord);
        10. String query = "SELECT id FROM Employee";
        11. try (Statement stmt = conn.createStatement()) {
        12. ResultSet rs = stmt.executeQuery(query);
        13. stmt.executeQuery("SELECT id FROM Customer");
        14. while (rs.next()) {
        15. //process the results
        16. System.out.println("Employee ID: "+ rs.getInt("id"));
        17. }
        18. } catch (Exception e) {
        19. System.out.println ("Error");
        20. }
        Assume that:
        The required database driver is configured in the classpath.
        The appropriate database is accessible with the dbURL, userName, and passWord exists.
        The Employee and Customer tables are available and each table has id column with a few records and the SQL queries are valid.
        What is the result of compiling and executing this code fragment?
        A. The program prints employee IDs.
        B. The program prints customer IDs.
        C. The program prints Error.
        D. compilation fails on line 13.*/
/*answer is C. Error is: Operation not allowed after ResultSet closed.
        Because after executing the second query, the first one is automatically closed.
        Offical doc explanation:
        “A ResultSet object is automatically closed when the Statement object that generated it is closed, re-executed, or used to retrieve the next result from a sequence of multiple results. ”
        https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html*/
/*
    Java execute multiple SQL statements at once
        The addBatch() command is used to queue the SQL statements and executeBatch() command is used to execute the queued SQL
        statements all at once. In order to use SQL statements in the Java application, ”java. sql” package needs to be imported
        in the beginning of the Java application*/
/*

: ResultSet not open. Operation 'next' not permitted. Verify that autocommit is off.
        17

        The problem is that you have closed your query before reading your resultset. Closing the query, closes the resultset,
        hence why you get the "ResultSet not open" error. You should close the query right at the end, in a finally block:*/
