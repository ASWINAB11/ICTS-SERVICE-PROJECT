package PROJECT;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hodLog extends JFrame {

	private JPanel welhod;
	public hodLog() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		welhod = new JPanel();
		setContentPane(welhod);
		welhod.setLayout(null);
		
		JLabel Welcomefac = new JLabel("WELCOME HOD");
		Welcomefac.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Welcomefac.setHorizontalAlignment(SwingConstants.CENTER);
		Welcomefac.setBounds(255, 36, 369, 45);
		welhod.add(Welcomefac);
		
		JButton addstdbtn = new JButton("ADD STUDENT DETAILS");
		addstdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addstud adddetails=new addstud();
				adddetails.setVisible(true);
				dispose();
			}
		});
		addstdbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		addstdbtn.setBounds(323, 173, 228, 45);
		welhod.add(addstdbtn);
		
		JButton requestbtn = new JButton("REQUEST SERVICE");
		requestbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reqservice reqser=new reqservice();
				reqser.setVisible(true);
				dispose();
			}
		});
		requestbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		requestbtn.setBounds(323, 102, 228, 45);
		welhod.add(requestbtn);
		
		JButton addfacbtn = new JButton("ADD FACULTY DETAILS");
		addfacbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addfacu reqapp=new addfacu();
				reqapp.setVisible(true);
				dispose();
			}
		});
		addfacbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		addfacbtn.setBounds(323, 248, 228, 45);
		welhod.add(addfacbtn);
		
		JButton BACK = new JButton("BACK");
		BACK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login log = new login();
				log.setVisible(true);
				dispose();
			}
		});
		BACK.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BACK.setBounds(323, 384, 228, 45);
		welhod.add(BACK);
		
		JButton btnApprove = new JButton("APPROVE REQUEST");
		btnApprove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				approvereq reqapp=new approvereq();
				reqapp.setVisible(true);
				dispose();
			}
		});
		btnApprove.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnApprove.setBounds(323, 318, 228, 45);
		welhod.add(btnApprove);
	}
}
