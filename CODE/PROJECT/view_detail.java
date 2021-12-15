package PROJECT;


import classdiagram.staff;
import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;


public class view_detail extends JFrame {
staff stf5 = new staff();
private JPanel contentPane;
private JTable table;
public view_detail() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(350, 150, 880, 530);
contentPane = new JPanel();
setContentPane(contentPane);
contentPane.setLayout(null);

JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(142, 24, 507, 326);
contentPane.add(scrollPane);

table = new JTable();
scrollPane.setViewportView(table);

JButton get_data = new JButton("GET DATA");
get_data.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
try {
Connection c=null;
Class.forName("org.postgresql.Driver");
c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectsample","postgres", "Aswin123");
String query= stf5.display_details();
Statement sta=c.createStatement();
ResultSet rs =sta.executeQuery(query);
table.setModel(DbUtils.resultSetToTableModel(rs));
}
catch(Exception e1){
e1.printStackTrace();
}
}
});
get_data.setBounds(359, 364, 158, 38);
contentPane.add(get_data);
JButton back_btn = new JButton("BACK");
back_btn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Staff sf = new Staff();
sf.setVisible(true);
dispose();
}
});
back_btn.setBounds(359, 420, 158, 38);
contentPane.add(back_btn);
}

}
