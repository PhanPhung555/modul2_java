package code_oop_ss2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagementBook {

    private final ArrayList<Library> arrayList;


    public ManagementBook(ArrayList<Library> arrayList) {
        this.arrayList = arrayList;
    }

    public ManagementBook() {
        this.arrayList = new ArrayList<>();
    }

    public void add(Library library) {
        this.arrayList.add(library);
    }

    public ArrayList<Library> show() {
        return arrayList;
    }

    public void removeBook(int documentCode) {
        arrayList.removeIf(e -> e.getDocumentCode() == documentCode);
        arrayList.stream().filter(e -> e.getDocumentCode() != documentCode).forEach(e -> System.out.println("code false"));

//
//      Library doc = this.arrayList.stream().filter(e -> e.getDocumentCode() == documentCode).findFirst().orElse(null);
//
//        if (doc == null) {
//            return false;
//        }
//        this.arrayList.remove(doc);
//
//        return true;
    }


    public List<Library> search(int num) {
        if (num == 1) {
            /* arr.stream() - cung cấp các phương thức
            filter() duyệt qua các phần tử tròn arr và e chính là các phần tử ấy
            e instanceof Book là phần tử thuộc lớp Book
            .collect(Collectors.toList()) lấy tất cả các phần tử thuộc lớp book truyền vào lại arraylist để hiển thị thông tin
            */
            return arrayList.stream().filter(e -> e instanceof Book).collect(Collectors.toList());
        } else if (num == 2) {
            return arrayList.stream().filter(e -> e instanceof Magazine).collect(Collectors.toList());
        } else {
            return arrayList.stream().filter(e -> e instanceof Newspaper).collect(Collectors.toList());
        }
    }


}
