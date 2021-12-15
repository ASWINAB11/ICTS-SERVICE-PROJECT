package PROJECT;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import classdiagram.admin;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addstaff extends JFrame{
	admin adm1 = new admin();
	private JPanel addstafpage;
	private JTextField sid,sname,ser,sername,pnno, pay;
	public addstaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		addstafpage = new JPanel();
		setContentPane(addstafpage);
		addstafpage.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER DETAILS OF STAFF");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel.setBounds(256, 20, 316, 33);
		addstafpage.add(lblNewLabel);
		
		JLabel staffnamelab = new JLabel("STAFF NAME: ");
		staffnamelab.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		staffnamelab.setBounds(210, 140, 100, 18);
		addstafpage.add(staffnamelab);
		
		sname = new JTextField();
		sname.setBounds(424, 138, 148, 26);
		addstafpage.add(sname);
		
		JLabel sernamelbl = new JLabel("SERVICE NAME: ");
		sernamelbl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		sernamelbl.setBounds(210, 272, 180, 18);
		addstafpage.add(sernamelbl);
		
		sername = new JTextField();
		sername.setBounds(424, 270, 148, 26);
		addstafpage.add(sername);
		
		
		JLabel serid = new JLabel("SERVICE ID: ");
		serid.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		serid.setBounds(210, 179, 180, 18);
		addstafpage.add(serid);
		
		ser = new JTextField();
		ser.setBounds(424, 177, 148, 26);
		addstafpage.add(ser);
		
		JLabel staff_id = new JLabel("STAFF ID: ");
		staff_id.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		staff_id.setBounds(210, 98, 180, 18);
		addstafpage.add(staff_id);
		
		sid = new JTextField();
		sid.setBounds(424, 96, 148, 26);
		addstafpage.add(sid);
		
		JLabel pno = new JLabel("PHONE NO:");
		pno.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		pno.setBounds(210, 316, 180, 18);
		addstafpage.add(pno);
		
		pnno = new JTextField();
		pnno.setBounds(424, 314, 148, 26);
		addstafpage.add(pnno);
		
		JLabel paylbl = new JLabel("PAYMENT: ");
		paylbl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		paylbl.setBounds(210, 229, 180, 18);
		addstafpage.add(paylbl);
		
		pay = new JTextField();
		pay.setBounds(424, 227, 148, 26);
		addstafpage.add(pay);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String stf_id = sid.getText();
			String stf_name = sname.getText();
			String srv_id= ser.getText();
			String srv_name = sername.getText();
			String phn = pnno.getText();
			int paym = Integer.parseInt(pay.getText());
			int y = adm1.add(stf_id, stf_name, srv_id, paym, srv_name, phn);
            if (y == 0) {
                JOptionPane.showMessageDialog(btnAdd, "Invalid");
            } else {
                JOptionPane.showMessageDialog(btnAdd,"Succesfully added");
         }
				
			}
		});
		btnAdd.setBounds(434, 379, 142, 42);
		addstafpage.add(btnAdd);
		JButton btnBack = new JButton("BACK");
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminpage  adm = new adminpage();
				adm.setVisible(true);
				dispose();
			}
		});
		addstafpage.add(btnBack);
		btnBack.setBounds(210, 379, 132, 42);

		
	}
}
