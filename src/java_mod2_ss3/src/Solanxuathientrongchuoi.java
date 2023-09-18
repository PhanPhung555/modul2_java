import java.util.Scanner;

public class Solanxuathientrongchuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Chuỗi : ");
        String str = scanner.nextLine();

        char inputstr  = 'a';
        int cout = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == inputstr){
                cout++;
            }
        }
        System.out.println(cout);
    }
}
