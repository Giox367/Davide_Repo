package Main;

public class App {

	public static void main(String[] args) {
		 // --- Creare oggetti (istanze) ---
        Persona davide = new Persona("Davide", 1.78); // usa il costruttore completo
        Persona sconosciuto = new Persona();          // usa il costruttore vuoto

        // --- Usare i metodi ---
        davide.saluta();
        sconosciuto.saluta();

        // --- Modificare lo stato di un oggetto ---
        sconosciuto.cambiaNome("Giovanni");
        sconosciuto.altezza = 1.52;  // qui modifichiamo direttamente il campo (ok ma poco sicuro)
        sconosciuto.saluta();

        // --- Stampa leggibile con toString() ---
        System.out.println(davide);       // chiama automaticamente toString()
        System.out.println(sconosciuto);

        // --- Più oggetti, ognuno con il proprio stato ---
        Persona giuseppe = new Persona();
        giuseppe.nome = "Giuseppe";
        giuseppe.altezza = 1.90;
        giuseppe.saluta();

	}

}
