package code_oop_ss2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static ManagementBook managementBook = new ManagementBook();

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
            System.out.println("import 4. Delete ");
            System.out.println("import 5. exit ");
            System.out.print("import select : ");
            chose = Integer.parseInt(scanner.nextLine());

            switch (chose) {
                case 1:
                    int chose1;
                    System.out.println("import 1 : Book");
                    System.out.println("import 2 : Magazine");
                    System.out.println("import 3 : Newspaper");
                    System.out.println("import 4. exit");
                    System.out.print("import select : ");
                    chose1 = Integer.parseInt(scanner.nextLine());

                    switch (chose1) {
                        case 1:
                            addBook();
                            break;
                        case 2:
                            addMagazine();
                            break;
                        case 3:
                            addNewspaper();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter 1 to search book");
                    System.out.println("Enter 2 to search newspaper");
                    System.out.println("Enter 3 to search Magazine ");
                    int choise = Integer.parseInt(scanner.nextLine());

                    if (choise == 1) managementBook.search(choise).forEach(System.out::println);
                    else if(choise == 2) managementBook.search(choise).forEach(System.out::println);
                    else managementBook.search(choise).forEach(System.out::println);
                    break;
                case 3:
                    managementBook.show().forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Enter code : ");
                    int code = Integer.parseInt(scanner.nextLine());
                    managementBook.removeBook(code);
                    break;
                case 5:
                    System.exit(5);
            }
        } while (chose >= 1 && chose <= 5);
    }


    public static void addBook() {

        System.out.print("Enter documentCode : ");
        int documentCode = Integer.parseInt( scanner.nextLine());
        System.out.print("Enter publicationName : ");
        String publicationName = scanner.nextLine();
        System.out.print("Enter releaseNumber : ");
        int releaseNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter nameAuthor");
        String nameAuthor = scanner.nextLine();
        System.out.print("Enter numberPages");
        int numberPages = Integer.parseInt(scanner.nextLine());

        Book book = new Book(documentCode, publicationName, releaseNumber, nameAuthor, numberPages);
        managementBook.add(book);
        System.out.println(book.toString());


    }

    public static void addMagazine() {

        System.out.print("Enter documentCode : ");
        int documentCode = Integer.parseInt( scanner.nextLine());

        System.out.print("Enter publicationName : ");
        String publicationName = scanner.nextLine();

        System.out.print("Enter releaseNumber : ");
        int releaseNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter issueNumber : ");
        int issueNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter releaseMonth : ");
        int releaseMonth = Integer.parseInt(scanner.nextLine());

        Magazine magazine = new Magazine(documentCode, publicationName, releaseNumber, issueNumber, releaseMonth);
        managementBook.add(magazine);
        System.out.println(magazine.toString());
    }

    public static void addNewspaper() {

        System.out.print("Enter documentCode : ");
        int documentCode = Integer.parseInt( scanner.nextLine());

        System.out.print("Enter publicationName : ");
        String publicationName = scanner.nextLine();

        System.out.print("Enter releaseNumber : ");
        int releaseNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter releaseDate : ");
        int releaseDate = Integer.parseInt(scanner.nextLine());

        Newspaper newspaper = new Newspaper(documentCode, publicationName, releaseNumber, releaseDate);
        managementBook.add(newspaper);
        System.out.println(newspaper.toString());
    }


}
