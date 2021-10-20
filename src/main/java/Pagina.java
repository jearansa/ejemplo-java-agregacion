//Fichero �Pagina.java�

public class Pagina {

	//Atributos de instancia
	private String contenido;
	private int numero;

	//Constructores
	public Pagina (String contenido, int numero){
		this.contenido = contenido;
		this.numero = numero;
	}

	//Metodos de instancia
	public String getContenido (){
		return this.contenido;
	}

	public void setContenido (String nuevo_contenido){
		this.contenido = nuevo_contenido;
	}

	public int getNumero (){
		return this.numero;
	}

	public void setNumero (int nuevo_numero){
		this.numero = nuevo_numero;
	}

}
