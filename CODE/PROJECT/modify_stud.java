package PROJECT;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import classdiagram.student;
public class modify_stud extends JFrame {

student stud = new student();

private JPanel modify_student;
private JTextField firstnametxt,deptxt,lnametxt,dobtxt,districttxt,semtxt,sid_textField,div_txt,street_textField;

public modify_stud() {
setTitle("Student");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(350, 150, 880, 530);
modify_student = new JPanel();
setContentPane(modify_student);
modify_student.setLayout(null);

JLabel mod_stud = new JLabel("MODIFY STUDENT");
mod_stud.setFont(new Font("Times New Roman", Font.BOLD, 17));
mod_stud.setBounds(282, 10, 368, 30);
modify_student.add(mod_stud);

JButton update_button = new JButton("UPDATE");
update_button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	String first_name=firstnametxt.getText();
	String last_name=lnametxt.getText();
	String dep=deptxt.getText();
	String dob=dobtxt.getText();
	String district=districttxt.getText();
	String sem=semtxt.getText();
	String sid=sid_textField.getText();
	String div=div_txt.getText();
	String street=street_textField.getText();
	int y = stud.modify_student(sid,first_name,last_name,dep,district,div,sem,dob,street);
    if (y == 0) {
        JOptionPane.showMessageDialog(update_button, "This is alredy exist");
    } else {
        JOptionPane.showMessageDialog(update_button,"Succesfully, added");
 }
		
	}	
}
);


update_button.setBounds(399, 411, 101, 30);
modify_student.add(update_button);

JLabel f_name = new JLabel("First Name");
f_name.setFont(new Font("Tahoma", Font.PLAIN, 13));
f_name.setBounds(204, 83, 73, 13);
modify_student.add(f_name);

firstnametxt = new JTextField();
firstnametxt.setBounds(354, 81, 146, 19);
modify_student.add(firstnametxt);
firstnametxt.setColumns(10);

JLabel Dep = new JLabel("Department");
Dep.setFont(new Font("Tahoma", Font.PLAIN, 13));
Dep.setBounds(204, 159, 73, 13);
modify_student.add(Dep);

deptxt = new JTextField();
deptxt.setBounds(354, 157, 146, 19);
modify_student.add(deptxt);
deptxt.setColumns(10);

JLabel lblNewLabel_1_1_1 = new JLabel("");
lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_1_1_1.setBounds(27, 159, 73, 13);
modify_student.add(lblNewLabel_1_1_1);

JLabel l_name = new JLabel("Last Name");
l_name.setFont(new Font("Tahoma", Font.PLAIN, 13));
l_name.setBounds(204, 119, 73, 13);
modify_student.add(l_name);

lnametxt = new JTextField();
lnametxt.setColumns(10);
lnametxt.setBounds(354, 117, 146, 19);
modify_student.add(lnametxt);

JLabel dob = new JLabel("DOB");
dob.setFont(new Font("Tahoma", Font.PLAIN, 13));
dob.setBounds(204, 203, 73, 13);
modify_student.add(dob);

dobtxt = new JTextField();
dobtxt.setColumns(10);
dobtxt.setBounds(354, 201, 146, 19);
modify_student.add(dobtxt);

JLabel dist = new JLabel("District");
dist.setFont(new Font("Tahoma", Font.PLAIN, 13));
dist.setBounds(204, 243, 73, 13);
modify_student.add(dist);

districttxt = new JTextField();
districttxt.setColumns(10);
districttxt.setBounds(354, 241, 146, 19);
modify_student.add(districttxt);

JLabel sem = new JLabel("Semester");
sem.setFont(new Font("Tahoma", Font.PLAIN, 13));
sem.setBounds(204, 325, 73, 13);
modify_student.add(sem);

semtxt = new JTextField();
semtxt.setColumns(10);
semtxt.setBounds(354, 323, 146, 19);
modify_student.add(semtxt);

JButton back_button = new JButton("BACK");
back_button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
stud s=new stud();
s.setVisible(true);
dispose();
}
});
back_button.setBounds(204, 411, 101, 30);
modify_student.add(back_button);

JLabel stud_id = new JLabel("Student ID");
stud_id.setFont(new Font("Tahoma", Font.PLAIN, 13));
stud_id.setBounds(204, 52, 73, 13);
modify_student.add(stud_id);

sid_textField = new JTextField();
sid_textField.setColumns(10);
sid_textField.setBounds(354, 50, 146, 19);
modify_student.add(sid_textField);

JLabel stud_div = new JLabel("Student Division");
stud_div.setFont(new Font("Tahoma", Font.PLAIN, 13));
stud_div.setBounds(204, 284, 101, 13);
modify_student.add(stud_div);

div_txt = new JTextField();
div_txt.setColumns(10);
div_txt.setBounds(354, 282, 146, 19);
modify_student.add(div_txt);

JLabel street = new JLabel("Student Street");
street.setFont(new Font("Tahoma", Font.PLAIN, 13));
street.setBounds(204, 364, 101, 13);
modify_student.add(street);

street_textField = new JTextField();
street_textField.setColumns(10);
street_textField.setBounds(354, 362, 146, 19);
modify_student.add(street_textField);
}
}