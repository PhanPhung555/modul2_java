package code_oop_ss2;

public class Book extends Library {

    private String nameAuthor;
    private int numberPages;

    public Book(int documentCode, String publicationName, int releaseNumber, String nameAuthor, int numberPages) {
        super(documentCode, publicationName, releaseNumber);
        this.nameAuthor = nameAuthor;
        this.numberPages = numberPages;
    }

    public Book(String nameAuthor, int numberPages) {
        this.nameAuthor = nameAuthor;
        this.numberPages = numberPages;
    }

    public Book() {
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
    @Override
    public String toString() {
        return "LibraryBook{" +
                "documentCode=" + getDocumentCode() +
                ", publicationName='" + getPublicationName() + '\'' +
                ", releaseNumber=" + getReleaseNumber() +  '\'' +
                ", naemAuthor= " +nameAuthor  +  '\'' +
                ", numberPages= " + nameAuthor  +  '\'' +
                '}';
    }
}
