import java.util.Arrays;
import java.util.Scanner;

public class SortedSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String inputString = scanner.nextLine();

        String sortedSubstring = sortSubstring(inputString);
        System.out.println("Chuỗi kí tự con được sắp xếp: " + sortedSubstring);
    }

    public static String sortSubstring(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
