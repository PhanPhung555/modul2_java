package code_oop_ss1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static ManagerOfficer managerOfficer = new ManagerOfficer();


    public static void main(String[] args) {
        display();
    }

    public static void display() {
        int chose;
        do {
            System.out.println("MENU Cadres ");
            System.out.println("Import 1. add ");
            System.out.println("Import 2. Search");
            System.out.println("import 3. show");
            System.out.println("import 4. exit");
            System.out.print("import select : ");
            chose = Integer.parseInt(scanner.nextLine());

            switch (chose) {
                case 1:
                    int chose1;
                    System.out.println("import 1 : Worker");
                    System.out.println("import 2 : Engineer");
                    System.out.println("import 3 : Staff");
                    System.out.println("import 4. exit");
                    System.out.print("import select : ");
                    chose1 = Integer.parseInt(scanner.nextLine());

                    switch (chose1) {
                        case 1:
                            addWorker();
                            break;
                        case 2:
                            addEngineer();
                            break;
                        case 3:
                            addStaff();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter naem : ");
                    String name = scanner.nextLine();
                    managerOfficer.searchListCadress(name);
                    break;
                case 3:
                    managerOfficer.showListInforCadress();
                    break;
                case 4:
                    System.exit(4);
            }
        } while (chose >= 1 && chose <= 3);
    }


    public static ArrayList<Cadres> arrayList = new ArrayList<>();

    public static void addWorker() {

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter sex: ");
        String sex = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter brant: ");
        int brant = Integer.parseInt(scanner.nextLine());

        Cadres worker = new Worker(name, age, sex, address, brant);
        managerOfficer.add(worker);
        System.out.println(worker.toString());
    }

    public static void addEngineer() {

        System.out.print("Enter name : ");;
        String name = scanner.nextLine();

        System.out.print("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter sex: ");
        String sex = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter trainingindustry: ");
        String trainingindustry = scanner.nextLine();

        Cadres engineer = new Engineer(name, age, sex, address, trainingindustry);
        managerOfficer.add(engineer);
        System.out.println(engineer.toString());
    }

    public static void addStaff() {

        System.out.print("Enter name : ");;
        String name = scanner.nextLine();

        System.out.print("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter sex: ");
        String sex = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter job: ");
        String job = scanner.nextLine();

        Cadres staff = new Staff(name, age, sex, address, job);
        managerOfficer.add(staff);
        System.out.println(staff.toString());
    }



}
