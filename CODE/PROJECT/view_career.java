package PROJECT;

import javax.swing.*;
import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import classdiagram.careerrecords;
import classdiagram.staff;
public class view_career extends JFrame {
private JTable table;
public view_career() {
	staff cr = new careerrecords();
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(350, 150, 880, 530);
JPanel contentPane = new JPanel();
setContentPane(contentPane);
getContentPane().setLayout(null);

JButton view_career = new JButton("VIEW CAREER");
view_career.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
Connection c=null;
Class.forName("org.postgresql.Driver");
c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres", "Aswin123");
String query=cr.display_details();
Statement sta=c.createStatement();
ResultSet rs =sta.executeQuery(query);
table.setModel(DbUtils.resultSetToTableModel(rs));
c.close();
}
catch(Exception e1){
e1.printStackTrace();
}
}
});
view_career.setBounds(366, 350, 158, 38);
getContentPane().add(view_career);

JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(208, 56, 469, 283);
getContentPane().add(scrollPane);

table = new JTable();
scrollPane.setViewportView(table);
JButton back_btn = new JButton("BACK");
back_btn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Staff sf = new Staff();
sf.setVisible(true);
dispose();
}
});
back_btn.setBounds(366, 400, 158, 38);
contentPane.add(back_btn);
}



}