import java.sql.*;

public class CreateQuery {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/book";
    // Database credentials
    static final String USERNAME = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            System.out.println("Registering JDBC driver...");
            // Step 1: Register JDBC driver
            // Class.forName(JDBC_DRIVER);
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully...");

            connection.setAutoCommit(false);//disable auto commit
            // Step 3: Create statement and execute query
            statement = connection.createStatement();
            String retrieveSql = "SELECT * FROM bookstore WHERE id = 1";

            // Execute query
            System.out.println("Executing query...");
            resultSet = statement.executeQuery(retrieveSql);

            // Step 4: Process the result set
            while (resultSet.next()) {
                // Assuming your "bookstore" table has columns: id, title, author, price
                int id = resultSet.getInt("id");
                String title = resultSet.getString("author");
                String author = resultSet.getString("book_name");
                double price = resultSet.getDouble("price");

                System.out.println("ID: " + id);
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Price: $" + price);
            }
            connection.commit();

        } catch (SQLException ex) {
            System.out.println("SQL Exception: " + ex.getMessage());
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage() + " " + ex.getStackTrace());
        } finally {
            // Step 5: Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException se) {
                System.out.println("SQL Exception during closing: " + se.getMessage());
            }
            System.out.println("...ended...");
        }
    }
}
