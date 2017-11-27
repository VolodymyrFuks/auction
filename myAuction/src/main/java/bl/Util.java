//package bl;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Util {
//    private static final String DB_DRIVER ="";
//    private static final String DB_URL ="";
//    private static final String DB_USERNAME ="";
//    private static final String DB_PASSWORD ="";
//    public Connection getConnection(){
//    Connection connection = null;
//        try {
//            Class.forName(DB_DRIVER);
//            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//            System.out.println("Connection is done");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Connection is failed");
//            e.printStackTrace();
//        } catch (SQLException e) {
//            System.out.println("Connection is failed");
//            e.printStackTrace();
//        }
//
//return connection;
//    }
//}
