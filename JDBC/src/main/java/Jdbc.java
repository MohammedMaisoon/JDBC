package jdbcpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Jdbc {

        public static void main(String[] args) throws Exception{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/"DATABASE Name","YOUR USER NAME,"YOUR PASSWORD");

            Statement stmt=con.createStatement();

            int n=stmt.executeUpdate("Delete from Users where userid=400");

            System.out.println("No of rows deleted...:"+n);


        }
    }

