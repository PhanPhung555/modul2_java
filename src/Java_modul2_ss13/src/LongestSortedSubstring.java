import java.util.Arrays;
import java.util.Scanner;

public class LongestSortedSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String inputString = scanner.nextLine();

        String longestSortedSubstring = findLongestSortedSubstring(inputString);
        System.out.println("Chuỗi con được sắp xếp theo thứ tự có độ dài lớn nhất: " + longestSortedSubstring);
    }

    public static String findLongestSortedSubstring(String str) {
        String[] substrings = new String[str.length() * (str.length() + 1) / 2];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substrings[index++] = str.substring(i, j);
            }
        }

        String longestSortedSubstring = "";
        for (int i = 0; i < substrings.length; i++) {
            String sortedSubstring = sortString(substrings[i]);
            if (sortedSubstring.length() > longestSortedSubstring.length()) {
                longestSortedSubstring = sortedSubstring;
            }
        }
        return longestSortedSubstring;
    }
    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}


