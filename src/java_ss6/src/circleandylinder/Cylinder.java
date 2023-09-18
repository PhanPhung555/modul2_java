package circleandylinder;

public class Cylinder extends Circle{
    private int h;

    private final double PI = 3.14;

    public Cylinder(double r, String color, double d, int h) {
        super(r, color, d);
        this.h = h;
    }

    public Cylinder(int h) {
        this.h = h;
    }

    public Cylinder() {
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double volume(){
        double v = getH() * PI * Math.sqrt(radius());
        return v;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "r=" + getR() +
                "color=" + getColor() +
                "h=" + h +
                '}';
    }
}
