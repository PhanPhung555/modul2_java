import java.util.Scanner;

//LỚP CHA

public class CanbachaiMain {
    public static void main(String[] args) {
        QuadraticEquation numbachai = new QuadraticEquation();

//        Nhập a b c từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap b ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap c ");
        double c = Double.parseDouble(scanner.nextLine());

//         Thêm a b c vào các phương thức đã tạo
        numbachai.setA(a);
        numbachai.setB(b);
        numbachai.setC(c);

//        in ra Denta
        System.out.println(numbachai.Denta());

//        Kiểm tra Denta va in ra ket qua
        if (numbachai.Denta() > 0) {
            System.out.println("Pt co 2 nghiem la x1 " + numbachai.getRoot1() + " Va x2 " + numbachai.getRoot2());
        } else if (numbachai.Denta() == 0) {
            System.out.println("Pt co 1 nghiem la " + numbachai.getcod());
        } else {
            System.out.println("The equation has no roots");
        }

    }


// LỚP QUADRATICEQUATION
    public static class QuadraticEquation {

        double a ,b ,c;

        public QuadraticEquation() {
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }
    //    Denta
        public double Denta(){
            return Math.round(Math.pow(getB(),2)) - (4 * getC() * getA());
        };
    //    Phuong trinh co 1 nghiem
        public double getcod(){
            return -getB() / 2 * getA() ;
        }

    //    Nghiem 1 và Nghiem 2
        public double getRoot1(){
            return (-getB() + Math.sqrt(Denta())) / (2 * getA());
        }
        public double getRoot2(){
            return (-getB() - Math.sqrt(Denta())) / (2 * getA());

        }



    }
}


























