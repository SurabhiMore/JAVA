package javaoop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

/*
 * java.sql ---> java.sql.BLOB,Connection,CallableStatement,CLOB,Date,Driver,DriverManager,PreparedStatements,ResultSet,SQLException,Statements
 * javax.sql
 */

/*
 * 1) Register Driver 2)Create Connection 3)Create Sql Statements 4) Execute SQL Statement 5) Closing Connection
 */
public class JavaJDBC {
	/*"jdbc:mysql://localhost:3306/student"
	 * JDBC : API
	 * mysql : Database Application
	 * localhost : Server name on which MySql is running
	 * 3306 :Port Number
	 * student : Database Name
	 */
	
	private final String DB_URL="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
	private final String DB_USER="root";
	private final String DB_PASSWD="";
	
	void createTable() {
// Loading Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		
// Create Connection	
		try (Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD)){
			String query="create table registration(id integer not null,firstname varchar(255),lastname varchar(255))";
			Statement stmt=con.createStatement();
			stmt.executeLargeUpdate(query);
			System.out.println("Table is Created Sucessfully.....");
			
		} catch (SQLException e) {
						e.printStackTrace();
		}		
	}//createTable()
	
	void insertDataTable() {
		// Loading Driver
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch(ClassNotFoundException e) {e.printStackTrace();}
				
		// Create Connection	
				try (Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD)){
					String query="insert into registration values(101,'Anirudha','Gaikwad')";
					String query1="insert into registration values(102,'Dinesh','Supekar')";
					String query2="insert into registration values(103,'Srija','Deshmikh')";
					Statement stmt=con.createStatement();
					stmt.executeLargeUpdate(query);stmt.executeLargeUpdate(query1);stmt.executeLargeUpdate(query2);
					System.out.println("Insert value into Table is Sucessfully.....");
					
				} catch (SQLException e) {
								e.printStackTrace();
				}		
	}//inserDataTable()
	
	
	void fetchDataFromTable() {
		// Loading Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		
// Create Connection	
		try (Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD)){
			String query="select * from registration";
			Statement stmt=con.createStatement();
			ResultSet rs=	stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("ID : "+rs.getInt("id"));
				System.out.println("First Name : "+rs.getString("firstname"));
				System.out.println("Last Name : "+rs.getString("lastname"));
			}
			System.out.println(" value fetch from Table is Sucessfully.....");
			
		} catch (SQLException e) {
						e.printStackTrace();
		}	
	}//fetchDataFromTable()

	public static void main(String[] args) {
	
		JavaJDBC obj= new JavaJDBC();
		//obj.createTable();
		//obj.insertDataTable();
		//obj.fetchDataFromTable();
		//obj.updateTableData();
		//obj.delTableData();
		obj.insertDataTable_PreparedStatement(); 
		
	}//main()
	
	void updateTableData() {
		// Loading Driver
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch(ClassNotFoundException e) {e.printStackTrace();}
				
		// Create Connection	
				try (Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD)){
					String query="update registration set firstname='Aniket' where id in (101,102)";
					Statement stmt=con.createStatement();
					stmt.executeLargeUpdate(query);
					System.out.println(" value update in Table is Sucessfully.....");
					
					String query1="select * from registration";
					ResultSet rs=	stmt.executeQuery(query1);
					while(rs.next()) {
						System.out.println("ID : "+rs.getInt("id"));
						System.out.println("First Name : "+rs.getString("firstname"));
						System.out.println("Last Name : "+rs.getString("lastname"));
					}
					System.out.println(" value fetch from Table is Sucessfully.....");
					
				} catch (SQLException e) {
								e.printStackTrace();
				}	
	}//updateTableData()
	
	
	void delTableData() {
		// Loading Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {e.printStackTrace();}
		
// Create Connection	
		try (Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD)){
			String query="delete from registration where id=102";
			Statement stmt=con.createStatement();
			stmt.executeLargeUpdate(query);
			System.out.println(" delete table row Sucessfully.....");
			
			String query1="select * from registration";
			ResultSet rs=	stmt.executeQuery(query1);
			while(rs.next()) {
				System.out.println("ID : "+rs.getInt("id"));
				System.out.println("First Name : "+rs.getString("firstname"));
				System.out.println("Last Name : "+rs.getString("lastname"));
			}
			System.out.println(" value fetch from Table is Sucessfully.....");
			
		} catch (SQLException e) {
						e.printStackTrace();
		}
	}//delTableData() 
	
	
	void insertDataTable_PreparedStatement() {
		// Loading Driver
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				}
				catch(ClassNotFoundException e) {e.printStackTrace();}
				try (Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD)){	
					PreparedStatement stmt=con.prepareStatement("insert into registration values(?,?,?)");
					stmt.setInt(1, 104);
					stmt.setString(2,"Dinesh4");
					stmt.setString(3,"Supekar4");
					int i=stmt.executeUpdate();
					System.out.println(i+" record inserted...");
					
					String query1="select * from registration";
					ResultSet rs=	stmt.executeQuery(query1);
					while(rs.next()) {
						System.out.println("ID : "+rs.getInt("id"));
						System.out.println("First Name : "+rs.getString("firstname"));
						System.out.println("Last Name : "+rs.getString("lastname"));
					}
					System.out.println(" value fetch from Table is Sucessfully.....");
					
				} catch (SQLException e) {
					e.printStackTrace();
	}
	}//insertDataTable_PreparedStatement()

}//class
