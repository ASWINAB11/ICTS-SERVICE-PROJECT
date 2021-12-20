package PROJECT;

import classdiagram.student;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class req_service extends JFrame {

student stud=new student();

private JPanel req_service;
private JTextField stdtxt,fnametxt,servicetxt,lnametxt,depttxt,statustxt;

public req_service() {
setTitle("REQUEST SERVICE");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(350, 150, 880, 530);
req_service = new JPanel();
setContentPane(req_service);
req_service.setLayout(null);

JLabel req_ser_head = new JLabel("REQUEST SERVICE");
req_ser_head.setFont(new Font("Times New Roman", Font.BOLD, 18));
req_ser_head.setBounds(281, 23, 189, 34);
req_service.add(req_ser_head);

JLabel stud_id = new JLabel("STUDENT ID");
stud_id.setFont(new Font("Tahoma", Font.PLAIN, 12));
stud_id.setBounds(195, 87, 93, 13);
req_service.add(stud_id);

stdtxt = new JTextField();
stdtxt.setBounds(410, 85, 132, 19);
req_service.add(stdtxt);
stdtxt.setColumns(10);

JLabel stud_fname = new JLabel("FIRST NAME");
stud_fname.setFont(new Font("Tahoma", Font.PLAIN, 12));
stud_fname.setBounds(195, 120, 93, 13);
req_service.add(stud_fname);

fnametxt = new JTextField();
fnametxt.setColumns(10);
fnametxt.setBounds(410, 118, 132, 19);
req_service.add(fnametxt);

JLabel ser_name = new JLabel("SERVICE NAME");
ser_name.setFont(new Font("Tahoma", Font.PLAIN, 12));
ser_name.setBounds(195, 186, 93, 13);
req_service.add(ser_name);

servicetxt = new JTextField();
servicetxt.setColumns(10);
servicetxt.setBounds(410, 184, 132, 19);
req_service.add(servicetxt);


JButton send_req_button = new JButton("SEND REQUEST");
send_req_button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	String first_name=fnametxt.getText();
	String last_name=lnametxt.getText();
	String id=stdtxt.getText();
	String service=servicetxt.getText();
	String department=depttxt.getText();
	String status=statustxt.getText();
	int y = stud.request(first_name,last_name,id,service,department,status);
    if (y == 0) {
        JOptionPane.showMessageDialog(send_req_button, "This is alredy exist");
    } else {
        JOptionPane.showMessageDialog(send_req_button,"Succesfully, added");
 }		
}
});
send_req_button.setFont(new Font("Tahoma", Font.PLAIN, 12));
send_req_button.setBounds(404, 322, 138, 34);
req_service.add(send_req_button);

JButton back_button = new JButton("BACK");
back_button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
stud s=new stud();
s.setVisible(true);
dispose();
}
});
back_button.setFont(new Font("Tahoma", Font.PLAIN, 12));
back_button.setBounds(195, 322, 138, 34);
req_service.add(back_button);

JLabel stud_lname = new JLabel("LAST NAME");
stud_lname.setFont(new Font("Tahoma", Font.PLAIN, 12));
stud_lname.setBounds(195, 153, 93, 13);
req_service.add(stud_lname);

lnametxt = new JTextField();
lnametxt.setColumns(10);
lnametxt.setBounds(410, 147, 132, 19);
req_service.add(lnametxt);

JLabel dept = new JLabel("DEPARTMENT");
dept.setFont(new Font("Tahoma", Font.PLAIN, 12));
dept.setBounds(195, 223, 93, 13);
req_service.add(dept);

depttxt = new JTextField();
depttxt.setColumns(10);
depttxt.setBounds(410, 221, 132, 19);
req_service.add(depttxt);

JLabel status = new JLabel("STATUS");
status.setFont(new Font("Tahoma", Font.PLAIN, 12));
status.setBounds(195, 265, 93, 13);
req_service.add(status);

statustxt = new JTextField();
statustxt.setColumns(10);
statustxt.setBounds(410, 263, 132, 19);
req_service.add(statustxt);

}
}