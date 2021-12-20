package PROJECT;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Faculty extends JFrame {
private JPanel welfac;
public Faculty() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(350, 150, 880, 530);
	welfac = new JPanel();
	setContentPane(welfac);
	welfac.setLayout(null);

	JLabel Welcomefac = new JLabel("WELCOME FACULTY");
	Welcomefac.setFont(new Font("Times New Roman", Font.BOLD, 18));
	Welcomefac.setHorizontalAlignment(SwingConstants.CENTER);
	Welcomefac.setBounds(255, 36, 369, 45);
	welfac.add(Welcomefac);

	JButton addstdbtn = new JButton("ADD STUDENT DETAILS");
	addstdbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			addStd adddetails=new addStd();
			adddetails.setVisible(true);
			dispose();
		}
	});
	addstdbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
	addstdbtn.setBounds(323, 292, 228, 45);
	welfac.add(addstdbtn);

	JButton requestbtn = new JButton("REQUEST SERVICE");
	requestbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			RequestService reqser=new RequestService();
			reqser.setVisible(true);
			dispose();
		}
	});
	requestbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
	requestbtn.setBounds(323, 125, 228, 45);
	welfac.add(requestbtn);

	JButton sendbtn = new JButton("SEND REQUEST FOR APPROVAL");
	sendbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			requestApproval reqapp=new requestApproval();
			reqapp.setVisible(true);
			dispose();
		}
	});
	sendbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
	sendbtn.setBounds(323, 209, 228, 45);
	welfac.add(sendbtn);

	JButton BACK = new JButton("BACK");
	BACK.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			login l = new login();
			l.setVisible(true);
			dispose();
		}
	});
	BACK.setFont(new Font("Tahoma", Font.PLAIN, 13));
	BACK.setBounds(323, 363, 228, 45);
	welfac.add(BACK);
}

}