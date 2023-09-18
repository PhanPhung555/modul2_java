import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanTimKiem {
    public static void main(String[] args) {
       arr();
    }

    public static void arr(){
        int num;
        int num1;
        int[] arr1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhập pt mảng : ");
            num = Integer.parseInt(scanner.nextLine());
            arr1 = new int[num];

            for (int i = 0 ; i < arr1.length; i++){
                System.out.print("Nhập pt mảng thứ  : " + (i +1) );
                arr1[i] = Integer.parseInt(scanner.nextLine());
            }

        }while (false );

        System.out.println("Mảng Ban đầu"+Arrays.toString(arr1));

//        Xắp xếp
        bubbleSort ( arr1);

//        Tìm Kiếm
        System.out.print("Nhập Phần Tử Cần Tìm ?  : ");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Vị trí phần tử : "+binarySearch(arr1,num1,0,arr1.length -1));

    }
//  Foamy Sort
    public static void bubbleSort(int[] num) {
        boolean check = true;
        for (int i = 0; i < num.length; i++) {
            check = false;
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    check = true;
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                }
            }
        }
        System.out.println( "Mảng Sau Khi Xắp Xếp "+Arrays.toString(num));
    }

//  Binary Search
    public static int binarySearch(int[] num, int k, int left, int right) {
        if (right >= left) {

            int mid = (left + right) / 2;

            if (k == num[mid]) {
                return mid;
            }

            if (k > num[mid]) {
                return binarySearch(num, k, mid + 1, right);
            }
            return binarySearch(num, k, left, mid - 1);
        }
        return -1;
    }


}
