import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        add();
    }

    public static void add() {
        int num;
        int num1;
        int[] number;
        Scanner scanner = new Scanner(System.in);

//        Nhập mảng
        do {
            System.out.print("Nhập pt mảng : ");
            num = Integer.parseInt(scanner.nextLine());
            number = new int[num];

            for (int i = 0; i < number.length; i++) {
                System.out.print("Nhập pt thứ " + (i + 1));
                number[i] = Integer.parseInt(scanner.nextLine());
            }

        } while (false);
        System.out.println("Mảng : "+Arrays.toString(number));

//        Phần tử cần xóa
        System.out.println("Nhập pt xóa");
        num1 = Integer.parseInt(scanner.nextLine());
        delete(number,num1);
    }


    public static void delete(int[] arr, int k) {

        // Tìm vị trí của phần tử cần xóa
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            // Tạo một mảng mới có kích thước nhỏ hơn
            int[] newArr = new int[arr.length - 1];

            // Sao chép tất cả các phần tử vào mảng mới (trừ phần tử cần xóa)
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j] = arr[i];
                    j++;
                }
            }

            arr = newArr;

            // In mảng mới sau khi xóa
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Không tìm thấy phần tử cần xóa.");
        }
    }
}


