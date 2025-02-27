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
    public double calcoberlache() {
        double basearea = Math.pow(seite, 2);
        double slantheight = Math.sqrt(Math.pow(seite / 2, 2) + Math.pow(getHohe(), 2));
        double perimeter = 4 * seite;
        double surfarea = 0.5 * perimeter * slantheight;
        return basearea + surfarea;
    }
    public double getSeite() {
        return seite;
    }

}


