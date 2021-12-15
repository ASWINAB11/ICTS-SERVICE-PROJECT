package classdiagram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class staff implements Login{
	service s;
	private String staff_name;
	private String staff_id;
	public int modify_staff(String stf_id, String stf_name, String srv_id , int paym, String srv_name, String phn) {
		try {
			Connection cl = null;
			Class.forName("org.postgresql.Driver");
	        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
	        String sql = "UPDATE staff SET staff_name='"+stf_name+"',service_id='"+srv_id+"',payment='"+paym+"',service='"+srv_name+"',phn_no='"+phn+"' WHERE staff_id='"+stf_id+"'";
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
	public String display_details() {
		String s = "Select * from staff";
		return s;
	}
	public int login(String id)
	{
		if(id.startsWith("STF"))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	

}
