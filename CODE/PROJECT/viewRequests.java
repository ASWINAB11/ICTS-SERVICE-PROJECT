package PROJECT;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.sql.DriverManager;
import java.awt.event.ActionListener;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import classdiagram.staff;
public class viewRequests extends JFrame {
	staff a = new staff();
	private JPanel reqappro;
	private JTable table;
	public viewRequests() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		reqappro = new JPanel();
		setContentPane(reqappro);
		reqappro.setLayout(null);
		
		JLabel reqhead = new JLabel("VIEW REQUESTS");
		reqhead.setFont(new Font("Times New Roman", Font.BOLD, 18));
		reqhead.setBounds(344, 10, 163, 62);
		reqappro.add(reqhead);
		
		JButton bckbtn = new JButton("BACK");
		bckbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Staff backbtn = new Staff();
				backbtn.setVisible(true);
				dispose();
			}
		});
		bckbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		bckbtn.setBounds(537, 393, 107, 42);
		reqappro.add(bckbtn);
		
		JButton viewbtn = new JButton("VIEW");
		viewbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Connection c=null;
				Class.forName("org.postgresql.Driver");
				c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres", "Aswin123");
				String query=a.view_request();
				Statement sta=c.createStatement();
				ResultSet rs =sta.executeQuery(query);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				c.close();
				}
				catch(Exception e1){
				e1.printStackTrace();
				}
				
			}
		});
		viewbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		viewbtn.setBounds(224, 393, 107, 42);
		reqappro.add(viewbtn);
		
		table = new JTable();
		table.setBounds(188, 82, 483, 269);
		reqappro.add(table);
	}
}