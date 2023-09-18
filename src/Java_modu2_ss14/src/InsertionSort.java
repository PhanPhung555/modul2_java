public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 4, 2, 6};
        System.out.print("Mảng ban đầu: ");
        insertionSort(arr);
        System.out.print("Mảng đã sắp xếp tăng dần: ");

    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
                System.out.print("Sắp xếp: ");
                displayArray(arr);
            }
            arr[j + 1] = current;
            System.out.print("Vị trí chèn " + current + ": ");
            displayArray(arr);
        }
    }
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
