package Main;

/**
 * Modella una persona molto semplice.
 */
public class Persona {

    // --- Campi (stato) ---
    // Le variabili d'istanza descrivono lo stato di OGNI singola Persona
    String nome;        // accesso di default (package-private) per semplicità
    double altezza;     // in metri

    // --- Costruttori ---
    // Costruttore senza argomenti (valori di default)
    public Persona() {
        this.nome = "Sconosciuto";
        this.altezza = 1.70;
    }

    // Costruttore con argomenti (inizializza da subito i campi)
    public Persona(String nome, double altezza) {
        this.nome = nome;          // "this" = riferimento all'oggetto corrente
        this.altezza = altezza;
    }

    // --- Metodi (comportamenti) ---
    public void saluta() {
        System.out.println("Ciao! Sono " + nome + " e sono alto " + altezza + " m.");
    }

    // Cambia il nome della persona
    public void cambiaNome(String nuovoNome) {
        this.nome = nuovoNome;
    }

    // Restituisce una descrizione testuale dell'oggetto
    @Override
    public String toString() {
        return "Persona{nome='" + nome + "', altezza=" + altezza + "}";
    }
}
