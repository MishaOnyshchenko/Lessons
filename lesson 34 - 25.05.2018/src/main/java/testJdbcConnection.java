/**
 * Created by java on 25.05.2018.
 */
public class testJdbcConnection {

    private static Conection connection = null;

    public static void main(String[] args) {

    }

    private static Connection createConnection() {
        Connection connection = null;
        System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/test", "postgres",
                    "postgres");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? Include in your library path!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        System.out.println("PostgreSQL JDBC Driver Registered!");
        return connection;

    }
}
