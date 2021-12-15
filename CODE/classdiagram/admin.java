package classdiagram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class admin implements Login{
	private String name;
	private String id;
	public static int count;
	public int add(String stf_id,String stf_name, String srv_id,int paym,String srv_name,String phn)
	{
			try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO staff values('" + stf_id + "','" + stf_name  + "','" + srv_id + "','" + paym +"','" + srv_name+"','" + phn+ "')";
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

	public int add(String service_id,String service_name)
	{
		try {
			Connection c =null;
			Class.forName("org.postgresql.Driver");
	        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123");
	        String query = "INSERT INTO service values('" + service_id + "','" + service_name + "')";
	        Statement sta = c.createStatement();
            int x = sta.executeUpdate(query);
            c.close();
            return x;
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		return 0;
	}
	public int assign_staff(String staf_id,String serv_id)
	{
		try {
			Connection c =null;
			Class.forName("org.postgresql.Driver");
	        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123");
	        String query = "INSERT INTO has_a values('" + staf_id + "','" + serv_id + "')";
	        Statement sta = c.createStatement();
            int x = sta.executeUpdate(query);
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
		if(id.startsWith("ADM"))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
