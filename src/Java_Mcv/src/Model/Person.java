package Java_Mcv.src.Model;

public abstract class Person {
    private int id;
    private String naem;

    public Person(int id, String naem) {
        this.id = id;
        this.naem = naem;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", naem='" + naem + '\'' +
                '}';
    }
    abstract String toPerson();
}
