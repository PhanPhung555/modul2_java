package Java_Mcv.src.Repository;

import Java_Mcv.src.Model.Person;
import Java_Mcv.src.Model.Studen;
import Java_Mcv.src.Model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReporitoryPerson implements IrepositoryPerson {
    public static final String PATH = "D:\\java_bt\\src\\Java_Mcv\\src\\Repository\\person.csv";
    List<Person> list = new ArrayList<>();

    // Đọc File
    @Override
    public void readFilePerson() {
        File file = new File(PATH);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            String[] strings;

            while ((temp = bufferedReader.readLine()) != null) {
                strings = temp.split(",");
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
    }

    @Override
    public List<Person> list() {
        return list;
    }
}
