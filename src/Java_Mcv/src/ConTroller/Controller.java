package Java_Mcv.src.ConTroller;

import Java_Mcv.src.Model.Person;
import Java_Mcv.src.Model.Studen;
import Java_Mcv.src.Model.Teacher;
import Java_Mcv.src.Service.SrvicePerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private SrvicePerson srvicePerson = new SrvicePerson();
    private final Scanner scanner = new Scanner(System.in);
    private List<Person> list = new ArrayList<>();
    private int id = 1;
    private int id1 = 1;

    public void display() {
        int chose;
        do {
            System.out.print("""
                    ========== Chương Trình Quản Lí  ==========
                    1. Display
                    2. Create New
                    3. UpDate
                    4. Delete ID
                    5. Search By ID
                    6. ReadFile
                    7. Exit
                    """);
            chose = getChoice();
            switch (chose) {
                case 1 -> displayPerson();
                case 2 -> create();
                case 3 -> updatePerson();
                case 4 -> deleteById();
                case 5 -> searchById();
                case 6 -> readfile();
                case 7 -> System.exit(0);
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

    private void readfile() {
        srvicePerson.readfile();
    }

    //    Thêm
    private void create() {
        int choser = choicePerson();
        if (choser == 1) {
            System.out.println("Your ID is :  " + id);
            String name = getInput("Enter Name ");
            String address = getInput("Enter Address");
            int socre = Integer.parseInt(getInput("Enter Score"));
            Studen studen = new Studen(id, name, address, socre);
            list.add(studen);
            srvicePerson.nghiFile(list);
            id++;

        } else {
            System.out.println("Your ID is :  " + id1);
            String name = getInput("Enter Name ");
            int capacity = Integer.parseInt(getInput("Enter capacity"));
            list.add(new Teacher(id1, name, capacity));
            srvicePerson.nghiFile(list);
            id1++;

        }
    }

    //    Xem
    private void displayPerson() {
        int choser = choicePerson();
        srvicePerson.showPerson(choser).forEach(System.out::println);
    }

    //    Sữa
    private void updatePerson() {
        int choser = choicePerson();
        if (choser == 1) {
            int id = Integer.parseInt(getInput("Enter You ID"));
            if (srvicePerson.checkId(id, choser)){
                String name = getInput("Enter Name ");
                String address = getInput("Enter Address");
                int socre = Integer.parseInt(getInput("Enter Score"));
                Studen studen = new Studen(id, name, address, socre);
                srvicePerson.updateByIdOrFullnameStuden(id,studen);
            } else {
                System.out.println("ID You false");
            }
        } else  {
            int id = Integer.parseInt(getInput("Enter You ID"));
            if (srvicePerson.checkId(id, choser)) {
                String name = getInput("Enter Name ");
                int capacity = Integer.parseInt(getInput("Enter capacity"));
                Teacher teacher = new Teacher(id, name, capacity);
                srvicePerson.updateByIdOrFullnameTeacher(id,teacher);
            }else {
                System.out.println("ID You false");
            }
        }
    }

    //     Xóa
    private void deleteById() {
        int choser = choicePerson();
        if(choser == 1){
            int id = Integer.parseInt(getInput("Enter You ID"));
            if(srvicePerson.checkId(id,choser)){
                srvicePerson.deleleByIdOrFullname(id,1);
                System.out.println("Deleted successfully ");
            }else {
                System.out.println("ID does not exist");
            }
        }else if(choser == 2) {
            int id = Integer.parseInt(getInput("Enter You ID"));
            if(srvicePerson.checkId(id,choser)){
                srvicePerson.deleleByIdOrFullname(id,2);
                System.out.println("Deleted successfully ");
            }else {
                System.out.println("ID does not exist");
            }
        }
    }

    //    Tìm Kiếm
    private void searchById() {
        int choser = choicePerson();
        if (choser == 1) {
            int id = Integer.parseInt(getInput("Enter You ID"));
            if(srvicePerson.checkId(id,choser)){
                srvicePerson.seachrByIdOrFullnaem(id,1).forEach(System.out::println);
            }else {
                System.out.println("ID does not exist");
            }
        } else if(choser == 2) {
            int id = Integer.parseInt(getInput("Enter You ID"));
            if(srvicePerson.checkId(id,choser)){
                srvicePerson.seachrByIdOrFullnaem(id,2).forEach(System.out::println);
            }else {
                System.out.println("ID does not exist");
            }
        }
    }

}
