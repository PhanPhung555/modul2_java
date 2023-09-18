package code_oop_ss2;

import java.util.Scanner;

public class Newspaper extends Library{
    private int releaseDate;

    public Newspaper(int documentCode, String publicationName, int releaseNumber, int releaseDate) {
        super(documentCode, publicationName, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public Newspaper(int releaseDate) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter day 1 to 30 ");
            releaseDate = Integer.parseInt(scanner.nextLine());
            if(releaseDate >= 1 && releaseDate <= 30){
                this.releaseDate = releaseDate;
                break;
            }else {
                System.out.println("Invalid date !");
            }
        }
    }

    public Newspaper() {
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "LibraryNewspaper{" +
                "documentCode=" + getDocumentCode() +
                ", publicationName='" + getPublicationName() + '\'' +
                ", releaseNumber=" + getReleaseNumber() +  '\'' +
                ", releaseDate= " + releaseDate  +  '\'' +

                '}';
    }
}
