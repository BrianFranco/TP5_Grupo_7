package Ventanas;


import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import Clases.Pelicula;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agregar extends JPanel {
	//Attributes
	private static final long serialVersionUID = 1L;
	//Labels
	private JLabel lblId;
	private JLabel labelid;
	private JLabel lblNombre;
	private JLabel lblCategoria;
	//Inputs
	private JTextField textNombre;
	private JComboBox <String>cbGenero;
	//Button
	private JButton btnAceptar;
	
	private DefaultListModel<Pelicula> dlPelicula;
	//Constructor
	public Agregar() {
		
		setLayout(null);
		
		DibujarLabels();
		DibujarInputs();
		DibujarButtonAceptar();
		
		
	}
	//Agrego BtnAceptar y actionListener
	private void DibujarButtonAceptar() {
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(101, 250, 125, 30);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbGenero.getSelectedIndex() == 0 || textNombre.getText().isEmpty()) {
					String msj;
					if(cbGenero.getSelectedIndex() == 0 && textNombre.getText().isEmpty()) {
						msj="Completar el nombre y seleccionar un genero.";
					}else if(textNombre.getText().isEmpty()) {
						msj="Completar el nombre.";
					}else {
						msj="Seleccionar un genero";
					}
					JOptionPane.showMessageDialog(null,msj,"Error",JOptionPane.ERROR_MESSAGE);
				}else {
					Pelicula peli = new Pelicula(textNombre.getText(),cbGenero.getSelectedItem().toString());
					dlPelicula.add(CompararNombresPeliculas(peli), peli);
					
					textNombre.setText("");
					cbGenero.setSelectedIndex(0);
					labelid.setText(Integer.toString(Pelicula.getContPel()));
					JOptionPane.showMessageDialog(null, "Se cargo la pelicula correctamente.");
				}
			}
		});
		add(btnAceptar);
	}
	//Agrego los inputs al panel
	private void DibujarInputs() {
		//
		textNombre = new JTextField();
		textNombre.setBounds(236, 150, 125, 30);
		textNombre.setColumns(10);
		add(textNombre);
		//
		cbGenero = new JComboBox<String>();
		cbGenero.addItem("-Seleccione un género-");
		cbGenero.addItem("Terror");
		cbGenero.addItem("Acción");
		cbGenero.addItem("Suspenso");
		cbGenero.addItem("Romántica");	
		cbGenero.setBounds(236, 200, 125, 30);
		add(cbGenero);
	}
	//Agrego los labels al panel
	private void DibujarLabels() {
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId.setBounds(101, 100, 125, 30);
		add(lblId);
		
		labelid = new JLabel("");
		labelid.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelid.setBounds(236, 100, 125, 30);
		labelid.setText(Integer.toString(Pelicula.getContPel()));
		add(labelid);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(101, 150, 125, 30);
		add(lblNombre);
		
		lblCategoria = new JLabel("Genero");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategoria.setBounds(101, 200, 125, 30);
		add(lblCategoria);
	}
	//Recupero los datos almacenados en DefaultListModel
	public void setDefaultListModel(DefaultListModel<Pelicula> ModelRecibido)
	{
		this.dlPelicula = ModelRecibido;
	}
	//Compara el nombre de la pelicula y indica en que posicion del DefaultListModel debe ir
	private int CompararNombresPeliculas(Pelicula peli) {
		int index;
		for(index=0;index<dlPelicula.getSize();index++) {
			int compare = peli.compareTo(dlPelicula.elementAt(index));
			if(compare < 0 || compare == 0) {
				return index;
			}
		}
		return index;
	}
}
