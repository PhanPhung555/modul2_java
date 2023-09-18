import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {
        int count = 0;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số lượng số nguyên tố muốn in: ");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 2; count < number; i++) {
            a = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    a++;
                }
            }
            if (a == 2) {
                count++;
                System.out.println(i);
            }
        }
    }
}
