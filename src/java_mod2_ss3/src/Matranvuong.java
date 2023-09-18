import java.util.Scanner;

public class Matranvuong {
    public static void main(String[] args) {
//        Bước 1 : lấy độ dài mảng 2 chiều
        int num;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số : ");
            num = Integer.parseInt(scanner.nextLine());
            if (num < 0) {
                System.out.println("Mời NHập lại");
            }
        } while (num < 0);
//      bước 2 :  Khai bao Array
        int[][] arr = new int[num][num];
//        Bước 3 : NHập phần tử mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.printf("Nhập phần tử mảng %d ", i);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
//        Bước 4 : truy xuất vị trí , tính tổng đường chéo từ trái sang phải
        int cout = 0;
        int cout1 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    cout += arr[i][j];
                }
            }
        }
//        Bước 5 : đảo ngược phần tử mảng 2 chiều
        System.out.println(cout);
        for(int i = 0 ; i < arr.length ;i++){
            for (int j = 0 ; j < arr.length / 2; j++){
                int numlength = arr.length;
                int temp = arr[i][j];
                arr[i][j] = arr[i][numlength - j - 1];
                arr[i][numlength - j - 1] = temp;
            }
        }
//        Bước 6 : tính đường chéo còn lại
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    cout1 += arr[i][j];
                }
            }
        }
        System.out.println(cout1);

    }
}
