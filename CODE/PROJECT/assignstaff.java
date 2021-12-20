package PROJECT;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import classdiagram.admin;
public class assignstaff extends JFrame{
	admin adm2 = new admin();
	private JPanel assignstaffpage;
	private JTextField staffidtf,servidtf;

	public assignstaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 880, 530);
		assignstaffpage = new JPanel();
		setContentPane(assignstaffpage);
		assignstaffpage.setLayout(null);
		
		JLabel enterdetail = new JLabel("ENTER DETAILS: ");
		enterdetail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		enterdetail.setBounds(326, 20, 223, 16);
		assignstaffpage.add(enterdetail);
		
		JLabel staffidlbl = new JLabel("STAFF ID: ");
		staffidlbl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		staffidlbl.setBounds(243, 74, 97, 29);
		assignstaffpage.add(staffidlbl);
		
		JLabel seridlabl = new JLabel("SERVICE ID: ");
		seridlabl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		seridlabl.setBounds(243, 155, 97, 29);
		assignstaffpage.add(seridlabl);
		
		staffidtf = new JTextField();
		staffidtf.setBounds(415, 75, 134, 29);
		assignstaffpage.add(staffidtf);
		
		servidtf = new JTextField();
		servidtf.setBounds(415, 156, 134, 29);
		assignstaffpage.add(servidtf);
		
		JButton btnassign = new JButton("ASSIGN");
		btnassign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String staf_id = staffidtf.getText();
				String serv_id = servidtf.getText();
				try {
					int x = adm2.assign_staff(staf_id,serv_id);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnassign, "Invalid");
                    } else {
                        JOptionPane.showMessageDialog(btnassign,"Sucessfully added");
                    }
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		
		btnassign.setBounds(416, 241, 133, 29);
		assignstaffpage.add(btnassign);
		JButton btnBack1 = new JButton("BACK");
		
		btnBack1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminpage adm = new adminpage();
				adm.setVisible(true);
				dispose();
			}
		});
		assignstaffpage.add(btnBack1);
		btnBack1.setBounds(243, 239, 94, 33);
	}
}