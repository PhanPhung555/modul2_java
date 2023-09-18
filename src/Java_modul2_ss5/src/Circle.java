public class Circle {
    public static void main(String[] args) {
        TestCircle testCircle = new TestCircle();
        System.out.println(testCircle.getRadius());
    }


    public static class TestCircle {
        private double radius = 1.0;
        private String color = "red";

        public TestCircle() {
        }

        public TestCircle(double radius) {
            this.radius = radius;
        }

//        Default
//        Private
//        pulbic
//        protected
        double getRadius() {
            return radius;
        }

        String getArea() {
            return color;
        }


    }
}
