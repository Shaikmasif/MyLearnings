import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField date;
	private JTextField month;
	private JTextField year;
	private JTextField output;
	private JTextField name;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 522);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AGE CALCULATOR");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
		lblNewLabel.setBounds(160, 10, 343, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER  YOUR  DOB :");
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel_1.setBounds(223, 77, 247, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("NAME :");
		lblNewLabel_5.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel_5.setBounds(203, 125, 96, 41);
		contentPane.add(lblNewLabel_5);
		
		name = new JTextField();
		name.setBounds(362, 128, 181, 31);
		contentPane.add(name);
		name.setColumns(10);
		
		date = new JTextField();
		date.setBounds(362, 176, 181, 34);
		contentPane.add(date);
		date.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DATE :");
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel_2.setBounds(203, 171, 88, 41);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MONTH :");
		lblNewLabel_3.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel_3.setBounds(203, 230, 107, 41);
		contentPane.add(lblNewLabel_3);
		
		month = new JTextField();
		month.setBounds(362, 235, 181, 33);
		contentPane.add(month);
		month.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("YEAR :");
		lblNewLabel_4.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		lblNewLabel_4.setBounds(203, 285, 89, 41);
		contentPane.add(lblNewLabel_4);
		
		year = new JTextField();
		year.setBounds(362, 291, 181, 31);
		contentPane.add(year);
		year.setColumns(10);
		
		JButton calculate = new JButton("CALCULATE");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculation code
				String N = name.getText();
				int D = Integer.parseInt(date.getText());
				int M = Integer.parseInt(month.getText());
				int Y = Integer.parseInt(year.getText());
				Date currentDate = new Date();
				int cd = currentDate.getDate();
				int cm = currentDate.getMonth();
				int cy = (currentDate.getYear()%100)+2000;
				int hours = currentDate.getHours();
				int minutes = currentDate.getMinutes();
				int seconds = currentDate.getSeconds();
				int monthDays[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
				
				int pd;
				if(((cy%4==0 && cy%100!=0) || (cy%400==0)) && (M==2)) {
					 pd = 29-D+cd;
				}else {
					 pd = monthDays[M]-D+cd;
				}
				int gap = (12-M);
				int pm = (gap+cm)%12;
				int py = cy-Y-1;
				
				pm +=pd/30;
				pd %=30;
				
				String message = N+" Your Age Is "+py+" Years "+pm+" Months "+pd+" Days "+hours+":"+minutes+":"+seconds;
				
				output.setText(message);
				name.setText("");
				date.setText("");
				month.setText("");
				year.setText("");
		
			}
		});
		calculate.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		calculate.setBounds(252, 358, 201, 49);
		contentPane.add(calculate);
		
		output = new JTextField();
		output.setBounds(147, 417, 426, 42);
		contentPane.add(output);
		output.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(57, 323, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
	}
}
