import java.util.Scanner;

public class Fanclass {
    public static void main(String[] args) {
        Fan fan = new Fan();
//        Tốc độ quạt
        fan.setFAST(3);
        fan.setMEDIUM(2);
        fan.setSLOW(1);

//        Mắc định quạt chạy = 1
        fan.setSpeed(fan.getSLOW());

 //        Bán kính 5
        fan.setRadius(5.0d);

//        Trạng thái mắc định là off
        fan.setOn(false);

//        Màu quạt là blue
        fan.setColor("Blue");

//      Thay đổi giá trị on để quạt bật hay tắt
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn Muốn Bật Quạt ? ");
        fan.setOn(scanner.nextBoolean());
//        Trả về
        if (fan.isOn() == true){
            System.out.println(fan.toString() + " - Fanclass.Fan is on");
        }else {
            System.out.println(fan.Tostring() + " - Fanclass.Fan is off");
        }
    }

//    CLASS
    public static class Fan {
//        KHAI BÁO CÁC ĐẶC ĐIỂM CỦA QUẠT
        int SLOW, MEDIUM, FAST;
        private int speed;
        private boolean on;
        private double radius;
        String color;
//    BẢN THIẾT KẾ
        public Fan(int SLOW, int MEDIUM, int FAST, int speed, boolean on, double radius, String color) {
            this.SLOW = SLOW;
            this.MEDIUM = MEDIUM;
            this.FAST = FAST;
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }
//    CLASS MẮC ĐỊNH KO THAM SỐ
        public Fan() {

        }
//    GETTER VÀ SETTER
        public int getSLOW() {
            return SLOW;
        }

        public void setSLOW(int SLOW) {
            this.SLOW = SLOW;
        }

        public int getMEDIUM() {
            return MEDIUM;
        }

        public void setMEDIUM(int MEDIUM) {
            this.MEDIUM = MEDIUM;
        }

        public int getFAST() {
            return FAST;
        }

        public void setFAST(int FAST) {
            this.FAST = FAST;
        }

        public int getSpeed() {
            return speed;
        }


        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

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

//        TOSTRING ĐỂ TRẢ VỀ
        @Override
        public String toString() {
            return "Fanclass.Fan{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

        public String Tostring() {
            return "Fanclass.Fan{" +
                    "speed=" + speed +
                    ", color='" + color + '\'' +
                    '}';
        }



    }
}
