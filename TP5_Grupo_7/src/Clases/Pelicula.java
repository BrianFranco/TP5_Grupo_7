package Clases;

public class Pelicula{
	//Attributes
	private final int id;
	private String nombre;
	private Categoria genero;
	private static int contPeliculas=1; 
	//Constructors
	public Pelicula() {
		this.id=contPeliculas++;
		this.nombre="";
		this.genero.setGenero("");
	}
	public Pelicula(String nombre,String genero) {
		this.id = contPeliculas++;
		this.nombre = nombre;
		this.genero.setGenero(genero);
	}
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//toString
	@Override
	public String toString() {
		return " Nombre: " + nombre + ", Genero: " + genero + ", ID: "+ id;
	}
	
	
}
