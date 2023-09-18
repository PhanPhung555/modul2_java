import java.util.Scanner;

public class Tinhtongcot {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3, 4}, {3, 4, 6, 7}};
        int n = num.length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cột muốn tính ? ");
        int x = Integer.parseInt(scanner.nextLine());
        int cout = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cout += num[i][x];
                break;
            }

        }
        System.out.println(cout);
    }
}

