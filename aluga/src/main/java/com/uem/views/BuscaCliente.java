package com.uem.views;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JComboBox;
import java.awt.ScrollPane;
import javax.swing.JButton;

public class BuscaCliente {

	private JTable table;
	private JFrame frame;
	private JTextField textFieldBuscaCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscaCliente window = new BuscaCliente();
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
	public BuscaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setTitle("Busca Filme");
		frame.getContentPane().setLayout(null);
		
		textFieldBuscaCliente = new JTextField();
		textFieldBuscaCliente.setBounds(23, 124, 510, 20);
		frame.getContentPane().add(textFieldBuscaCliente);
		textFieldBuscaCliente.setColumns(10);
		
		JLabel lblBuscarCliente = new JLabel("Filme:");
		lblBuscarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBuscarCliente.setBounds(23, 99, 41, 14);
		frame.getContentPane().add(lblBuscarCliente);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(557, 124, 74, 20);
		comboBox.addItem("Título");
		comboBox.addItem("Diretor");
		comboBox.addItem("Duração");
		comboBox.addItem("Gênero");
		frame.getContentPane().add(comboBox);
		
		
		JLabel lblBuscarPor = new JLabel("Buscar por:");
		lblBuscarPor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBuscarPor.setBounds(557, 99, 62, 14);
		frame.getContentPane().add(lblBuscarPor);
		
		JLabel lblBuscaCliente = new JLabel("Busca Filme");
		lblBuscaCliente.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblBuscaCliente.setBounds(238, 34, 307, 50);
		frame.getContentPane().add(lblBuscaCliente);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 183, 739, 368);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(table);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(659, 123, 102, 23);
		frame.getContentPane().add(btnBuscar);
		
		
	}
}
