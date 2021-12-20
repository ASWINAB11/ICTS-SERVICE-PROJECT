package PROJECT;

import java.awt.Font;
import classdiagram.admin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addservice extends JFrame{
	admin adm2 = new admin();
	private JPanel addservicepage;
	private JTextField SER,SERN;
	public addservice() {
		setTitle("ADD SERVICE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		addservicepage = new JPanel();
		setContentPane(addservicepage);
		addservicepage.setLayout(null);
		
		JLabel enterdetail1 = new JLabel("ENTER DETAILS");
		enterdetail1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		enterdetail1.setBounds(318, 10, 207, 33);
		addservicepage.add(enterdetail1);
		
		JLabel namelblserv = new JLabel("NAME OF SERVICE: ");
		namelblserv.setFont(new Font("Tahoma", Font.PLAIN, 13));
		namelblserv.setBounds(224, 157, 137, 26);
		addservicepage.add(namelblserv);
		
		SER = new JTextField();
		SER.setBounds(436, 92, 147, 26);
		addservicepage.add(SER);
		
		JLabel serlabl = new JLabel("SERVICE ID: ");
		serlabl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		serlabl.setBounds(224, 90, 137, 26);
		addservicepage.add(serlabl);
		
		SERN = new JTextField();
		SERN.setBounds(436, 157, 147, 26);
		addservicepage.add(SERN);
		
		JButton btnadddetail = new JButton("ADD");
		btnadddetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String service_id = SER.getText();
				String service_name = SERN.getText();
				int x = adm2.add(service_id,service_name);
				if (x == 0) {
	                JOptionPane.showMessageDialog(btnadddetail, "Invalid");
	            } else {
	                JOptionPane.showMessageDialog(btnadddetail,"Succesfully added");
	            }
			}
		});
		btnadddetail.setBounds(436, 240, 147, 33);
		addservicepage.add(btnadddetail);
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminpage adm = new adminpage();
				adm.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(234, 240, 137, 33);
		addservicepage.add(btnBack);
	}
}
