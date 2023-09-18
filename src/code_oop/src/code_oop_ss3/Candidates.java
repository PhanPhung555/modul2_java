package code_oop_ss3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Candidates {
    private  int idnumber;
    private String name;
    private String address;
    private int prioritylevel;


    public Candidates(int idnumber, String name, String address, int prioritylevel) {
        this.idnumber = idnumber;
        this.name = name;
        this.address = address;
        this.prioritylevel = prioritylevel;
    }

    public Candidates() {
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
       this.idnumber = idnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrioritylevel() {
        return prioritylevel;
    }

    public void setPrioritylevel(int prioritylevel) {
        this.prioritylevel = prioritylevel;
    }


    @Override
    public String toString() {
        return "Candidates{" +
                "idnumber=" + idnumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", prioritylevel=" + prioritylevel +
                '}';
    }
}
