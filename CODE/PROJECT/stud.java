package PROJECT;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class stud extends JFrame{
	private JPanel wel_stud;
	public stud() {
		setTitle("STUDENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		wel_stud = new JPanel();
		setContentPane(wel_stud);
		wel_stud.setLayout(null);
		JLabel head_stud = new JLabel("WELCOME STUDENT");
		head_stud.setFont(new Font("Times New Roman", Font.BOLD, 18));
		head_stud.setHorizontalAlignment(SwingConstants.CENTER);
		head_stud.setBounds(5, 5, 805, 55);
		wel_stud.add(head_stud);
		JButton req_app_button = new JButton("REQUEST FOR APPROVAL");
		req_app_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				req_app ra=new req_app();
				ra.setVisible(true);
				dispose();
			}
		});
		req_app_button.setBounds(298, 67, 218, 39);
		wel_stud.add(req_app_button);
		
		JButton send_req_button = new JButton("SEND REQUEST FOR SERVICE");
		send_req_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				req_service rs=new req_service();
				rs.setVisible(true);
				dispose();
			}
		});
		send_req_button.setBounds(298, 144, 218, 39);
		wel_stud.add(send_req_button);
		
		JButton mod_stud_button = new JButton("MODIFY STUDENT DETAILS");
		mod_stud_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modify_stud ms=new modify_stud();
				ms.setVisible(true);
				dispose();
			}
		});
		mod_stud_button.setBounds(298, 215, 218, 39);
		wel_stud.add(mod_stud_button);
		JButton back_button = new JButton("BACK");
        back_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	login log = new login();
            	log.setVisible(true);
            	dispose();
            }
        });
        back_button.setFont(new Font("Tahoma", Font.BOLD, 13));
        back_button.setBounds(298, 276, 218, 39);
        wel_stud.add(back_button);
	}
}
