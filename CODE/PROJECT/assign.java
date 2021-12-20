package PROJECT;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
import javax.swing.JTable;
import classdiagram.admin;
import javax.swing.JTextField;
public class assign extends JFrame {
	admin a = new admin();
	private JPanel reqappro;
	private JTable table;
	private JTextField idtxt;
	private JTextField stafftxt;
	public assign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		reqappro = new JPanel();
		setContentPane(reqappro);
		reqappro.setLayout(null);
		
		JLabel reqhead = new JLabel("ASSIGN STAFF");
		reqhead.setFont(new Font("Times New Roman", Font.BOLD, 18));
		reqhead.setBounds(344, 10, 163, 62);
		reqappro.add(reqhead);
		
		JButton bckbtn = new JButton("BACK");
		bckbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminpage backbtn = new adminpage();
				backbtn.setVisible(true);
				dispose();
			}
		});
		bckbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		bckbtn.setBounds(687, 393, 107, 42);
		reqappro.add(bckbtn);
		
		JButton viewbtn = new JButton("VIEW");
		viewbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Connection c=null;
				Class.forName("org.postgresql.Driver");
				c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres", "Aswin123");
				String query=a.Assign_service();
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
		viewbtn.setBounds(378, 393, 107, 42);
		reqappro.add(viewbtn);
		
		table = new JTable();
		table.setBounds(311, 82, 483, 269);
		reqappro.add(table);
		
		JLabel id = new JLabel("ID:");
		id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		id.setBounds(41, 147, 45, 13);
		reqappro.add(id);
		
		idtxt = new JTextField();
		idtxt.setBounds(113, 142, 163, 27);
		reqappro.add(idtxt);
		idtxt.setColumns(10);
		
		JLabel staff = new JLabel("STAFF:");
		staff.setFont(new Font("Tahoma", Font.PLAIN, 16));
		staff.setBounds(41, 231, 76, 20);
		reqappro.add(staff);
		
		stafftxt = new JTextField();
		stafftxt.setColumns(10);
		stafftxt.setBounds(113, 224, 163, 27);
		reqappro.add(stafftxt);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection c=null;
					Class.forName("org.postgresql.Driver");
					c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres", "Aswin123");
					String a1 = stafftxt.getText();
					String a2 = idtxt.getText();
					String query=a.Assign_staff(a1,a2);
					PreparedStatement pat=c.prepareStatement(query);
					pat.execute();
					c.close();
					}
					catch(Exception e1){
					e1.printStackTrace();
					}
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(97, 393, 107, 42);
		reqappro.add(btnUpdate);
	}
}