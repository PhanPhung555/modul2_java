package Java_Mcv.src.Service;

import Java_Mcv.src.Model.Person;
import Java_Mcv.src.Model.Studen;
import Java_Mcv.src.Model.Teacher;
import Java_Mcv.src.Repository.Irepository;
import Java_Mcv.src.Repository.Reporitory;

import java.util.List;
import java.util.stream.Collectors;

public class Srvice implements Iservice {

    private Irepository irepository = new Reporitory();

    private List<Person> arrayList = irepository.readFilePerson();

    @Override
    public void nghiFile(List<Person> arrayList) {
        irepository.nghiFile(arrayList);
    }

    //    Xem
    @Override
    public List<Person> show(int num) {
        if (num == 1) {
            return arrayList.stream().filter(e -> e instanceof Studen).collect(Collectors.toList());
        }
        else return arrayList.stream().filter(e -> e instanceof Teacher).collect(Collectors.toList());
    }

    //  Tìm Kiếm
    @Override
    public List<Person> seachrByIdOrFullnaem(int id  ,String name, int num) {
        if (num == 1) {
            return arrayList.stream()
                    .filter(e -> e instanceof Studen )
                    .filter(e -> e.getId() == id || e.getNaem().equals(name))
                    .collect(Collectors.toList());
        }
        return arrayList.stream()
                .filter(e -> e instanceof Teacher )
                .filter(e -> e.getId() == id || e.getNaem().equals(name))
                .collect(Collectors.toList());
    }

    //    Xóa
    @Override
    public void deleleByIdOrFullname(int id, int num) {
        if (num == 1) {
            List<Studen> studentsToRemove = arrayList.stream()
                    .filter(e -> e instanceof Studen && e.getId() == id)
                    .map(e -> (Studen) e)
                    .collect(Collectors.toList());

            arrayList.removeAll(studentsToRemove);
            irepository.nghiFile(arrayList);
        }
        if (num == 2) {
            List<Teacher> teachersToRemove = arrayList.stream()
                    .filter(e -> e instanceof Teacher && e.getId() == id)
                    .map(e -> (Teacher) e)
                    .collect(Collectors.toList());

            arrayList.removeAll(teachersToRemove);
            irepository.nghiFile(arrayList);
        }

    }

    //   Update
    @Override
    public void updateByIdOrFullname(int id, Studen studen) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (id == arrayList.get(i).getId() && arrayList.get(i) instanceof Studen) {
//                arrayList.set(i, studen);
//                nghiFile(arrayList);
//            }
//        }
        arrayList.stream()
                .filter(e -> e.getId() == id && e instanceof Studen)
                .forEach(e -> {
                    e.setId(id);
                    e.setNaem(studen.getNaem());
                    ((Studen) e).setAddress(studen.getAddress());
                    ((Studen) e).setScore(studen.getScore());
                });

        irepository.nghiFile(arrayList);
    }

    @Override
    public void updateByIdOrFullname1(int id, Teacher teacher) {
//        for (int i = 1; i < arrayList.size(); i++) {
//            if (arrayList.get(i).getId() == id && arrayList.get(i) instanceof Teacher) {
//                arrayList.set(i, teacher);
//                nghiFile(arrayList);
//            }
//        }
        arrayList.stream()
                .filter(e -> e.getId() == id && e instanceof Teacher)
                .forEach(e -> {
                    e.setId(id);
                    e.setNaem(teacher.getNaem());
                    ((Teacher) e).setCapacity(teacher.getCapacity());
                });

        irepository.nghiFile(arrayList);
    }

    //    Kiểm Tra ID hoặc FullName xem có đúng không
    public boolean checkIdorFullName(int id,String fullname, int num) {
        if (num == 1) {
            return arrayList.stream().filter(e -> e instanceof Studen).anyMatch(e -> e.getId() == id || e.getNaem().equals(fullname));
        }
        return arrayList.stream().filter(e -> e instanceof Teacher).anyMatch(e -> e.getId() == id || e.getNaem().equals(fullname));
    }


    public List<Person> listPerson(){
        return arrayList;
    }

}

