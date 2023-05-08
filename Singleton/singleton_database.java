import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;




public class singleton_database{
    private static singleton_database instance = null;
    private Connection connection = null;
    private singleton_database(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static singleton_database getInstance(){
        if(instance == null){
            instance = new singleton_database();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
}