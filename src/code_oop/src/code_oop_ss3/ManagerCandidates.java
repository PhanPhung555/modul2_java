package code_oop_ss3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerCandidates {

    private final List<Candidates> listcadidates;

    public ManagerCandidates(List<Candidates> listcadidates) {
        this.listcadidates = listcadidates;
    }

    public ManagerCandidates() {
        this.listcadidates = new ArrayList<>();
    }

    public void add(Candidates candidates) {
        this.listcadidates.add(candidates);
    }

    ;

    public List<Candidates> show(int num) {
        if (num == 1)
            return listcadidates.stream().filter(e -> e instanceof CandidatesBlockA).collect(Collectors.toList());
        else if (num == 2)
            return listcadidates.stream().filter(e -> e instanceof CandidatesBlockB).collect(Collectors.toList());
        else
            return listcadidates.stream().filter(e -> e instanceof CandidatesBlockC).collect(Collectors.toList());
    }

    public Candidates search(int idnumber) {
        Candidates a = listcadidates.stream().filter(e -> e.getIdnumber() == idnumber).findFirst().orElse(null);
        return a;

    }
}
