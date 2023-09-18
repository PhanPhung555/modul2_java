package code_oop_ss1;

public class Engineer extends Cadres {
    private String trainingindustry;

    public Engineer(String name, int age, String sex, String address, String trainingindustry) {
        super(name, age, sex, address);
        this.trainingindustry = trainingindustry;
    }

    public Engineer(String trainingindustry) {
        this.trainingindustry = trainingindustry;
    }

    public Engineer() {
    }

    public String getTrainingindustry() {
        return trainingindustry;
    }

    public void setTrainingindustry(String trainingindustry) {
        this.trainingindustry = trainingindustry;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex='" + getSex() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", trainingindustry= '" + trainingindustry +
                '}';
    }
}
