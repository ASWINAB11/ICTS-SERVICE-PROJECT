package PROJECT;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import classdiagram.service;
public class viewservice extends JFrame {
private JPanel contentPane;
private JTable table;

public viewservice() {
	service s5 = new service();
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(350, 150, 880, 530);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(158, 52, 534, 343);
contentPane.add(scrollPane);

table = new JTable();
scrollPane.setViewportView(table);

JButton view_service = new JButton("VIEW SERVICE");
view_service.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
Connection c=null;
Class.forName("org.postgresql.Driver");
c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres", "Aswin123");
String query=s5.view_service();
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
view_service.setBounds(370, 400, 158, 38);
contentPane.add(view_service);
JButton back_btn = new JButton("BACK");
back_btn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Staff sf = new Staff();
sf.setVisible(true);
dispose();
}
});
back_btn.setBounds(370, 445, 158, 38);
contentPane.add(back_btn);
}
}