
package helper;

import java.sql.Connection;
import java.sql.DriverManager;


public class Helper {
    public static Connection ketnoi(String database){
        try {
            String user = "sa";
            String password = "123456";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=FPL_DT";
            Connection cn = DriverManager.getConnection(url, user, password);
            return cn;
        }catch (Exception e){
              throw new RuntimeException(e);
        }
    }
    
}
