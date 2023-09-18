package code_oop_ss1;

import java.util.Scanner;

public class Worker extends Cadres {
    private int grant;


    public Worker(String name, int age, String sex, String address, int grant) {
        super(name, age, sex, address);
        this.grant = grant;
    }

    public Worker() {
    }

    public int getGrant() {
        return grant;
    }

    public void setGrant(int grant) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("import grant : ");
             grant = Integer.parseInt(scanner.nextLine());
            if (grant >= 1 && grant <= 10) {
                this.grant = grant;
                break;
            } else {
                System.out.println("please re-enter");
            }
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex='" + getSex() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", grant= '" + grant +
                '}';
    }



}
