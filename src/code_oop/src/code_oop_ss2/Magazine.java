package code_oop_ss2;

public class Magazine extends Library {
    private int issueNumber;
    private int releaseMonth;

    public Magazine(int documentCode, String publicationName, int releaseNumber, int issueNumber, int releaseMonth) {
        super(documentCode, publicationName, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public Magazine(int issueNumber, int releaseMonth) {
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public Magazine() {
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "LibraryMagazine{" +
                "documentCode=" + getDocumentCode() +
                ", publicationName='" + getPublicationName() + '\'' +
                ", releaseNumber=" + getReleaseNumber() +  '\'' +
                ", issueNumber= " +issueNumber  +  '\'' +
                ", releaseMonth= " + releaseMonth  +  '\'' +
                '}';
    }
}
