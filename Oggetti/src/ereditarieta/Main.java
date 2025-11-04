package ereditarieta;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 Persona p1 = new Persona("Luca", 30);
	        Persona p2 = new Studente("Sara", 21, "S1234", "Informatica");   // upcast implicito
	        Persona p3 = new Dipendente("Marco", 40, "Backend Dev", 48_000);

	        // --- Polimorfismo: stessa chiamata, comportamento diverso ---
	        List<Persona> persone = List.of(p1, p2, p3);
	        for (Persona p : persone) {
	            System.out.println(p.descrivi());  // chiama la versione “giusta” a runtime
	        }

	        // --- Metodi specifici di sottoclasse: serve downcast sicuro ---
	        if (p2 instanceof Studente s) {
	            s.studia("Reti");
	        }
	        if (p3 instanceof Dipendente d) {
	            System.out.println("Bonus annuo di " + d.getNome() + ": € " + (int)d.bonusAnnuale());
	        }


	}

}
