package PROJECT;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Staff extends JFrame {



private JPanel welfac;
public Staff() {
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(350, 150, 880, 530);
welfac = new JPanel();
setContentPane(welfac);
welfac.setLayout(null);

JLabel Welcomestf = new JLabel("WELCOME STAFF");
Welcomestf.setFont(new Font("Times New Roman", Font.BOLD, 18));
Welcomestf.setHorizontalAlignment(SwingConstants.CENTER);
Welcomestf.setBounds(255, 10, 369, 45);
welfac.add(Welcomestf);

JButton modifybtn = new JButton("MODIFY DETAILS");
modifybtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
modifydetails modify=new modifydetails();
modify.setVisible(true);
dispose();
}
});
modifybtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
modifybtn.setBounds(323, 66, 228, 45);
welfac.add(modifybtn);

JButton viewbtn = new JButton("VIEW REQUEST");
viewbtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
viewRequests reqapp=new viewRequests();
reqapp.setVisible(true);
dispose();
}
});
viewbtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
viewbtn.setBounds(323, 121, 228, 45);
welfac.add(viewbtn);

JButton BACK = new JButton("BACK");
BACK.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
login logi = new login();
logi.setVisible(true);
dispose();
}
});
BACK.setFont(new Font("Tahoma", Font.PLAIN, 13));
BACK.setBounds(323, 399, 228, 45);
welfac.add(BACK);

JButton view_details = new JButton("VIEW DETAILS");
view_details.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
view_detail vd = new view_detail();
vd.setVisible(true);
dispose();
}
});
view_details.setFont(new Font("Tahoma", Font.PLAIN, 13));
view_details.setBounds(323, 176, 228, 45);
welfac.add(view_details);

JButton view_career = new JButton("VIEW CAREER");
view_career.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
view_career vc = new view_career();
vc.setVisible(true);
dispose();

}
});
view_career.setFont(new Font("Tahoma", Font.PLAIN, 13));
view_career.setBounds(323, 231, 228, 45);
welfac.add(view_career);
JButton personaldetails = new JButton("PESORNAL DETAILS");
personaldetails.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		PERSONALDETAIL O = new PERSONALDETAIL();
		O.setVisible(true);
		dispose();
	}
});
personaldetails.setFont(new Font("Tahoma", Font.PLAIN, 13));
personaldetails.setBounds(323, 289, 228, 45);
welfac.add(personaldetails);
JButton view_service = new JButton("VIEW SERVICE");
view_service.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		viewservice O = new viewservice();
		O.setVisible(true);
		dispose();
	}
});
view_service.setFont(new Font("Tahoma", Font.PLAIN, 13));
view_service.setBounds(323, 344, 228, 45);
welfac.add(view_service);
}
}