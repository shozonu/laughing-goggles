import java.util.*;
import java.sql.*;
/**
Download latest bin distribution from:
http://db.apache.org/derby/releases/release-10.14.2.0.cgi

Extract folder to where ever you want, such as ...\Program Files\Apache\

Environment Variables:
(your actual directory paths may vary)
(if variable does not exist, make it)
JAVA_HOME -> ...\Java\jdk-xx.x.x
DERBY_HOME -> ...\Apache\db-derby-xx.xx.x.x-bin
CLASSPATH -> ...%DERBY_HOME%\lib\derby.jar;%DERBY_HOME%\lib\derbytools.jar;...
Path ->
    ...
    %JAVA_HOME%\bin
    %DERBY_HOME%\bin
    ...
**/
public class UnpaidOrderLookup {
    public static void main(String[] args) {
        // Create a named constant for the URL.
        // NOTE: This value is specific for Java DB.
        final String DB_URL = "jdbc:derby:CoffeeDB";
        final boolean debug = false;
        final boolean manual = false;
        String rx = "^\\d+$";
        Scanner s = new Scanner(System.in);
        try {
            Connection conn = DriverManager.getConnection(DB_URL);
            while(true) {
                if(manual) {
                    rx = new String(".*");
                    System.out.print("$ ");
                }
                else System.out.print("enter customer: ");
                String input = s.nextLine();
                if(input.matches("end")) {
                    //if string is "end"
                    break;
                }
                if(!input.matches(rx)) {
                    //if string does not represent a number
                    System.out.println("Customer " + input + " does not exist");
                }
                else {
                    String sqlStatement = new String(
                    "SELECT * FROM UnpaidOrder WHERE CustomerNumber = '" + input + "'");
                    if(manual) sqlStatement = new String(input);

                    Statement stmt = conn.createStatement();
                    ResultSet result = stmt.executeQuery(sqlStatement);
                    ResultSetMetaData meta = result.getMetaData();
                    int numRows = 0;

                    while(result.next()) {
                        numRows++;
                        for(int i = 1; i <= meta.getColumnCount(); i++) {
                            System.out.print(result.getString(i));
                        }
                        System.out.println();
                    }
                    if(manual) System.out.println(numRows + " rows");
                    else if(numRows <= 0) System.out.println("Customer " + input + " does not exist");
                }
            }
            conn.close();
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
