package PROJECT;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import classdiagram.HOD;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addfacu extends JFrame {
	
	HOD adfac1 = new HOD();

	private JPanel addstd;
	private JTextField fnametxt,idtxt,divadvtxt,dobtxt,lnametxt,departmenttxt,districttxt;
	public addfacu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		addstd = new JPanel();
		setContentPane(addstd);
		addstd.setLayout(null);
		
		JLabel addstudent = new JLabel("ADD FACULTY DETAILS");
		addstudent.setFont(new Font("Times New Roman", Font.BOLD, 18));
		addstudent.setBounds(297, 44, 224, 46);
		addstd.add(addstudent);
		
		JLabel fname = new JLabel("FIRST NAME");
		fname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fname.setBounds(92, 141, 96, 26);
		addstd.add(fname);
		
		fnametxt = new JTextField();
		fnametxt.setBounds(198, 145, 158, 22);
		addstd.add(fnametxt);
		
		JLabel lblLastName = new JLabel("LAST NAME");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLastName.setBounds(371, 141, 96, 26);
		addstd.add(lblLastName);
		
		lnametxt = new JTextField();
		lnametxt.setBounds(494, 145, 158, 22);
		addstd.add(lnametxt);
		
		JLabel facid = new JLabel("FACULTY ID");
		facid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		facid.setBounds(92, 206, 92, 17);
		addstd.add(facid);
		
		idtxt = new JTextField();
		idtxt.setBounds(198, 205, 158, 22);
		addstd.add(idtxt);
		
		JLabel lblDepartment = new JLabel("DEPARTMENT");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDepartment.setBounds(375, 206, 92, 17);
		addstd.add(lblDepartment);
		
		departmenttxt = new JTextField();
		departmenttxt.setBounds(494, 205, 158, 22);
		addstd.add(departmenttxt);
		
		JLabel divadv = new JLabel("DIV ADVISOR");
		divadv.setFont(new Font("Tahoma", Font.PLAIN, 13));
		divadv.setBounds(92, 269, 101, 23);
		addstd.add(divadv);
		
		divadvtxt = new JTextField();
		divadvtxt.setBounds(198, 271, 158, 22);
		addstd.add(divadvtxt);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDob.setBounds(375, 272, 96, 17);
		addstd.add(lblDob);
		
		dobtxt = new JTextField();
		dobtxt.setBounds(494, 269, 158, 25);
		addstd.add(dobtxt);
		
		JLabel lblDistrict = new JLabel("DISTRICT");
		lblDistrict.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDistrict.setBounds(254, 328, 96, 21);
		addstd.add(lblDistrict);
		
		districttxt = new JTextField();
		districttxt.setBounds(371, 327, 158, 25);
		addstd.add(districttxt);
		
		JButton addbtn = new JButton("ADD");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first_name=fnametxt.getText();
				String last_name=lnametxt.getText();
				String id=idtxt.getText();
				String department=departmenttxt.getText();
				String divadvisor=divadvtxt.getText();
				String dob=dobtxt.getText();
				String district=districttxt.getText();
				int y = adfac1.add(first_name,last_name,id,department,divadvisor,dob,district);
		        if (y == 0) {
		            JOptionPane.showMessageDialog(addbtn, "Invalid");
		        } else {
		            JOptionPane.showMessageDialog(addbtn,"Succesfully added");
		     }
					
				}
			});
		
		JButton Back = new JButton("BACK");
		Back.setFont(new Font("Tahoma", Font.BOLD, 14));
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hodLog backbtn = new hodLog();
				backbtn.setVisible(true);
				dispose();
			}
		});
		Back.setBounds(233, 420, 123, 40);
		addstd.add(Back);
	
		addbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		addbtn.setBounds(494, 420, 123, 40);
		addstd.add(addbtn);
	}
}