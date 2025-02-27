public class QuadratischePyramide extends Pyramide {
    private double seite;
    public QuadratischePyramide(double hohe, double seite) {
        super(hohe);
        this.seite = seite;
    }
    @Override
    public double volumen() {
        return (1.0 / 3.0) * Math.pow(seite, 2) * getHohe();
    }
    public double getSeite() {
        return seite;
    }
}


