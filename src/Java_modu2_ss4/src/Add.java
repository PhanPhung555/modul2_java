import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,8,0,0,0,0,0};
        int a;
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vị trí muốn thêm phần tử: ");
        int index = Integer.parseInt(sc.nextLine());
        if (index <= 1 || index >= arr.length - 1) {
            System.out.print("không chèn được phần tử vào mảng");
        } else {
            System.out.print("nhập vào giá trị bạn muốn chèn vào tại vị trí:" + index + " ");
            a = Integer.parseInt(sc.nextLine());
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
