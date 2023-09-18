package code_oop_ss1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagerOfficer {

    private final List<Cadres> cadresList;

    public ManagerOfficer(List<Cadres> cadresList) {
        this.cadresList = cadresList;
    }

    public ManagerOfficer() {
        this.cadresList = new ArrayList<>();
    }

    public void add(Cadres cadres) {
        this.cadresList.add(cadres);
    }

    public void searchListCadress(String name) {
        cadresList.forEach(e -> {
            if (e.getName().equals(name)) {
                System.out.println(e);
            }
        });
    }



    public void showListInforCadress() {
        this.cadresList.forEach(o -> System.out.println(o.toString()));
    }
}
