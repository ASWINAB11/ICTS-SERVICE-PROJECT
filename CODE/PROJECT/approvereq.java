package PROJECT;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionListener;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import classdiagram.HOD;

public class approvereq extends JFrame {
	HOD hod9 = new HOD();
	private JPanel reqappro;
	private JTextField idtxt;
	private JTextField statustxt;
	private JTable table;
	public approvereq() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		reqappro = new JPanel();
		setContentPane(reqappro);
		reqappro.setLayout(null);
		
		JLabel reqhead = new JLabel("REQUESTS FOR APPROVAL");
		reqhead.setFont(new Font("Times New Roman", Font.BOLD, 18));
		reqhead.setBounds(301, 10, 262, 62);
		reqappro.add(reqhead);
		
		JButton Acceptbtn = new JButton("ACCEPT");
		Acceptbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection c=null;
					Class.forName("org.postgresql.Driver");
					c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres", "Aswin123");
					String a1 = statustxt.getText();
					String a2 = idtxt.getText();
					String query=hod9.approve_Request(a1,a2);
					PreparedStatement pat=c.prepareStatement(query);
					pat.execute();
					c.close();
					}
					catch(Exception e1){
					e1.printStackTrace();
					}
			}
		});
		Acceptbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		Acceptbtn.setBounds(121, 368, 97, 42);
		reqappro.add(Acceptbtn);
		
		JButton bckbtn = new JButton("BACK");
		bckbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hodLog backbtn = new hodLog();
				backbtn.setVisible(true);
				dispose();
			}
		});
		bckbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		bckbtn.setBounds(626, 368, 107, 42);
		reqappro.add(bckbtn);
		
		JLabel id = new JLabel("ID");
		id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		id.setBounds(10, 177, 48, 28);
		reqappro.add(id);
		
		idtxt = new JTextField();
		idtxt.setBounds(117, 179, 164, 30);
		reqappro.add(idtxt);
		idtxt.setColumns(10);
		
		JLabel status = new JLabel("STATUS");
		status.setFont(new Font("Tahoma", Font.PLAIN, 16));
		status.setBounds(10, 243, 71, 27);
		reqappro.add(status);
		
		statustxt = new JTextField();
		statustxt.setBounds(119, 240, 162, 30);
		reqappro.add(statustxt);
		statustxt.setColumns(10);
		
		JButton viewbtn = new JButton("VIEW");
		viewbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				try {
				Connection c=null;
				Class.forName("org.postgresql.Driver");
				c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres", "Aswin123");
				String query="Select * from requestapproval";
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
		viewbtn.setBounds(361, 368, 107, 42);
		reqappro.add(viewbtn);
		
		table = new JTable();
		table.setBounds(311, 82, 483, 269);
		reqappro.add(table);
	}
}