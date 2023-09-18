import java.util.Scanner;

public class Kiemtrasonguynto {
    public static void main(String[] args) {
//        bước 1 : Khai baó biến và nhận đọ dài từ mảng
        Scanner num = new Scanner(System.in);
        int n;
        int cout = 0;
//       Bước 2 nhận phần tử cho mảng, kiểm tra number người chơi nhập vào lớn hơn 0
        do {
            System.out.print("Nhập Độ dài mảng : ");
            n = Integer.parseInt(num.nextLine());
            if (n < 0) {
                System.out.println("Mời Nhập lại  ");
            }
        } while (n < 0);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu a[%d] ", i + 1);
            arr[i] = Integer.parseInt(num.nextLine());
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] < 2) {
                System.out.println("Ko phai so nguyen to");
            } else if (arr[j] == 2) {
                System.out.println("So nguyen to");
            } else {
                for (int N = 2; N < n ; N++) {
                    if(arr[j] % N == 0){
                        System.out.println("No so nguyen to");
                        break;
                    } else {
                        System.out.println( "so ngyen to");
                        break;
                    }
                }
            }

        }
    }
};