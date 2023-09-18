package Java_Mcv.src.Service;


import Java_Mcv.src.Model.Person;
import Java_Mcv.src.Model.Studen;
import Java_Mcv.src.Model.Teacher;
import Java_Mcv.src.Repository.IrepositoryPerson;
import Java_Mcv.src.Repository.ReporitoryPerson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SrvicePerson implements IservicePerson {

    public final String PATH = "D:\\java_bt\\src\\Java_Mcv\\src\\Repository\\person.csv";

    private IrepositoryPerson irepositoryPerson = new ReporitoryPerson();

    private List<Person> arrayList = irepositoryPerson.list();

    //    Xem
    @Override
    public List<Person> showPerson(int num) {
        if (num == 1) {
            return arrayList.stream().filter(e -> e instanceof Studen).collect(Collectors.toList());
        }
        else return arrayList.stream().filter(e -> e instanceof Teacher).collect(Collectors.toList());
    }

    //  Tìm Kiếm
    @Override
    public List<Person> seachrByIdOrFullnaem(int id, int num) {
        if (num == 1) {
            return arrayList.stream().filter(e -> e instanceof Studen && e.getId() == id).collect(Collectors.toList());
        }
        return arrayList.stream().filter(e -> e instanceof Teacher && e.getId() == id).collect(Collectors.toList());
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
            nghiFile(arrayList);
        }
        if (num == 2) {
            List<Teacher> teachersToRemove = arrayList.stream()
                    .filter(e -> e instanceof Teacher && e.getId() == id)
                    .map(e -> (Teacher) e)
                    .collect(Collectors.toList());

            arrayList.removeAll(teachersToRemove);
            nghiFile(arrayList);
        }

    }

    //    Kiểm Tra ID hoặc FullName xem có đúng không
    public boolean checkId(int id, int num) {
        if (num == 1) {
            return arrayList.stream().filter(e -> e instanceof Studen).anyMatch(e -> e.getId() == id);
        }
        return arrayList.stream().filter(e -> e instanceof Teacher).anyMatch(e -> e.getId() == id);
    }

    @Override
    public void updateByIdOrFullnameStuden(int id, Studen studen) {
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

        nghiFile(arrayList);
    }

    public void updateByIdOrFullnameTeacher(int id, Teacher teacher) {
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

        nghiFile(arrayList);
    }

    //    Nghi File
    public void nghiFile(List<Person> arrayList) {

        File file = new File(PATH);

        try {
            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            arrayList.stream().forEach(e -> {
                if (e instanceof Studen) {
                    try {
                        bufferedWriter.write(e.getId() + "," + e.getNaem() + "," + ((Studen) e).getAddress() + "," + ((Studen) e).getScore());
                        bufferedWriter.newLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else if (e instanceof Teacher) {
                    try {
                        bufferedWriter.write(e.getId() + "," + e.getNaem() + "," + ((Teacher) e).getCapacity());
                        bufferedWriter.newLine();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    Đọc File
    public void readfile() {
        irepositoryPerson.readFilePerson();
    }

}

