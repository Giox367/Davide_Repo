package ereditarieta;

class Dipendente extends Persona {
    private String ruolo;
    private double stipendioAnnuale;

    public Dipendente(String nome, int eta, String ruolo, double stipendioAnnuale) {
        super(nome, eta);
        this.ruolo = ruolo;
        this.stipendioAnnuale = stipendioAnnuale;
    }

    public String getRuolo() { return ruolo; }
    public void setRuolo(String ruolo) { this.ruolo = ruolo; }

    public double getStipendioAnnuale() { return stipendioAnnuale; }
    public void setStipendioAnnuale(double s) { this.stipendioAnnuale = s; }

    @Override
    public String descrivi() {
        return "Dipendente: " + getNome() + " - " + ruolo + " - € " + (int)stipendioAnnuale;
    }

    public double bonusAnnuale() {
        return stipendioAnnuale * 0.10; // 10% come esempio
    }
}
