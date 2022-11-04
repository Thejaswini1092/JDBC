package Testing;
import java.sql.*;
public class CreateBankEmpDetails {
	public static void main(String args[]) throws Exception {

	       CreateBankEmpDetails obj = new CreateBankEmpDetails();
	       //obj.create_Bank_Emp_Table();
	       obj.Read_EmpTable_Using_JDBC();

	   }



	 /*  public void create_Bank_Emp_Table(){


	       try{
	           //Class.forName("com.mysql.jdbc.Driver");
	           Connection con= DriverManager.getConnection(
	                   "jdbc:mysql://127.0.0.1:3306","root","Thejarun@91088");
	           //here sonoo is database name, root is username and password
	           Statement stmt=con.createStatement();

	           // Select/Use The Data Base

	           stmt.execute("use BankApplication;");

	           // Create a Table inside the Database ...



	           // Insert Data into the Table ......


	           /*stmt.execute("create table BankEmp" +
	                   "(" +
	                   "EmpId int not null," +
	                   "Mobile double," +
	                   "FName varchar(50)," +
	                   "LName varchar(50)," +
	                   "Email varchar(50)," +
	                   "State varchar(2)," +
	                   "Doj date," +
	                   "Vehicle varchar(200)" +
	                   ");");


	           System.out.println("Table Creation is Successfull ....");*/

	          /* stmt.execute("insert into BankEmp values(2,98202337,'Dane','Morris','dane@gmail.com','AP','2020-05-01','Car'),"
	           		+ "(3,98255387,'Tik','Tok','tiktok@gmail.com','TL','2018-01-01','Bus'),"
	           		+ "(4,91102387,'Saniha','Agarwal','saniha@gmail.com','KA','2015-05-21','Car'),"
	           		+ "(5,98332387,'Cheryl','Jacob','cheryl@gmail.com','KL','2021-08-03','Bus'),"
	           		+ "(6,92302387,'Sam','Jacob','sam@gmail.com','AP','2014-01-10','Bus'),"
	           		+ "(7,94502387,'Bob','Jason','bob@gmail.com','KA','2021-09-01','Car'),"
	           		+ "(8,98202557,'Joe','James','joe@gmail.com','MH','2013-08-01','Bus'),"
	           		+ "(9,98277387,'Davis','James','davis@gmail.com','KA','2021-01-01','Bus'),"
	           		+ "(10,98208987,'Ruby','Mary','ruby@gmail.com','MP','2017-09-01','Car');");
	          

	           con.close();
	       }catch(Exception e){ e.printStackTrace();}*/

	 public void Read_EmpTable_Using_JDBC(){


	       try{
	          // Class.forName("com.mysql.jdbc.Driver");
	           Connection con= DriverManager.getConnection(
	                   "jdbc:mysql://127.0.0.1:3306","root","Thejarun@91088");
	           //here sonoo is database name, root is username and password
	           Statement stmt=con.createStatement();

	           // Select/Use The Data Base

	           stmt.execute("use BankApplication;");



	           ResultSet result = stmt.executeQuery("select EmpId,Mobile,FName,LName,Email from BankEmp;");


	           while (result.next())
	           {
	              /* int emp_ID = result.getInt("EmpId");
	               int Mo_No = result.getInt("Mobile");
	               String FirstName = result.getString("FName");
	               String LastName = result.getString("LName");
	               String Email_ID = result.getString("Email");*/
	        	   int emp_ID = result.getInt(1);
	               int Mo_No = result.getInt(2);
	               String FirstName = result.getString(3);
	               String LastName = result.getString(4);
	               String Email_ID = result.getString(5);

	               System.out.println(emp_ID+":"+Mo_No+":"+FirstName+":"+LastName+":"+Email_ID);
	           }





	           System.out.println("Table Data Addition is Successfull ....");

	           con.close();
	       }catch(Exception e){ e.printStackTrace();}

	   }







	   }



