import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 160, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IMPLEMENTATION OF DS");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setBounds(169, 22, 355, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CHOOSE A DATASTRUCTURE");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_1.setBounds(196, 73, 273, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton arrayButton = new JButton("ARRAY");
		arrayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//array implementation code
				Array a = new Array();
				a.setVisible(true);
			}
		});
		arrayButton.setForeground(new Color(0, 0, 0));
		arrayButton.setBackground(new Color(144, 238, 144));
		arrayButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		arrayButton.setBounds(127, 164, 121, 39);
		contentPane.add(arrayButton);
		
		JButton stackButton = new JButton("STACK");
		stackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack implementation code
			}
		});
		stackButton.setBackground(new Color(255, 0, 255));
		stackButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		stackButton.setBounds(129, 248, 119, 39);
		contentPane.add(stackButton);
		
		JButton btnNewButton = new JButton("QUEUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//queue implementation code
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(127, 332, 121, 39);
		contentPane.add(btnNewButton);
		
		JButton cQueueButton = new JButton("CIRCULAR QUEUE");
		cQueueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//circular queue implementation code
			}
		});
		cQueueButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		cQueueButton.setBounds(365, 164, 259, 39);
		contentPane.add(cQueueButton);
		
		JButton singlyLinkedListButton = new JButton("SINGLY LINKEDLIST");
		singlyLinkedListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//singly linkedlist implementation code
			}
		});
		singlyLinkedListButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		singlyLinkedListButton.setBounds(365, 248, 289, 39);
		contentPane.add(singlyLinkedListButton);
		
		JButton doublyLinkedList = new JButton("DOUBLY LINKEDLIST");
		doublyLinkedList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//doubly linkedlist implementation code
			}
		});
		doublyLinkedList.setBackground(new Color(230, 230, 250));
		doublyLinkedList.setFont(new Font("Times New Roman", Font.BOLD, 25));
		doublyLinkedList.setBounds(365, 332, 301, 39);
		contentPane.add(doublyLinkedList);
	}
}
