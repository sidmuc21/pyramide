public abstract class Pyramide {
    private double hohe;
    public abstract double volumen();
    public abstract double calcoberflache();

    public Pyramide(double hohe) {
        this.hohe = hohe;
    }
    public double getHohe() {
        return hohe;
    }
}
