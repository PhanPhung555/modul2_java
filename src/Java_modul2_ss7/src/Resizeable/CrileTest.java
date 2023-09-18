package Resizeable;

import java.util.Scanner;

public class CrileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 6;
        int[] num = {10, 20, 4, 3, 6, 6};

        int index = -1;


        System.out.print("Nhập pt xóa : ");

        int x = Integer.parseInt(scanner.nextLine());
        boolean b = false;
        for (int i = 0; i < num.length; i++) {
            if (x == num[i]) {
                index = i;
                deleteArray(x, num, index);
                b = true;
            } 
        }
        if(!b) {
            System.out.println("rông");
        }
    }

    static void deleteArray(int x, int[] num, int index) {
        if (index != -1) {
            for (int i = index; i < num.length - 1; i++) {
                num[i] = num[i + 1];
            }
        }
        num[num.length - 1] = 0;
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j] + " ");
        }
    }

}
