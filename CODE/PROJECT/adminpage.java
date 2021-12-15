package PROJECT;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminpage extends JFrame{
	private JPanel adminpage1;
	public adminpage() {
		setTitle("ADMIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		adminpage1 = new JPanel();
		setContentPane(adminpage1);
		adminpage1.setLayout(null);
		
		JLabel welcadminlabel = new JLabel("WELCOME ADMIN");
		welcadminlabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		welcadminlabel.setBounds(308, 10, 200, 37);
		adminpage1.add(welcadminlabel);
		
		JButton addservice = new JButton("ADD SERVICE");
		addservice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addservice o = new addservice();
				o.setVisible(true);
				dispose();
			}
		});
		addservice.setBounds(308, 88, 148, 37);
		adminpage1.add(addservice);
		
		JButton AddStaff = new JButton("ADD STAFF");
		AddStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addstaff ob = new addstaff();
				ob.setVisible(true);
				dispose();
			}
		});
		AddStaff.setBounds(308, 161, 148, 37);
		adminpage1.add(AddStaff);
		
		JButton assignstaff = new JButton("ASSIGN SERVICE");
		assignstaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assignstaff obj = new assignstaff();
				obj.setVisible(true);
				dispose();
			}
		});
		assignstaff.setBounds(308, 240, 148, 37);
		adminpage1.add(assignstaff);
		JButton back1 = new JButton("BACK");
		back1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login adminpage = new login();
				adminpage.setVisible(true);
				dispose();
			}
		});
		back1.setBounds(308, 321, 148, 37);
		adminpage1.add(back1);
	}
	
}
