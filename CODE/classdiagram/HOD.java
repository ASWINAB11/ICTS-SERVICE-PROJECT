package classdiagram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class HOD implements Login{
	private String fname,lname,id,dept,dist,sem,dob,add;
	public int add(String first_name,String last_name, String id,String department,String district ,String sem, String dob,String adress)
	{
		fname = first_name;
		lname = last_name;
		this.id = id;
		dept = department;
		dist = district;
		this.sem = sem;
		this.dob= dob;
		add = adress;
		try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO addstudent values('" + fname + "','" + lname  + "','" +this.id + "','" +dept+"','" + dist+"','" + this.sem+ "','" + this.dob +"','" + add+ "')";
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
	public int add(String first_name,String last_name, String id,String department,String divadvisor,String dob,String district)
	{
			try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO addfaculty values('" + first_name + "','" + last_name  + "','" +id + "','" +department+"','" + divadvisor+"','" + dob +"','" + district+ "')";
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
	public String approve_Request(String a1, String a2)
	{
		String s = "Update requestapproval set status='"+a1+"'where id = '"+a2+"'";
		return s;
	}
	public int request_service(String first_name,String last_name, String id,String service,String department,String status)
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
	public int login(String id)
	{
		if(id.startsWith("HOD"))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	

}
