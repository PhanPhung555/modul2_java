package java_ss12.src.testArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    //    CRUD
//    public ArrayList<Product> arrayList = new ArrayList<>();
//
//    CheckInputData checkInputData = new CheckInputData();
//
//    Scanner scanner = new Scanner(System.in);
//
//    Product product = new Product();
//
//    //    More ProductManager
//    public void moreProductManager() {
//        System.out.println("import ID Product : ");
//        String id = checkInputData.outputNumber();
//        product.setId(Integer.parseInt(id));
//
//
//        System.out.println("import data Product : " );
//        String data = checkInputData.outputData();
//        product.setData(data);
//
//        System.out.println("import information Product : ");
//        product.setInformation(scanner.nextLine());
//
//        System.out.println("import brand Product : ");
//        String brand = checkInputData.checkDataString();
//        product.setBrand(brand);
//
//        System.out.println("import quality Product : " );
//        int quality = checkInputData.dataNumber();
//        product.setQuality(quality);
//
//        arrayList.add(new Product(product.getId(), product.getData(), product.getInformation(), product.getBrand(), product.getQuality()));
//
//    }
//
//    //    Delete ProductManager
//    public void deleteProductManager() {
//        int id;
//        System.out.print("import ID Product : ");
//        id = Integer.parseInt(scanner.nextLine());
//        for (int i = 0 ; i< arrayList.size(); i++){
//            if (arrayList.get(i).getId() == id) {
//                System.out.print("information Product : " + arrayList.get(i));
//                System.out.print("Delete Product : " + arrayList.remove(i));
//            }
//        }
//    }
//
//    //    Search ProductManager
//    public void searchProductManager() {
//        int id;
//        System.out.print("import ID Product : ");
//        id = Integer.parseInt(scanner.nextLine());
//
//        arrayList.forEach(e -> {
//            if (e.getId() == id) {
//                System.out.println("your Product : " + e);
//            }
//        });
//    }
//
//    //    Edit ProductManager
//    public void editProductManager() {
//        int id;
//        System.out.print("import ID Product : ");
//        id = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (id == arrayList.get(i).getId()) {
//                System.out.println("Product : " + arrayList.get(i));
//
//                // Set Product
//                System.out.println("import ID Product : " + product.getId());
//
//
//                System.out.print("import data Product : " );
//                String data = checkInputData.outputData();
//                product.setData(data);
//
//                System.out.print("import information Product : ");
//                product.setInformation(scanner.nextLine());
//
//                System.out.print("import brand Product : " );
//                String brand = checkInputData.checkDataString();
//                product.setBrand(brand);
//
//                System.out.print("import quality Product : " );
//                int quality = checkInputData.dataNumber();
//                product.setQuality(Double.parseDouble(scanner.nextLine()));
//
//                arrayList.set(i, new Product(product.getId(), product.getData(), product.getInformation(), product.getBrand(), product.getQuality()));
//            } else {
//                System.out.println("id not found Product");
//                break;
//            }
//        }
//    }
//
//    //    Display ProductManager
//    public void displayProductManager() {
//        arrayList.forEach(e -> System.out.println(e.toString()));
//    }
//
//    //    Sort ProductManager
//    public void sortProductManager() {
//        Collections.sort(arrayList, new Product());
//        arrayList.forEach(e -> System.out.println(e.toString()));
//    }


}
