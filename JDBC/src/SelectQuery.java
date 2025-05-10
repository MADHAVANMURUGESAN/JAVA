import java.sql.*;

public class SelectQuery {
    public static void main(String[] args) {
        try {
            // JDBC version 4.0 (Java 6 and above), the JDBC API automatically loads the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "root");
         /*   Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from bookstore where id=3");
            System.out.println("resultSet: " + resultSet);*/
            PreparedStatement preparedStatement = connection.prepareStatement("select * from bookstore where id=?");
            preparedStatement.setString(1, "2");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("author"));
                System.out.println(resultSet.getString("book_name"));
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }
    }
}
