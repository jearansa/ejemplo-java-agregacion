public class Principal_EjemploLibroPagina{

	public static void main (String [] args){

		//Declaración y definición de objetos
		Libro el_quijote = new Libro ("Don Quijote de La Mancha", 1234567890, "Miguel de Cervantes", 1605);
		Pagina pagina1 = new Pagina ("En un lugar de La Mancha, de cuyo nombre ...", 1);
		Pagina pagina2 = new Pagina ("...no ha mucho tiempo que vivia un hidalgo de los de lanza en astillero, adarga antigua, rocin flaco y galgo corredor...",2);

		//Pasamos al objeto Libro los objetos del tipo Pagina
		el_quijote.anyadirPagina (pagina1);
		el_quijote.anyadirPagina (pagina2);
		
		// Mostramos por pantalla los contenidos de todas las páginas del objeto Libro:
		for (int i = 1; i <= el_quijote.getNumeroPaginas(); i++){
			System.out.println(el_quijote.getPaginaNumero(i).getContenido());
		}
	}
}