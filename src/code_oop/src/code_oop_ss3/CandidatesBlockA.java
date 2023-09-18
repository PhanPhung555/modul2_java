package code_oop_ss3;

public class CandidatesBlockA extends Candidates {
    private String maths;
    private String physics;
    private String chemistry;

    public CandidatesBlockA(int idnumber, String name, String address, int prioritylevel, String maths, String physics, String chemistry) {
        super(idnumber, name, address, prioritylevel);
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public CandidatesBlockA(String maths, String physics, String chemistry) {
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public CandidatesBlockA() {
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "CandidatesBlockA{" +
                "idnumber=" + getIdnumber() +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", prioritylevel=" + getPrioritylevel() + '\'' +
                "Block A{ " + "'maths=" + maths + '\'' +
                ", physics='" + physics + '\'' +
                ", chemistry='" + chemistry + '\'' + "} , " +
                '}';
    }
}
