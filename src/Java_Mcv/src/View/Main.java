package Java_Mcv.src.View;

import Java_Mcv.src.ConTroller.Controller;
import Java_Mcv.src.Service.Srvice;

import java.util.Scanner;


public class Main {
    private static final Srvice srvicePerson = new Srvice();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.display();
    }


}
