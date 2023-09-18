package myArraylist;

public class Person {
    String name;
    int Age;

    public Person(String name, int age) {
        this.name = name;
        Age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "myArraylist.Main.Person{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
//            myArraylist.Main.Person person = (myArraylist.Main.Person) obj;
        return this.name.equals(((Person) obj).name)
                && this.Age == ((Person) obj).Age;
    }
}
