package majere.raistlin.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBMFactory {
    private static ResultDBM dbm;
    private static Connection dbcon;
    private static DBMFactory instance;

    static {
        try {
            dbcon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:FREE", "SYS", "test123");
            if (dbcon != null) {
                System.out.println("Connected to DB!");
            } else {
                System.out.println("Issues with connection to DB!");
            }
        } catch(SQLException e){
            System.out.println("SQLException вызвался");
        } catch(Exception e){
            System.out.println("Some Exception invoked while connecting to DB");
        }
    }

    public static DBMFactory getInstance(){
        if(instance == null){
            instance = new DBMFactory();
        }
        return instance;
    }

    public ResultDBM getResultDBM(){
        if(dbm == null){
            dbm = new ResultDBMImplementation(dbcon);
        }
        return dbm;
    }



}
