package Java_Mcv.src.Repository;

import Java_Mcv.src.Model.Person;
import Java_Mcv.src.Model.Studen;
import Java_Mcv.src.Model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reporitory implements Irepository {
    public static final String PATH = "D:\\java_bt\\src\\Java_Mcv\\src\\Repository\\person.csv";
    // Đọc File
    @Override
    public List<Person> readFilePerson() {
        File file = new File(PATH);
        List<Person> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            String[] strings;

            while ((temp = bufferedReader.readLine()) != null) {
                strings = temp.split(",");
//                String fullname = strings[0];
//                if(fullname.equals("Student")){
//                    int id = Integer.parseInt(strings[1]);
//                    String name = strings[2];
//                    String address = strings[3];
//                    int score = Integer.parseInt(strings[4]);
//                    Studen studen = new Studen(id,name,address,score);
//                    list.add(studen);
//                }else {
//                    int id = Integer.parseInt(strings[1]);
//                    String name = strings[2];
//                    int capability = Integer.parseInt(strings[3]);
//                    Teacher teacher = new Teacher(id, name, capability);
//                    list.add(teacher);
//                }
                if (strings.length == 4) {
                    int id = Integer.parseInt(strings[0]);
                    String name = strings[1];
                    String address = strings[2];
                    int score = Integer.parseInt(strings[3]);
                    Studen studen = new Studen(id,name,address,score);
                    list.add(studen);
                } else if (strings.length == 3) {
                    int id = Integer.parseInt(strings[0]);
                    String name = strings[1];
                    int capability = Integer.parseInt(strings[2]);
                    Teacher teacher = new Teacher(id, name, capability);
                    list.add(teacher);
                }
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    //    Nghi File
    public void nghiFile(List<Person> arrayList) {
        File file = new File(PATH);
        Teacher teacher = new Teacher();
        Studen studen = new Studen();
        try {
            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            arrayList.forEach(e -> {
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

}
