import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteQuery {
    public static void main(String[] args) {
        try {
            // JDBC version 4.0 (Java 6 and above), the JDBC API automatically loads the driver

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "root");
            PreparedStatement pst = con.prepareStatement("delete from bookstore where id=?");
            pst.setInt(1, 3);
            int result = pst.executeUpdate();
            System.out.println("result: " + result);
            pst.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
