public class Mainclas {
    public static void main(String[] args) {
        Circle circle = new Circle.Cylinder();
        System.out.println(circle.toString());
    }

    // LỚP CHA CIRCLE
    public static class Circle {

        //    Trường dữ liệu
        private double radius;
        private String color;
        private int s;


        //    Contrustor
        public Circle() {
        }

        public Circle(double radius, String color, int s) {
            this.radius = radius;
            this.color = color;
            this.s = s;
        }

        //    Getter và Setter
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getS() {
            return s;
        }

        public void setS(int s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "Mainclas.Circle{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    ", s=" + s +
                    '}';
        }


        //    LỚP CLASS CON CỦA CIRCLE
        public static class Cylinder extends Circle {
            private int height;
            private int V;

            public Cylinder() {
            }

            public Cylinder(int height, int V) {
                this.height = height;
                this.V = V;
            }

            public Cylinder(double radius, String color, int s, int height, int V) {
                super(radius, color, s);
                this.height = height;
                this.V = V;


            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getV() {
                return V;
            }

            public void setV(int v) {
                V = v;
            }

            @Override
            public String toString() {
                return "Mainclas.Circle.Cylinder{" +
                        "height=" + height +
                        ", V=" + V +
                        '}';
            }
        }
    }
}
