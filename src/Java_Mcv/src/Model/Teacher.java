package Java_Mcv.src.Model;

public class Teacher extends Person {
    private int capacity;

    public Teacher(int id, String naem, int capacity) {
        super(id, naem);
        this.capacity = capacity;
    }

    public Teacher() {
    }

    public Teacher(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                "capacity=" + capacity +
                '}';
    }

    @Override
    public String toPerson() {
        return String.format("Teacher");
    }
}
