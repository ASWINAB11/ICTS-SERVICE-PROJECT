package classdiagram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class admin implements Login{
	private String name,srvid,srvname,phno,id;
	private int pay;
	final String ps = "admin123";
	public int add(String stf_id,String stf_name, String srv_id,int paym,String srv_name,String phn)
	{
		name = stf_id;
		srvid = stf_name;
		srvname = srv_name;
		phno = phn;
		id = stf_id;
		pay = paym;
		try {
				Connection cl = null;
				Class.forName("org.postgresql.Driver");
		        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
		        String sql = "INSERT INTO staff values('" + id + "','" + name  + "','" + srvid + "','" + pay +"','" + srvname+"','" + phno+ "')";
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
		id = service_id;
		srvname = service_name;
		try {
			Connection c =null;
			Class.forName("org.postgresql.Driver");
	        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123");
	        String query = "INSERT INTO service values('" + id + "','" + srvname + "')";
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
		id = staf_id;
		srvid = serv_id;
		try {
			Connection c =null;
			Class.forName("org.postgresql.Driver");
	        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123");
	        String query = "INSERT INTO has_a values('" + id + "','" + srvid + "')";
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
	public String Assign_service()
	{
		
			String query="Select * from requestservice";
			return query;
	}
	public String Assign_staff(String a1, String a2)
	{
		String s = "Update requestservice set staff='"+a1+"'where id = '"+a2+"'";
		return s;
	}
	public boolean checkpassword(String p)
	{
		if(p.equals(ps))
		{
			return true;
		}
		return false;
	}

}
