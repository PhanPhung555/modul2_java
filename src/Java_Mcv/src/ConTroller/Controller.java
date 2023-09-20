package Java_Mcv.src.ConTroller;

import Java_Mcv.src.Model.Person;
import Java_Mcv.src.Model.Studen;
import Java_Mcv.src.Model.Teacher;
import Java_Mcv.src.Service.Srvice;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Controller {
    private final Srvice srvicePerson = new Srvice();
    private final Scanner scanner = new Scanner(System.in);
    private final List<Person> list = srvicePerson.listPerson();

    public void display() {
        int chose;
        do {
            System.out.print("""
                    ========== Chương Trình Quản Lí  ==========
                    1. Display
                    2. Create New
                    3. UpDate
                    4. Delete ID
                    5. Search By ID Or FullName\040
                    6. Exit
                    """);
            chose = getChoice();
            switch (chose) {
                case 1 -> displayPerson();
                case 2 -> create();
                case 3 -> updatePerson();
                case 4 -> deleteById();
                case 5 -> searchByIdOrFullName();
                case 6 -> System.exit(0);

            }
        } while (chose >= 0 && chose <= 6);
    }

    private String getInput(String str) {
        System.out.print(str + " : ");
        return scanner.nextLine();
    }

    private int getChoice() {
        System.out.print("Enter your choice:");
        return Integer.parseInt(scanner.nextLine());
    }

    private int choicePerson() {
        System.out.print("""
                1. Student
                2. Teacher
                """);
        return getChoice();
    }

    private int choiceIdOrFullname() {
        System.out.print("""
                1. Seachr-ID
                2. Seachr-Fullname
                """);
        return getChoice();
    }

    //    Lấy Id cuối cùng của đối tượng - Id tự tăng
    private int getLastId(Class<?> targetType) {
        int id = 1;
        Optional<Integer> lastIdOptional = list.stream()
                .filter(targetType::isInstance)
                .map(Person::getId)
                .reduce((first, second) -> second);
        if (lastIdOptional.isPresent()) {
            id = lastIdOptional.get() + 1;
        }
        return id;
    }

    //    Thêm
    private void create() {
        int choser = choicePerson();
        if (choser == 1) {
            System.out.println("Your ID is :  " + getLastId(Studen.class));
            String name = getInput("Enter Name ");
            String address = getInput("Enter Address");
            int socre = Integer.parseInt(getInput("Enter Score"));
            Studen studen = new Studen(getLastId(Studen.class), name, address, socre);
            list.add(studen);
        } else {
            System.out.println("Your ID is :  " + getLastId(Teacher.class));
            String name = getInput("Enter Name ");
            int capacity = Integer.parseInt(getInput("Enter capacity"));
            list.add(new Teacher(getLastId(Teacher.class), name, capacity));
        }
        srvicePerson.nghiFile(list);
    }

    //    Xem
    private void displayPerson() {
        int choser = choicePerson();
        srvicePerson.show(choser).forEach(System.out::println);
    }

    //    Sữa
    private void updatePerson() {
        int choser = choicePerson();
        if (choser == 1) {
            int id = Integer.parseInt(getInput("Enter You ID"));
            if (srvicePerson.checkIdorFullName(id, "", choser)) {
                String name = getInput("Enter Name ");
                String address = getInput("Enter Address");
                int socre = Integer.parseInt(getInput("Enter Score"));
                Studen studen = new Studen(id, name, address, socre);
                srvicePerson.updateByIdOrFullname(id, studen);
            } else {
                System.out.println("ID You false");
            }
        } else {
            int id = Integer.parseInt(getInput("Enter You ID"));
            if (srvicePerson.checkIdorFullName(id, "", choser)) {
                String name = getInput("Enter Name ");
                int capacity = Integer.parseInt(getInput("Enter capacity"));
                Teacher teacher = new Teacher(id, name, capacity);
                srvicePerson.updateByIdOrFullname1(id, teacher);
            } else {
                System.out.println("ID You false");
            }
        }
    }

    //     Xóa
    private void deleteById() {
        int choser = choicePerson();
        if (choser == 1) {
            int id = Integer.parseInt(getInput("Enter You ID"));
            if (srvicePerson.checkIdorFullName(id, "", choser)) {
                srvicePerson.deleleByIdOrFullname(id, 1);
                System.out.println("Deleted successfully ");
            } else {
                System.out.println("ID does not exist");
            }
        } else if (choser == 2) {
            int id = Integer.parseInt(getInput("Enter You ID"));
            if (srvicePerson.checkIdorFullName(id, "", choser)) {
                srvicePerson.deleleByIdOrFullname(id, 2);
                System.out.println("Deleted successfully ");
            } else {
                System.out.println("ID does not exist");
            }
        }
    }

    //    Tìm Kiếm
//    private void searchByIdOrFullName1() {
//        int choser = choicePerson();
//        if (choser == 1) {
//            int choice = choiceIdOrFullname();
//            if (choice == 1) {
//                int id = Integer.parseInt(getInput("Enter You ID"));
//                if (srvicePerson.checkIdorFullName(id, "", choice)) {
//                    srvicePerson.seachrByIdOrFullnaem(id, "", choice).forEach(System.out::println);
//                } else {
//                    System.out.println("ID does not exist");
//                }
//            } else {
//                String fullname = getInput("Enter You FullName");
//                if (srvicePerson.checkIdorFullName(0, fullname, 1)) {
//                    srvicePerson.seachrByIdOrFullnaem(0, fullname, 1).forEach(System.out::println);
//                } else {
//                    System.out.println("FullName does not exist");
//                }
//            }
//        } else if (choser == 2) {
//            int choice = choiceIdOrFullname();
//            if (choice == 1) {
//                int id = Integer.parseInt(getInput("Enter You ID"));
//                if (srvicePerson.checkIdorFullName(id, "", 2)) {
//                    srvicePerson.seachrByIdOrFullnaem(id, "", 2).forEach(System.out::println);
//                } else {
//                    System.out.println("ID does not exist");
//                }
//            } else {
//                String fullname = getInput("Enter You FullName");
//                if (srvicePerson.checkIdorFullName(0, fullname, 2)) {
//                    srvicePerson.seachrByIdOrFullnaem(0, fullname, 2).forEach(System.out::println);
//                } else {
//                    System.out.println("FullName does not exist");
//                }
//            }
//        }
//    }
    private void searchByIdOrFullName() {
        int choser = choicePerson();
        if (choser == 1 || choser == 2) {
            int choice = choiceIdOrFullname();
            int id = 0;
            String fullname = "";

            if (choice == 1) {
                id = Integer.parseInt(getInput("Enter Your ID"));
            } else {
                fullname = getInput("Enter Your FullName");
            }

            if (srvicePerson.checkIdorFullName(id, fullname, choser)) {
                srvicePerson.seachrByIdOrFullnaem(id, fullname, choser).forEach(System.out::println);
            } else {
                if (choice == 1) {
                    System.out.println("ID does not exist");
                } else {
                    System.out.println("FullName does not exist");
                }
            }
        }
    }
}
