package com.uem.views;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import java.awt.Label;
import java.awt.Button;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;

public class Alugai {

	public JFrame frame;
	private JTextField textField;
	private JPanel panel;
	private JPanel panel1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alugai window = new Alugai();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Alugai() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Alugaí 1.0");
		frame.setBounds(100, 100, 800, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(166, 106, 453, 38);
		frame.getContentPane().add(menuBar);
				
		Button button_3 = new Button("Home");
		menuBar.add(button_3);
		
		Button button_2 = new Button("Cadastro");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TelaCadastros telaCadastros = new TelaCadastros();
				telaCadastros.frame.setVisible(true);
				
			}
		});
		menuBar.add(button_2);
		
		Button button_1 = new Button("Locação");
		menuBar.add(button_1);
		
		Button button = new Button("Busca");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel1 = new JPanel();
				panel1.setBounds(0, 145, 784, 474);	
				
				JButton btnNewButton_2 = new JButton("Buscar Filme");				
				panel1.add(btnNewButton_2);
				
				JButton btnNewButton_3 = new JButton("Buscar Cliente");				
				panel1.add(btnNewButton_3);
				
				frame.add(panel1);
				
				panel1.setBounds(0, 145, 784, 474);	
				btnNewButton_2.setBounds(198, 105, 388, 47);
				btnNewButton_3.setBounds(198, 180, 388, 47);
			}
		});
		menuBar.add(button);
		
		Label label = new Label("Alugaí");
		label.setFont(new Font("Arial", Font.BOLD, 50));
		label.setBounds(294, 10, 166, 65);
		frame.getContentPane().add(label);
		
		
		//JLabel label_1 = new JLabel("teste");
	//	Image img = new ImageIcon(this.getClass().getResource("/filmadora2.jpg")).getImage();
	//	label_1.setIcon(new ImageIcon(img));
		//label_1.setBounds(480, 10, 111, 65);
		//frame.getContentPane().add(label_1);	
	}
}
