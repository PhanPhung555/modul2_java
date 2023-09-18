package code_oop_ss3;

public class CandidatesBlockC extends Candidates{

    private String literature;
    private String history;
    private String geographic;

    public CandidatesBlockC(int idnumber, String name, String address, int prioritylevel, String literature, String history, String geographic) {
        super(idnumber, name, address, prioritylevel);
        this.literature = literature;
        this.history = history;
        this.geographic = geographic;
    }

    public CandidatesBlockC(String literature, String history, String geographic) {
        this.literature = literature;
        this.history = history;
        this.geographic = geographic;
    }

    public CandidatesBlockC() {
    }

    public String getLiterature() {
        return literature;
    }

    public void setLiterature(String literature) {
        this.literature = literature;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getGeographic() {
        return geographic;
    }

    public void setGeographic(String geographic) {
        this.geographic = geographic;
    }

    @Override
    public String toString() {
        return "CandidatesBlocA{" +
                "idnumber=" + getIdnumber() +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", prioritylevel=" + getPrioritylevel() + '\'' +
                "Block C{ " + "'literature=" + literature + '\'' +
                ", history='" + history + '\'' +
                ", geographic='" + geographic + '\'' + "} , " +
                '}';
    }
}
