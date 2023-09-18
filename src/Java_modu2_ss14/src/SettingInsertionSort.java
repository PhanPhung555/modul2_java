import java.util.Arrays;

public class SettingInsertionSort {
    public static void main(String[] args) {
        int[] num = {1,4,5,2,3,79,5,3,12,10};
        System.out.println("Mảng Trước Khi Xắp Xếp " + Arrays.toString(num));
        insertionSort(num);
        System.out.println("Mảng Sau Khi Xắp Xếp " + Arrays.toString(num));
    }
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > current) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
            System.out.println("Từng Bước Xắp Xếp "+ i +" : ");
            printArray(list);
        }

    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
