package PROJECT;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import classdiagram.HOD;

public class reqservice extends JFrame {



private JPanel reqser;
private JTextField nametxt,idtxt,servicetxt,deptxt,lnametxt,statustxt;
HOD reqser2 = new HOD();

public reqservice() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(350, 150, 880, 530);
	reqser = new JPanel();
	setContentPane(reqser);
	reqser.setLayout(null);

	JLabel reqservice = new JLabel("REQUEST SERVICE");
	reqservice.setFont(new Font("Times New Roman", Font.BOLD, 18));
	reqservice.setBounds(328, 10, 200, 54);
	reqser.add(reqservice);

	JLabel name = new JLabel("FIRST NAME");
	name.setFont(new Font("Tahoma", Font.PLAIN, 13));
	name.setBounds(262, 100, 82, 19);
	reqser.add(name);
	
	nametxt = new JTextField();
	nametxt.setBounds(405, 101, 155, 26);
	reqser.add(nametxt);
	nametxt.setColumns(10);
	
	JLabel lblLastName = new JLabel("LAST NAME");
	lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblLastName.setBounds(262, 140, 82, 19);
	reqser.add(lblLastName);
	
	lnametxt = new JTextField();
	lnametxt.setColumns(10);
	lnametxt.setBounds(405, 141, 155, 26);
	reqser.add(lnametxt);

	JLabel id = new JLabel("ID");
	id.setFont(new Font("Tahoma", Font.PLAIN, 13));
	id.setBounds(262, 183, 45, 13);
	reqser.add(id);
	
	idtxt = new JTextField();
	idtxt.setBounds(405, 181, 155, 26);
	reqser.add(idtxt);
	idtxt.setColumns(10);
	
	JLabel ser = new JLabel("SERVICE ");
	ser.setFont(new Font("Tahoma", Font.PLAIN, 13));
	ser.setBounds(262, 222, 64, 21);
	reqser.add(ser);
	
	servicetxt = new JTextField();
	servicetxt.setBounds(405, 224, 155, 24);
	reqser.add(servicetxt);
	servicetxt.setColumns(10);
	
	JLabel dept = new JLabel("DEPARTMENT");
	dept.setFont(new Font("Tahoma", Font.PLAIN, 13));
	dept.setBounds(262, 260, 82, 17);
	reqser.add(dept);
	
	deptxt = new JTextField();
	deptxt.setBounds(405, 258, 155, 26);
	reqser.add(deptxt);
	deptxt.setColumns(10);
	
	JLabel lblStatus = new JLabel("STATUS");
	lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 13));
	lblStatus.setBounds(262, 300, 82, 17);
	reqser.add(lblStatus);

	statustxt = new JTextField();
	statustxt.setColumns(10);
	statustxt.setBounds(405, 300, 155, 26);
	reqser.add(statustxt);

	JButton addbtn = new JButton("ADD");
	addbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String first_name=nametxt.getText();
			String last_name=lnametxt.getText();
			String id=idtxt.getText();
			String service=servicetxt.getText();
			String department=deptxt.getText();
			String status=statustxt.getText();
			int y = reqser2.request_service(first_name,last_name,id,service,department,status);
	        if (y == 0) {
	            JOptionPane.showMessageDialog(addbtn, "Invalid");
	        } else {
	            JOptionPane.showMessageDialog(addbtn,"Succesfully, added");
	     }
				
			}
		});
	addbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	addbtn.setBounds(444, 356, 116, 45);
	reqser.add(addbtn);
	JButton bckbtn = new JButton("BACK");
	bckbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
	bckbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			hodLog backbtn = new hodLog();
			backbtn.setVisible(true);
			dispose();
		}});
	bckbtn.setBounds(264, 356, 112, 45);
	reqser.add(bckbtn);

}
}