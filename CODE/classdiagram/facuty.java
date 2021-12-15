package classdiagram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class facuty implements Login {
	private String faculty_name;
	private String faculty_id;
	private String department;
	public int request(String first_name,String last_name, String id,String service,String department,String status)
	{
			try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO requestservice values('"+first_name+"','" +last_name+ "','" +id+ "','" +service+"','" + department+"','" + status+ "')";
		        Statement p = cl.createStatement();
                int y = p.executeUpdate(sql);
                cl.close();
                return y;

			}
			catch(Exception e1){
				e1.printStackTrace();
			}
			return 0;
	}
	public int request(String first_name,String last_name, String id,String service,String department)
	{
			try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO requestapproval values('" +first_name+ "','" +last_name+ "','" +id+ "','" + service +"','" + department+ "')";
		        Statement p = cl.createStatement();
                int y = p.executeUpdate(sql);
                cl.close();
                return y;

			}
			catch(Exception e1){
				e1.printStackTrace();
			}
			return 0;
	}
	public int add_student(String first_name,String last_name, String id,String department,String district ,String sem, String dob,String adress)
	{
			try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO addstudent values('" + first_name + "','" + last_name  + "','" +id + "','" +department+"','" + district+"','" + sem+ "','" + dob +"','" + adress+ "')";
		        Statement p = cl.createStatement();
                int y = p.executeUpdate(sql);
                cl.close();
                return y;

			}
			catch(Exception e1){
				e1.printStackTrace();
			}
			return 0;
	}
	
	public int login(String id)
	{
		if(id.startsWith("FAC"))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
