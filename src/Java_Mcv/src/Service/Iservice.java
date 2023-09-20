package Java_Mcv.src.Service;

import Java_Mcv.src.Model.Person;
import Java_Mcv.src.Model.Studen;
import Java_Mcv.src.Model.Teacher;
import java.util.List;

public interface Iservice {

    void nghiFile(List<Person> arrayList);

    //    CRUD
    List<Person> show(int num);

    List<Person> seachrByIdOrFullnaem(int id ,String naem, int num);

    void deleleByIdOrFullname(int id , int num);

    void updateByIdOrFullname(int id, Studen studen);
    void updateByIdOrFullname1(int id, Teacher teacher);

}
