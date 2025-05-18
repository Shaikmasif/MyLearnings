import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField position;
	private JTextField deletePosition;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	int arr[];
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setBackground(new Color(153, 255, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 616);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATASTRUCTURE");
		lblNewLabel.setBounds(183, 10, 375, 40);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(95, 86, 246, 24);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(366, 86, 214, 24);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createButton = new JButton("CREATE ARRAY");
		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//array creation code
				int n = Integer.parseInt(length.getText());
				arr = new int[n];
				String message = "Array of size "+n+" created.";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		createButton.setBackground(new Color(102, 255, 153));
		createButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		createButton.setBounds(270, 141, 171, 31);
		contentPane.add(createButton);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(150, 196, 219, 24);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(379, 199, 194, 24);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insertButton = new JButton("INSERT");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertion code
				int elem = Integer.parseInt(element.getText());
				int pos = Integer.parseInt(position.getText());
				if(pos<arr.length) {
				arr[pos] = elem;
				String message = "Element "+elem+" inserted at position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				
				}else {
					String message = "position is greater than size of array";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				element.setText("");
				position.setText("");
			}
		});
		insertButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		insertButton.setBounds(319, 305, 99, 31);
		contentPane.add(insertButton);
		
		JLabel lblNewLabel_3 = new JLabel("POSITION :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(250, 252, 109, 24);
		contentPane.add(lblNewLabel_3);
		
		position = new JTextField();
		position.setBounds(379, 252, 201, 24);
		contentPane.add(position);
		position.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER ELEMENT POSITION :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(81, 368, 288, 24);
		contentPane.add(lblNewLabel_4);
		
		deletePosition = new JTextField();
		deletePosition.setBounds(379, 368, 201, 24);
		contentPane.add(deletePosition);
		deletePosition.setColumns(10);
		
		JButton deleteButton = new JButton("DELETE");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletion code
				int position = Integer.parseInt(deletePosition.getText());
				if(position<arr.length) {
				String message = "Element deleted is "+arr[position];
				arr[position] = 0;
				JOptionPane.showMessageDialog(contentPane, message);
				}else {
					String message = "position is greater than size of array";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				deletePosition.setText("");
			}
		});
		deleteButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		deleteButton.setBounds(319, 412, 103, 31);
		contentPane.add(deleteButton);
		
		display = new JTextField();
		display.setBounds(335, 493, 258, 31);
		contentPane.add(display);
		display.setColumns(10);
		
		JButton displayButton = new JButton("DISPLAY :");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				String message = "";
				for(int i = 0;i<=arr.length-1;i++) {
					message = message+" "+String.valueOf(arr[i]);
				}
				display.setText(message);
			}
		});
		displayButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		displayButton.setBounds(183, 493, 133, 33);
		contentPane.add(displayButton);
	}
}
