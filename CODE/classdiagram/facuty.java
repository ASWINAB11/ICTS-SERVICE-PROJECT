package classdiagram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class facuty implements Login {
	private String fname,lname,id,service,status, department,district,sem,dob,address;
	public int request(String first_name,String last_name, String id,String service,String department,String status)
	{
		fname = first_name;
		lname = last_name;
		this.id = id;
		this.service = service;
		this.department = department;
		this.status = status;
		try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO requestservice values('"+fname+"','" +lname+ "','" +this.id+ "','" +this.service+"','" + this.department+"','" + this.status+ "')";
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
		fname = first_name;
		lname = last_name;
		this.id = id;
		this.service = service;
		this.department = department;	
		try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO requestapproval values('" +fname+ "','" +lname+ "','" +id+ "','" + this.service +"','" + this.department+ "')";
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
			
		fname = first_name;
		lname = last_name;
		this.id = id;
		this.district = district;
		this.department = department;
		this.sem = sem;
		this.dob = dob;
		address = adress;
		try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO addstudent values('" + fname + "','" + lname  + "','" +id + "','" +department+"','" + this.district+"','" + this.sem+ "','" + this.dob +"','" + address+ "')";
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
