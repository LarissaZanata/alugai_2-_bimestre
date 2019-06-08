package com.uem.views;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Busca {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Busca window = new Busca();
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
	public Busca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("Busca");
		frame.getContentPane().setLayout(null);
		
		JButton btnBuscarFilme = new JButton("Buscar Filmes");
		btnBuscarFilme.setBounds(198, 208, 388, 47);
		frame.getContentPane().add(btnBuscarFilme);
		
		JButton btnBuscarClientes = new JButton("Buscar Clientes");
		btnBuscarClientes.setBounds(198, 292, 388, 47);
		frame.getContentPane().add(btnBuscarClientes);
		
		JLabel lblBusca = new JLabel("Busca");
		lblBusca.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblBusca.setBounds(309, 34, 166, 47);
		frame.getContentPane().add(lblBusca);
		

	}
}
