import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập USD : ");
        int num = Integer.parseInt(scanner.nextLine());
        int Usd = num * 23000;
        System.out.println("Số Tiền Của Bạn : " + Usd);
    }
}
