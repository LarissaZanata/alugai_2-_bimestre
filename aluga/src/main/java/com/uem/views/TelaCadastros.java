package com.uem.views;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaCadastros {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastros window = new TelaCadastros();
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
	public TelaCadastros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Cadastrar Filme");
		btnNewButton_1.addMouseListener(new MouseAdapter(){					
			public void mouseClicked(MouseEvent arg0) {
				CadastrarFilme cadastroFilmeTela = new CadastrarFilme();
				cadastroFilmeTela.frame.setVisible(true);
			}
		});
		
	
		
	frame.getContentPane().add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("Cadastrar Cliente");				
	frame.getContentPane().add(btnNewButton_2);
	
	JButton btnNewButton_3 = new JButton("Cadastrar Funcionário");				
	frame.getContentPane().add(btnNewButton_3);
	
	
	btnNewButton_1.setBounds(198, 200, 388, 47);
	btnNewButton_2.setBounds(198, 275, 388, 47);
	btnNewButton_3.setBounds(198, 350, 388, 47);
	
	JLabel lblCadastro = new JLabel("Cadastro");
	lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 50));
	lblCadastro.setBounds(275, 32, 233, 87);
	frame.getContentPane().add(lblCadastro);
	}
}
