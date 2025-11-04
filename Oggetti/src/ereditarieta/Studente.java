package ereditarieta;

class Studente extends Persona {
    private final String matricola;
    private String corso;

    public Studente(String nome, int eta, String matricola, String corso) {
        super(nome, eta);            // 1) chiama il costruttore di Persona
        this.matricola = matricola;
        this.corso = corso;
    }

    public String getMatricola() { return matricola; }
    public String getCorso() { return corso; }
    public void setCorso(String corso) { this.corso = corso; }

    @Override                       // 2) override del metodo della base
    public String descrivi() {
        // 3) uso di super.descrivi() per riusare la logica base
        return super.descrivi() + " - Studente: " + matricola + " (" + corso + ")";
    }

    public void studia(String materia) {
        System.out.println(getNome() + " sta studiando " + materia);
    }
}
