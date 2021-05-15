package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agregar extends JFrame {

	private JPanel comboGenero;
	private JTextField txtNombre;

	/**
	 * Create the frame.
	 */
	public Agregar() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 295);
		comboGenero = new JPanel();
		comboGenero.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(comboGenero);
		comboGenero.setLayout(null);
		
		JLabel labelID = new JLabel("ID");
		labelID.setBounds(94, 42, 46, 14);
		comboGenero.add(labelID);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(94, 82, 46, 14);
		comboGenero.add(labelNombre);
		
		JLabel labelGenero = new JLabel("Genero");
		labelGenero.setBounds(94, 132, 46, 14);
		comboGenero.add(labelGenero);
		
		JLabel ID = new JLabel("");
		ID.setBounds(220, 42, 46, 14);
		comboGenero.add(ID);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(220, 79, 86, 20);
		comboGenero.add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(220, 129, 86, 20);
		comboGenero.add(comboBox);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(94, 180, 89, 23);
		comboGenero.add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		comboGenero.add(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Principal");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Principal pri = new Principal();
				pri.setVisible(true);
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Listar li = new Listar();
				li.setVisible(true);
			}
		});
		mnPeliculas.add(mntmListar);
	}
}
