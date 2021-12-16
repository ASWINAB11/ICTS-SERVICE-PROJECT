package PROJECT;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import classdiagram.facuty;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addStd extends JFrame {
facuty std1 = new facuty();
private JPanel addstd;
private JTextField fnametxt,stdtxt,districttxt,divtxt,semtxt,lnametxt,dpartmenttxt,adresstxt,dobtxt;

public addStd() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(350, 150, 880, 530);
	addstd = new JPanel();
	setContentPane(addstd);
	addstd.setLayout(null);

	JLabel addstudent = new JLabel("ADD STUDENT DETAILS");
	addstudent.setFont(new Font("Times New Roman", Font.BOLD, 18));
	addstudent.setBounds(323, 10, 224, 46);
	addstd.add(addstudent);
	JLabel name = new JLabel("FIRST NAME");
	name.setFont(new Font("Tahoma", Font.PLAIN, 13));
	name.setBounds(92, 75, 96, 26);
	addstd.add(name);
	
	fnametxt = new JTextField();
	fnametxt.setBounds(198, 79, 158, 22);
	addstd.add(fnametxt);

	JLabel stdid = new JLabel("STUDENT ID");
	stdid.setFont(new Font("Tahoma", Font.PLAIN, 13));
	stdid.setBounds(92, 141, 92, 17);
	addstd.add(stdid);

	JLabel division = new JLabel("DIVISION");
	division.setFont(new Font("Tahoma", Font.PLAIN, 13));
	division.setBounds(377, 200, 73, 21);
	addstd.add(division);
	
	divtxt = new JTextField();
	divtxt.setBounds(490, 201, 158, 25);
	addstd.add(divtxt);

	JLabel sem = new JLabel("SEM");
	sem.setFont(new Font("Tahoma", Font.PLAIN, 13));
	sem.setBounds(92, 265, 109, 17);
	addstd.add(sem);
	
	semtxt = new JTextField();
	semtxt.setBounds(198, 264, 158, 22);
	addstd.add(semtxt);

	JLabel adress = new JLabel("STREET");
	adress.setFont(new Font("Tahoma", Font.PLAIN, 13));
	adress.setBounds(260, 323, 96, 17);
	addstd.add(adress);
	
	stdtxt = new JTextField();
	stdtxt.setBounds(198, 140, 158, 22);
	addstd.add(stdtxt);

	districttxt = new JTextField();
	districttxt.setBounds(198, 201, 158, 22);
	addstd.add(districttxt);

	JLabel lblLastName = new JLabel("LAST NAME");
	lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblLastName.setBounds(371, 75, 96, 26);
	addstd.add(lblLastName);

	lnametxt = new JTextField();
	lnametxt.setBounds(490, 79, 158, 22);
	addstd.add(lnametxt);

	JLabel lblDepartment = new JLabel("DEPARTMENT");
	lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblDepartment.setBounds(375, 141, 92, 17);
	addstd.add(lblDepartment);

	dpartmenttxt = new JTextField();
	dpartmenttxt.setBounds(490, 140, 158, 22);
	addstd.add(dpartmenttxt);

	JLabel lblDistrict = new JLabel("DISTRICT");
	lblDistrict.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblDistrict.setBounds(92, 200, 96, 21);
	addstd.add(lblDistrict);

	adresstxt = new JTextField();
	adresstxt.setBounds(371, 320, 158, 25);
	addstd.add(adresstxt);

	JLabel lblDob = new JLabel("DOB");
	lblDob.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblDob.setBounds(377, 265, 96, 17);
	addstd.add(lblDob);
	
	dobtxt = new JTextField();
	dobtxt.setBounds(490, 265, 158, 25);
	addstd.add(dobtxt);



	JButton addbtn = new JButton("ADD");
	addbtn.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String first_name=fnametxt.getText();
		String last_name=lnametxt.getText();
		String id=stdtxt.getText();
		String department=dpartmenttxt.getText();
		String district=districttxt.getText();
		String sem=semtxt.getText();
		String dob=dobtxt.getText();
		String adress=adresstxt.getText();
		int y = std1.add_student(first_name,last_name,id,department,district ,sem,dob,adress);
        if (y == 0) {
            JOptionPane.showMessageDialog(addbtn, "Invalid");
        } else {
            JOptionPane.showMessageDialog(addbtn,"Succesfully added");
     }
			
		}
	});
	addbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	addbtn.setBounds(494, 420, 123, 40);
	addstd.add(addbtn);

	JButton Back = new JButton("BACK");
	Back.setFont(new Font("Tahoma", Font.BOLD, 14));
	Back.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Faculty backbtn = new Faculty();
			backbtn.setVisible(true);
			dispose();
		}
	});
	Back.setBounds(233, 420, 123, 40);
	addstd.add(Back);

}
}