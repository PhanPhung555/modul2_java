package Java_Mcv.src.Model;

public class Studen extends Person {
    private String address;
    private int score;

    public Studen(int id, String naem, String address, int score) {
        super(id, naem);
        this.address = address;
        this.score = score;
    }

    public Studen() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Studen{" +
                super.toString() +
                "address='" + address + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public String toPerson() {
        return String.format("Student");
    }
}
