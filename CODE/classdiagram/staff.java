package classdiagram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class staff implements Login{
	service s;
	private String stff_name, stff_id,service_id,service_name,phone_no;
	private  int pay;
	public int modify_staff(String stf_id, String stf_name, String srv_id , int paym, String srv_name, String phn) {
		stff_name=stf_name;
		stff_id=stf_id;
		service_id=srv_id;
		service_name=srv_name;
		phone_no=phn;
		pay=paym;
		try {
			Connection cl = null;
			Class.forName("org.postgresql.Driver");
	        cl = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample", "postgres", "Aswin123"); 
	        String sql = "UPDATE staff SET staff_name='"+stff_name+"',service_id='"+service_id+"',payment='"+pay+"',service='"+service_name+"',phn_no='"+phone_no+"' WHERE staff_id='"+stff_id+"'";	        Statement p = cl.createStatement();
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
	public String view_request()
	{
		
			String query="Select * from requestservice";
			return query;
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
