package code_oop_ss3;

public class CandidatesBlockB extends Candidates {

    private String maths ;
    private String chemistry;
    private String biology ;

    public CandidatesBlockB(int idnumber, String name, String address, int prioritylevel, String maths, String chemistry, String biology) {
        super(idnumber, name, address, prioritylevel);
        this.maths = maths;
        this.chemistry = chemistry;
        this.biology = biology;
    }

    public CandidatesBlockB(String maths, String chemistry, String biology) {
        this.maths = maths;
        this.chemistry = chemistry;
        this.biology = biology;
    }

    public CandidatesBlockB() {
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getBiology() {
        return biology;
    }

    public void setBiology(String biology) {
        this.biology = biology;
    }

    @Override
    public String toString() {
        return "CandidatesBlocB{" +
                "idnumber=" + getIdnumber() +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", prioritylevel=" + getPrioritylevel() + '\'' +
                "Block B{ " + "'maths=" + maths + '\'' +
                ", biology='" + biology + '\'' +
                ", chemistry='" + chemistry + '\'' + "} , " +
                '}';
    }
}
