package Java_Mcv.src.inputvalidation;

import Java_Mcv.src.exception.NotFoundException;

import java.util.Scanner;

public class InputValidator {
    private final Scanner scanner = new Scanner(System.in);

    public String getStringValue(String strs) {
        NotFoundException notFoundException = new NotFoundException();
        do {
            try {
                if (!strs.isEmpty() && strs.matches("^DT.*")) {
                    break;
                } else {
                    System.out.println("Bạn Đã Sai Cú Pháp Hoặc Chuỗi Rổng");
                    System.out.print("Nhập lại : ");
                    strs = scanner.nextLine();
                }
            } catch (Exception e) {
                notFoundException.getMessage("Kiểu Dữ liệu sai");
                strs = scanner.nextLine();
            }
        } while (strs.isEmpty() || !strs.matches("^DT.*"));
        return strs;
    }
    public int getIntValue(int num) {
        NotFoundException notFoundException = new NotFoundException();
        do {
            try {
                if (num >= 20 && num <= 100) {
                    break;
                } else {
                    System.out.println("Num phải lớn hơn 20 và nhỏ hơn 100");
                    System.out.print("Nhập lại : ");
                    num = Integer.parseInt(scanner.nextLine());
                }
            } catch (Exception e) {
                notFoundException.getMessage("Kiểu Dữ liệu sai");
                System.out.print("Nhập Lại : ");
                num = Integer.parseInt(scanner.nextLine());
            }
        } while (true);
        return num;
    }

    public String checkStringData(String strs) {
        while (strs.isEmpty()) {
            if (!strs.isEmpty() && strs.matches("DT")) {
                break;
            } else {
                System.out.print("Nhập lại a : ");
                strs = scanner.nextLine();
            }
        }
        return strs;
    }

    public String checkInputWithRegex(String str) {
        do {
            if (str.isEmpty()) {
                System.out.println("Đầu vào không được để trống. Vui lòng nhập lại.");
                System.out.print("Nhập lại :");
                str = scanner.nextLine();
            } else if (!str.matches("^DT.*")) {
                System.out.println("Đầu vào không khớp với regex '" + "DT" + "'. Vui lòng nhập lại.");
                System.out.print("Nhập lại :");
                str = scanner.nextLine();
            }
        } while (str.isEmpty() || !str.matches("^DT.*"));

        return str;
    }

    public int checkDigitalData(int num) {
        while (true) {
            if (num > 50 && num < 200) {
                break;
            } else {
                System.out.print("Nhập lại Price : ");
                num = Integer.parseInt(scanner.nextLine());
            }
        }
        return num;
    }
}
