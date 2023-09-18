package code_oop_ss2;

public class Library {
    private int documentCode;
    private String publicationName;
    private int releaseNumber;

    public Library(int documentCode, String publicationName, int releaseNumber) {
        this.documentCode = documentCode;
        this.publicationName = publicationName;
        this.releaseNumber = releaseNumber;
    }

    public Library() {
    }

    public int getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(int documentCode) {
        this.documentCode = documentCode;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Library{" +
                "documentCode=" + documentCode +
                ", publicationName='" + publicationName + '\'' +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
