package code_oop_ss1;

public class Staff extends Cadres{
    private String job;

    public Staff(String name, int age, String sex, String address, String job) {
        super(name, age, sex, address);
        this.job = job;
    }

    public Staff(String job) {
        this.job = job;
    }

    public Staff() {
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex='" + getSex() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", trainingindustry= '" + job +
                '}';
    }
}
