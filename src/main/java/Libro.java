//Fichero Libro.java

public class Libro{

	// Constantes de clase
	private static final int MAX = 1000;
	// Atributos
	private String titulo;
	private long isbn;
	private String autor;
	private int anyoPublicacion;

	// Atributos representando la relación de composición
	private Pagina [] paginas;
	private int numeroPaginas;

	// Constructores

	public Libro(String titulo, long isbn, String autor, int anyoPublicacion){

		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
		// Reservamos espacio en memoria para el objeto “array”:
		this.paginas = new Pagina [Libro.MAX];
		// Reservamos espacio en memoria para las páginas:
		// Esta es una decisión "controvertida"; podemos asumir que todas ellas
		// son null y trabajar de esa forma
		for (int i = 0; i < Libro.MAX; i++){
			this.paginas [i] = new Pagina ("", 0);
		}
		this.numeroPaginas = 0;
	}

	// Métodos de instancia

	public String getTitulo (){
		return this.titulo;
	}

	public void setTitulo (String titulo){
		this.titulo = titulo;
	}

	public long getIsbn (){
		return this.isbn;
	}

	public void setIsbn (long nuevo_isbn){
		this.isbn = nuevo_isbn;
	}

	public String getAutor (){
		return this.autor;
	}

	public void setAutor (String nuevo_autor){
		this.autor = nuevo_autor;
	}

	public int getAnyoPublicacion (){
		return this.anyoPublicacion;
	}

	public void setAnyoPublicacion (int nuevo_anyoPublicacion){
		this.anyoPublicacion = nuevo_anyoPublicacion;
	}

	//Métodos para trabajar con la clase compuesta
	public int getNumeroPaginas (){
		return this.numeroPaginas;
	}

	public void anyadirPagina (Pagina nueva_pagina){
		if (this.numeroPaginas < Libro.MAX){
			this.paginas [this.numeroPaginas] = nueva_pagina;
			this.numeroPaginas++;
		}
	}

	public Pagina getPaginaNumero (int numero_pagina){
		for (int i = 0; i < this.numeroPaginas; i++){
			if (this.paginas[i].getNumero() == numero_pagina){
					return this.paginas[i];
				}
			}
		return null;
	}
}