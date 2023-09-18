public class AcsetModifiner {
    public static void main(String[] args) {
        Circle cr1 = new Circle();
        System.out.println(cr1.getArea());
        System.out.println(cr1.getRadius());
        Circle cr2 = new Circle();
        System.out.println(cr2.getRadius());
        System.out.println(cr2.getArea());
    }

    static class Circle {
        private double radius = 1;
        private String color = "red";

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }
    }
}
