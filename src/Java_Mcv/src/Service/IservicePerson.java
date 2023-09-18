package Java_Mcv.src.Service;

import Java_Mcv.src.Model.Person;
import Java_Mcv.src.Model.Studen;

import java.util.List;

public interface IservicePerson {

    //    CRUD
    List<Person> showPerson(int num);

    List<Person> seachrByIdOrFullnaem(int id, int num);

    void deleleByIdOrFullname(int id , int num);

    void updateByIdOrFullnameStuden(int id, Studen studen);
}
