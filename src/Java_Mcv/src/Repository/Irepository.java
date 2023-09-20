package Java_Mcv.src.Repository;

import Java_Mcv.src.Model.Person;

import java.util.ArrayList;
import java.util.List;

public interface Irepository {

    List<Person> readFilePerson();

    void nghiFile(List<Person> arrayList);
}
