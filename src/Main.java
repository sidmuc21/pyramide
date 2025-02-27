public class Main {
    public static void main(String[] args) {
        QuadratischePyramide pyramide = new QuadratischePyramide(10, 5);
        double volumen = pyramide.volumen();
        System.out.println("The volume of the pyramid is: " + volumen);
    }
}