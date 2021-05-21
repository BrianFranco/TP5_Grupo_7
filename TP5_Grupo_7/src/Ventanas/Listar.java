package Ventanas;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import Clases.Pelicula;
import java.awt.Font;

public class Listar extends JPanel {
	//Attributes
	private static final long serialVersionUID = 1L;
	private JLabel lblPeliculas;
	private JList<Pelicula> jList;
	private DefaultListModel<Pelicula> dlPelicula;
	//Constructor
	public Listar() {
		setLayout(null);
		
		DibujarLabel();
		DibujarJList();
	}
	//Agrego el label al panel 
	private void DibujarLabel() {
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(10, 140, 57, 17);
		lblPeliculas.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblPeliculas);
	}
	//Agrego el Jlist al panel
	private void DibujarJList() {
		jList = new JList<Pelicula>();
		jList.setFont(new Font("Arial", Font.PLAIN, 11));
		jList.setBounds(80, 50, 300, 200);
		add(jList);
	}
	//Recupero los datos almacenados en DefaultListModel
	public void setDefaultListModel(DefaultListModel<Pelicula> dlPelicula2) {
		this.dlPelicula = dlPelicula2;
		jList.setModel(this.dlPelicula);
		
	}
}