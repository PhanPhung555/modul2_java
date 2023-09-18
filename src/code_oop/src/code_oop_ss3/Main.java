package code_oop_ss3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        display();
    }

    public static Scanner scanner = new Scanner(System.in);
    public static ManagerCandidates managerCandidates = new ManagerCandidates();

    public static void display() {
        int chose;
        do {
            System.out.println("--------------MENU Cadidates-------------- ");
            System.out.println("Import 1. add ");
            System.out.println("Import 2. Search");
            System.out.println("import 3. show");
            System.out.println("import 4. exit");
            System.out.print("import select : ");
            chose = Integer.parseInt(scanner.nextLine());

            switch (chose) {
                case 1:
                    int chose1;
                    System.out.println("import 1. add andidates Block A");
                    System.out.println("import 2. add andidates Block B");
                    System.out.println("import 3. add andidates Block C");
                    System.out.println("import 4. exit");

                    chose1 = Integer.parseInt(scanner.nextLine());
                    switch (chose1) {
                        case 1:
                            addBlockA();
                            break;
                        case 2:
                            addBlockB();
                            break;
                        case 3:
                            addBlockC();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    System.out.print("import idnumber :  ");
                    int idnumber = Integer.parseInt(scanner.nextLine());
                    if (managerCandidates.search(idnumber) == null) System.out.println("false id ");
                    else System.out.println(managerCandidates.search(idnumber));;
                    break;
                case 3:
                    System.out.println("import 1. add andidates Block A");
                    System.out.println("import 2. add andidates Block B");
                    System.out.println("import 3. add andidates Block C");
                    System.out.println("import 4. exit");
                    int show = Integer.parseInt(scanner.nextLine());
                    managerCandidates.show(show).stream().forEach(System.out::println);
                    break;
                case 4:
                    System.exit(4);
            }
        } while (chose >= 1 && chose <= 3);
    }

    public static void addBlockA() {
        System.out.print("Import id : ");
        int idnumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Import Name : ");
        String name = scanner.nextLine();
        System.out.print("Import address : ");
        String address = scanner.nextLine();
        System.out.print("Import prioritylevel : ");
        int prioritylevel = Integer.parseInt(scanner.nextLine());
        System.out.print("Import block execution  : 1 - Block A : ");
        String maths = null;
        String chemistry = null;
        String physics = null;
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 1) {
            maths = "Maths";
            chemistry = "Chemistry";
            physics = "Physics";
        }
        CandidatesBlockA candidatesBlockA = new CandidatesBlockA(idnumber, name, address, prioritylevel, maths, chemistry, physics);
        managerCandidates.add(candidatesBlockA);
        System.out.println(candidatesBlockA);

    }

    public static void addBlockB() {
        System.out.print("Import id : ");
        int idnumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Import Name : ");
        String name = scanner.nextLine();
        System.out.print("Import address : ");
        String address = scanner.nextLine();
        System.out.print("Import prioritylevel : ");
        int prioritylevel = Integer.parseInt(scanner.nextLine());
        System.out.print("Import block execution  : 2 - Block B : ");
        String maths = null;
        String chemistry = null;
        String biology = null;
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 2) {
            maths = "Maths";
            chemistry = "Chemistry";
            biology = "Biology";
        }
        CandidatesBlockB candidatesBlockB = new CandidatesBlockB(idnumber, name, address, prioritylevel, maths, chemistry, biology);
        managerCandidates.add(candidatesBlockB);
        System.out.println(candidatesBlockB);

    }

    public static void addBlockC() {
        System.out.print("Import id : ");
        int idnumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Import Name : ");
        String name = scanner.nextLine();
        System.out.print("Import address : ");
        String address = scanner.nextLine();
        System.out.print("Import prioritylevel : ");
        int prioritylevel = Integer.parseInt(scanner.nextLine());
        System.out.print("Import block execution  : 3 - Block C : ");
        String literature = null;
        String history = null;
        String geographic = null;
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 3) {
            literature = "literature";
            history = "history";
            geographic = "geographic";
        }
        CandidatesBlockC candidatesBlockC = new CandidatesBlockC(idnumber, name, address, prioritylevel, literature, history, geographic);
        managerCandidates.add(candidatesBlockC);
        System.out.println(candidatesBlockC);

    }
}
