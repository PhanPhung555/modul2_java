package circleandylinder;

public class Circle {
    private double r ;
    private double d;
    private String color;

    public Circle(double r, String color,double d) {
        this.r = r;
        this.color = color;
        this.d = d;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    public double radius(){
        r = getD() / 2;
        return r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", d=" + d +
                ", color='" + color + '\'' +
                '}';
    }
}
