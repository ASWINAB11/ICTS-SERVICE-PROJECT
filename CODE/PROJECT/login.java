package PROJECT;


import java.awt.Font;
import classdiagram.admin;
import classdiagram.facuty;
import classdiagram.staff;
import classdiagram.student;
import classdiagram.HOD;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class login extends JFrame{
	admin adm3 = new admin();
	facuty f1 = new facuty();
	staff s1 = new staff();
	student st1= new student();
	HOD h1= new HOD();
	private JPanel loginpage;
	private JTextField userid,passward;
	private JRadioButton admin,staff,hod,student,faculty;
	public login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		loginpage = new JPanel();
		setContentPane(loginpage);
		loginpage.setLayout(null);
		
		admin = new JRadioButton("ADMIN");
		admin .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(admin.isSelected())
				{
					staff.setSelected(false);
					student.setSelected(false);
					hod.setSelected(false);
					faculty.setSelected(false);
				}
			}
		});
		admin.setBounds(81, 131, 103, 21);
		loginpage.add(admin);
		
		staff = new JRadioButton("STAFF");
		staff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(staff.isSelected())
				{
					admin.setSelected(false);
					student.setSelected(false);
					hod.setSelected(false);
					faculty.setSelected(false);
				}
			}
		});
		staff.setBounds(208, 131, 103, 21);
		loginpage.add(staff);
		
		 hod = new JRadioButton("HOD");
		 hod.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(hod.isSelected())
				{
					staff.setSelected(false);
					student.setSelected(false);
					admin.setSelected(false);
					faculty.setSelected(false);
				}
		 	}
		 });
		hod.setBounds(350, 131, 103, 21);
		loginpage.add(hod);
		
		student = new JRadioButton("STUDENT");
		student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(student.isSelected())
				{
					staff.setSelected(false);
					admin.setSelected(false);
					hod.setSelected(false);
					faculty.setSelected(false);
				}
			}
		});
		student.setBounds(482, 131, 103, 21);
		loginpage.add(student);
		
		faculty = new JRadioButton("FACULTY");
		faculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(faculty.isSelected())
				{
					staff.setSelected(false);
					student.setSelected(false);
					hod.setSelected(false);
					admin.setSelected(false);
				}
			}
		});
		faculty.setBounds(621, 131, 103, 21);
		loginpage.add(faculty);
		
		JLabel welcomelabel = new JLabel("WELCOME");
		welcomelabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		welcomelabel.setBounds(350, 22, 167, 21);
		loginpage.add(welcomelabel);
		
		JLabel loginlabel = new JLabel("LOGIN AS:");
		loginlabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		loginlabel.setBounds(24, 90, 103, 13);
		loginpage.add(loginlabel);
		
		JLabel useidlabel = new JLabel("USER ID: ");
		useidlabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		useidlabel.setBounds(208, 216, 103, 21);
		loginpage.add(useidlabel);
		
		JLabel password = new JLabel("PASSWORD: ");
		password.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		password.setBounds(208, 270, 117, 23);
		loginpage.add(password);
		
		userid = new JTextField();
		userid.setBounds(350, 211, 167, 26);
		loginpage.add(userid);
		
		JPasswordField passward = new JPasswordField();
		passward.setBounds(350, 270, 167, 26);
		loginpage.add(passward);
		
		JCheckBox showp = new JCheckBox("Show password");
		showp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(showp.isSelected())
				{
					passward.setEchoChar((char)0);
				}
				else
				{
					passward.setEchoChar('*');
				}
			}
		});
		showp.setBounds(350, 295, 167, 26);
		loginpage.add(showp);
		

		JButton loginbutton = new JButton("LOGIN");
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = userid.getText();
				String selection = null;
				if(admin.isSelected())
				{
					selection = "Admin selected";
					int R = adm3.login(id);
					if(R==1)
					{
						adminpage adminp = new adminpage();
						adminp.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(loginbutton, "Invalid");
					}
					
				}
				if(staff.isSelected())
				{
					
					selection = "staff selected";
					int R = s1.login(id);
					if(R==1)
					{
						Staff stafflog = new Staff();
						stafflog.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(loginbutton, "Invalid");
					}
				}
				if(hod.isSelected())
				{

					selection = "hod selected";
					int R = h1.login(id);
					if(R==1)
					{
						hodLog hodpag = new hodLog();
						hodpag.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(loginbutton, "Invalid");
					}
					
				}
				if(student.isSelected())
				{

					selection = "student selected";
					int R = st1.login(id);
					if(R==1)
					{
						stud stdp = new stud();
						stdp.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(loginbutton, "Invalid");
					}
				}
				if(faculty.isSelected())
				{

					selection = "faculty selected";
					int R = f1.login(id);
					if(R==1)
					{
						Faculty fac = new Faculty();
						fac.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(loginbutton, "Invalid");
					}
				}

				System.out.println(selection);
				
			}
		});
		loginbutton.setBounds(350, 342, 103, 33);
		loginpage.add(loginbutton);
	}
	public static void main(String[] args) {
		try {
			login frame = new login();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
