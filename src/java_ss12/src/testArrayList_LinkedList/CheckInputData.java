package testArrayList_LinkedList;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckInputData {

    Scanner scanner = new Scanner(System.in);

    public int dataNumber() {
        int a = 0;
        while (true) {
            try {
                System.out.print("Input value :  ");
                a = Integer.parseInt(scanner.nextLine());
                if (a >= 0 && a <= 10) {
                    break;
                } else {
                    System.out.println("Input Number From 0  to 10");
                }
            } catch (Exception e) {
                System.out.println("Input data false");
            }
        }
        return  a;
    }

/*
  CHECK INPUT DATA
   1. String data type does not accept spaces and spaces
*/
    public String checkDataString() {
        String str;
        while (true) {
            System.out.print("Input value :  ");
            str = scanner.nextLine();
            if (!str.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Input data String ");
            }
        }

        return  str;
    }

    public String outputNumber(){
        String a;
        Pattern pattern = Pattern.compile("^\\([0-9]{3}\\) [0-9]{3} (x|ext)[0-9]{4}$");
        Pattern pattern1 = Pattern.compile("^[0-9]{1,5}$");
        Pattern pattern2 = Pattern.compile("^[a-zA-Z]{3}-[0-9]{3}-(ext|x)[0-9]{4}$");

        while (true){
            System.out.print("Input Value : ");
            a = scanner.nextLine();
            if(pattern1.matcher(a) .find() ){
                System.out.println("Value oke");
                break;
            } else {
                System.out.println("Value not oke");
            }

        }
        return a;
    }
    public String outputData(){
        String a;

        Pattern pattern2 = Pattern.compile("^[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}$");

        while (true){
            System.out.print("Input Value : ");
            a = scanner.nextLine();
            if(pattern2.matcher(a) .find() ){
                System.out.println("Value oke");
                break;
            } else {
                System.out.println("Value not oke");
            }

        }
        return a;
    }

//    CHECK INPUT PASSWORD
    public  String getPassWord(){
        String password;
        Pattern pattern = Pattern.compile("^[A-Z]+.*$"); // The first letter must be capitalized
        Pattern pattern3 = Pattern.compile("^.*[a-z]+.*$"); // Must have at least one lowercase letter character
        Pattern pattern1 = Pattern.compile("^.*[0-9]+.*$"); // Must contain at least one numeric character
        Pattern pattern4 = Pattern.compile("^.*[#?!@$%^&*-]+.*$"); // Must have at least one special character
        Pattern pattern2 = Pattern.compile("^.{8,15}$");  // password must be greater than 8 and less than 15

        while (true){
            System.out.print("Input PassWord : ");
            password = scanner.nextLine();
            if(pattern2.matcher(password) .find() && pattern.matcher(password) .find() && pattern1.matcher(password) .find() && pattern3.matcher(password) .find() && pattern4.matcher(password) .find() ){
                System.out.println("PassWord oke");
                break;
            } else {
                System.out.println("PassWord not oke");
            }

        }
        return password;
    }



}
