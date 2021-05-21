package Clases;

public class Pelicula implements Comparable<Pelicula>{
	//Attributes
	private final int id;
	private String nombre;
	private Categoria genero;
	private static int contPel = 1;
	//Constructors
	public Pelicula(){
		this.id = contPel++;
		this.nombre = "";
		this.genero = new Categoria();
	}
	public Pelicula(String nombre,String genero) {
		this.id = contPel++;
		this.nombre = nombre;
		this.genero = new Categoria(genero);
	}
	//Getters and Setters
	public int getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return this.genero.getGenero();
	}
	public void setGenero(String genero) {
		this.genero.setGenero(genero);
	}
	public static int getContPel() {
		return contPel;
	}
	public static void setContPel(int contPel) {
		Pelicula.contPel = contPel;
	}
	//toString
	@Override
	public String toString() {
		return "Pelicula = " + this.nombre + " -  Genero = " + this.genero + " - ID = "+this.id;
	}
	//compareTo
	@Override
	public int compareTo(Pelicula o) {
		return this.nombre.toLowerCase().compareTo(o.nombre.toLowerCase());
	}
}
