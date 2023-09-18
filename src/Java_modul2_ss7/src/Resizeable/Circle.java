package Resizeable;

import java.util.Random;

public class Circle implements Resizeable {
    private double isnum;

    public Circle() {
    }

    public Circle(double isnum) {
        this.isnum = isnum;
    }

    public double getIsnum() {
        return isnum;
    }

    public void setIsnum(double isnum) {
        this.isnum = isnum;
    }

    @Override
    public double resize(double isnum) {
        for (int i = 0; i < 1; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            isnum += num;

        }
        return isnum;
    }
}
