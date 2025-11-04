package ereditarieta;

class Persona {
    private final String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public final String getNome() {   // final: non sovrascrivibile
        return nome;
    }

    public int getEta() { return eta; }
    public void setEta(int eta) { this.eta = eta; }

    /** Metodo “base” che le sottoclassi potranno sovrascrivere */
    public String descrivi() {
        return "Persona: " + nome + " (" + eta + " anni)";
    }

    public void saluta() {
        System.out.println("Ciao, sono " + nome + "!");
    }
}