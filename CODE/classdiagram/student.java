package classdiagram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class student implements Login {
	private String department;
	private String student_address;
	public int request(String first_name,String last_name,String id,String service,String department) {
		try {
			Connection c=null;
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres","Aswin123");
			String query="INSERT INTO requestapproval values('"+first_name+"','"+last_name+"','"+id+"','"+service+"','"+department+"')";
			Statement sta=c.createStatement();
			int x= sta.executeUpdate(query);
			c.close();
			return x;
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		return 0;
	}
	public int modify_student(String id,String first_name,String last_name,String department,String district,String division,String sem,String dob,String street) {
		try {
			Connection c=null;
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres", "Aswin123");
			String query="UPDATE student SET first_name='"+first_name+"',last_name='"+last_name+"',department='"+department+"',district='"+district+"',division='"+division+"',sem='"+sem+"',dob='"+dob+"',adress='"+street+"' WHERE id='"+id+"'";
			Statement sta=c.createStatement();
			int x= sta.executeUpdate(query);
			c.close();
			return x;
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		return 0;
		
	}

	public int request(String first_name, String last_name, String id, String service, String department,String status) {
		try {
			Connection c=null;
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres","Aswin123");
			String query="INSERT INTO requestservice values('"+first_name+"','"+last_name+"','"+id+"','"+service+"','"+department+"','"+status+"')";
			Statement sta=c.createStatement();
			int x= sta.executeUpdate(query);
			c.close();
			return x;
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		return 0;
	}
	public int login(String id)
	{
		if(id.startsWith("STD"))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
