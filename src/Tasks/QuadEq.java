package Tasks;

public class QuadEq {

    public void rootsCalc(double a, double b, double c) {
        Double x1 = 0.0;
        Double x2 = 0.0;
        final double D = (b * b) - 4 * a * c;
        if (D < 0) {
            x1 = null;
            x2 = null;
        } else if (D == 0) {
            x1 = -b / (2 * a);
        } else if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
        }

        if (D == 0)
            System.out.println("x = " + x1);
        else {
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
