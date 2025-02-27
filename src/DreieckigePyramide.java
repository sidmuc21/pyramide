public class DreieckigePyramide extends Pyramide {
    private double seite;


    public DreieckigePyramide(double hohe, double seite) {
        super(hohe);
        this.seite = seite;
    }


    @Override
    public double volumen() {

        double baseArea = (Math.sqrt(3) / 4) * Math.pow(seite, 2);

        return (1.0 / 3.0) * baseArea * getHohe();
    }


    @Override
    public double calcoberlache() {

        double baseArea = (Math.sqrt(3) / 4) * Math.pow(seite, 2);


        double slantHeight = Math.sqrt(Math.pow(seite / 2, 2) + Math.pow(getHohe(), 2));


        double perimeter = 3 * seite;


        double lateralSurfaceArea = 0.5 * perimeter * slantHeight;


        return baseArea + lateralSurfaceArea;
    }


    public double getSeite() {
        return seite;
    }
}