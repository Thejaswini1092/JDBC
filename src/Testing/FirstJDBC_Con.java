package Testing;
import java.sql.*;

public class FirstJDBC_Con {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FirstJDBC_Con obj = new FirstJDBC_Con();
		//obj.doFirst_JDBC_Connection();
		obj.changeMobileNumber(335588, 3);
	}
	//public void doFirst_JDBC_Connection() {
	public void changeMobileNumber(int MN,int Roll) {
		
		try {
			//First load the mysql Driver
		//Class.forName("com.mysql.jdbc.Driver\n");
		//To do the connection
		 Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","root");
		 if(conn!=null) {
             System.out.println("Connection Success");
         }
         else
             System.out.println("Connection Failure");
         //Create statement and execute the Query ..
         Statement STMT = conn.createStatement();
         //create Database
         //STMT.execute("Create database Google;");
         
        //System.out.println("Database Creation is Done!");
        // STMT.execute("Drop database Google;");
         
         //System.out.println("Database Deleted !");
         //STMT.execute("Create database Google;");
         
         //System.out.println("Database Creation is Done!");
        STMT.execute("use Google;");
        /* STMT.execute("create table Students(Roll INT NOT NULL,"
                 + "Age INT NOT NULL, "
                 + "Mobile INT NOT NULL, "
                 + "FirstName varchar(255), "
                 + "LastName varchar(255) );");
         System.out.println("Table Creation is Done!");
        STMT.execute("insert into Students values(3,5,98202387,'David','Jacob');");
        STMT.execute("insert into Students values(4,7,98802787,'Cheryl','Joe');");
        STMT.execute("insert into Students values(5,9,98802317,'Sonali','Agarwal');");
        STMT.execute("insert into Students values(6,8,98802337,'Ram','Charan');");
        STMT.execute("insert into Students values(7,12,98805387,'Rishab','Shetty');");
        System.out.println("Table data insertion done");*/
        
        STMT.execute("update Students set Mobile = '"+MN+"' where Roll='"+3+"'");
        System.out.println("Table data Updation done");
        
        
		}catch (Exception e) {
			// TODO: handle exception
		}{
			
		}
		
	}

}
