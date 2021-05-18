package Clases;

public class Categoria {
	//Attributes
	private String genero;
	//Constructors
	public Categoria() {
		this.genero = "";
	}
	public Categoria(String genero) {
		this.genero=genero;
	}
	//ToString
	@Override
	public String toString() {
		return genero;
	}
	//Getters and Setters
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
