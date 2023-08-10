package OCP.P7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Question29NotClear {
    static Connection newConnection = null;
    public static Connection getDBConnection() throws SQLException {
        String dbURL = "jdbc:derby:codejava/webdb;create=true";
        try (
            Connection con = DriverManager.getConnection(dbURL);) {
            newConnection = con;
        }//resource are closed at this point
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
        //Executing the query
        String query = "CREATE TABLE Employees( "
                + "Id INT NOT NULL GENERATED ALWAYS AS IDENTITY, "
                + "Name VARCHAR(255), "
                + "Salary INT NOT NULL, "
                + "Location VARCHAR(255), "
                + "PRIMARY KEY (Id))";
        getDBConnection();
        Statement st = newConnection.createStatement();
       // st.executeUpdate(query);
    }
}
   /* A. The program executes successfully and the STUDENT table is updated with one record.
        B. The program executes successfully and the STUDENT table is NOT updated with any record.
        C. A SQLException is thrown as runtime.
        D. A NullPointerException is thrown as runtime.  answer is D*/
/*
    Given the structure of the STUDENT table:
        Student (id INTEGER, name VARCHAR)
        Given:
public class Test {
    static Connection newConnection =null;
    public static Connection get DBConnection () throws SQLException {
    try (Connection con = DriveManager.getConnection(URL, username, password)) {
     newConnection = con;
    }
        return newConnection;
    }
    public static void main (String [] args) throws SQLException { get DBConnection ();
        Statement st = newConnection.createStatement();
        st.executeUpdate("INSERT INTO student VALUES (102, "˜Kelvin')");
    }
}
    Assume that:
        The required database driver is configured in the classpath.
        The appropriate database is accessible with the URL, userName, and passWord exists.
        The SQL query is valid.
        What is the result?
        A. The program executes successfully and the STUDENT table is updated with one record.
        B. The program executes successfully and the STUDENT table is NOT updated with any record.
        C. A SQLException is thrown as runtime. ( This answer)
        D. A NullPointerException is thrown as runtime.*/
